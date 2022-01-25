package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;
import by.academy.entity.Role;
import by.academy.entity.User;
import by.academy.service.exception.ServiceException;
import by.academy.service.UserService;

import java.util.Locale;
import java.util.Optional;

public class UserServiceImpl implements UserService {

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

        Optional<User> userOptional;
        try {
            userOptional = userDAO.authorization(login, password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        userOptional.orElseThrow(() -> new ServiceException("User isn't exist"));
        Role userRole = userOptional.get().getUserRole();

        return userRole.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean registration(String login, String password, String email) {

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
}
