package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.UserDAO;
import by.academy.entity.Role;
import by.academy.dao.exception.DAOException;
import by.academy.entity.User;
import by.academy.service.exception.ServiceException;
import by.academy.service.UserService;
import org.mindrot.jbcrypt.BCrypt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {
    private final Pattern PATTERN_DATE = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public String authorization(String login, String password) throws ServiceException {
        if (!validationLogin(login)) {
            throw new ServiceException("Please, check your login");
        }

        if (!validationPassword(login)) {
            throw new ServiceException("Please, check your password");
        }

        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();

        User user;
        try {
            user = userDAO.authorization(login, password);
        } catch (DAOException e) {
            throw new ServiceException("Authorization exception");
        }

        return user.getRole().toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean registration(String login, String password, String email, String passpName,
                                String passpSurname, String passpPatronymic, String passpDateBirth,
                                String passpDateIssue, String passpNumber, String drivLicDateIssue,
                                String drivLicSerialNumber, String drivLicCategory) throws ServiceException {

        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt(5));

        if (!isValidateDate(passpDateBirth)) {
            throw new ServiceException("Passport birth date is invalid");
        }
        if (!isValidateDate(passpDateIssue)) {
            throw new ServiceException("Passport issue date is invalid");
        }
        if (!isValidateDate(drivLicDateIssue)) {
            throw new ServiceException("Driver license date birth is invalid");
        }

        LocalDate lcPasspDateBirth = LocalDate.parse(passpDateBirth, FORMATTER);
        LocalDate lcPasspDateIssue = LocalDate.parse(passpDateIssue, FORMATTER);
        LocalDate lcDrivLicDateIssue = LocalDate.parse(drivLicDateIssue, FORMATTER);

        String roleName = Role.CUSTOMER.getRoleName();

        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();

        try {
            userDAO.registration(login, hashPassword, roleName, email, passpName, passpSurname, passpPatronymic,
                    lcPasspDateBirth, lcPasspDateIssue, passpNumber, lcDrivLicDateIssue, drivLicSerialNumber,
                    drivLicCategory);

        } catch (DAOException e) {
            throw new ServiceException("Impossibly Registration user");
        }

        return true;
    }

    @Override
    public boolean isExistUser(String login, String password) throws ServiceException {
        return false;
    }

    private boolean validationLogin(String login) {
        return true;
    }

    private boolean validationPassword(String password) {
        return true;
    }

    private boolean validationEmail(String email) {
        return true;
    }

    private boolean isValidateDate(String date) {
        Matcher matcher = PATTERN_DATE.matcher(date);
        return matcher.matches();
    }
}
