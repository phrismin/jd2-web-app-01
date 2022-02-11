package by.academy.controller.impl;


import by.academy.controller.Command;
import by.academy.service.CarClassService;
import by.academy.service.ServiceFactory;
import by.academy.service.UserService;
import by.academy.service.exception.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static by.academy.dao.entity.Role.CUSTOMER;

public class SignUpCommand implements Command {
    private static final String ERROR_MESSAGE = "Please, check your data";
    private static final String REGISTRATION_INFO = "Registration is successful";
    private static final String CAR_CLASSES = "carClasses";
    private static final String USER_NAME = "userName";
    private static final String ROLE = "role";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("SIGN UP");

        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String passpName = req.getParameter("passpName");
        String passpSurname = req.getParameter("passpSurname");
        String passpPatronymic = req.getParameter("passpPatronymic");
        String passpDateBirth = req.getParameter("passpDateBirth");
        String passpDateIssue = req.getParameter("passpDateIssue");
        String passpNumber = req.getParameter("passpNumber");
        String drivLicDateIssue = req.getParameter("drivLicDateIssue");
        String drivLicSerialNumber = req.getParameter("drivLicSerialNumber");
        String drivLicCategory = req.getParameter("drivLicCategory");
        System.out.println(login + " " + email + " " + password + " " + passpName + " "
                + passpSurname + " " + passpPatronymic + " " + passpDateBirth + " "
                + passpDateIssue + " " + passpNumber + " " + drivLicDateIssue + " "
                + drivLicSerialNumber + " " + drivLicCategory);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        try {
            userService.registration(login, password, email, passpName, passpSurname,
                    passpPatronymic, passpDateBirth, passpDateIssue, passpNumber,
                    drivLicDateIssue, drivLicSerialNumber, drivLicCategory);

            HttpSession session = req.getSession();
            session.setAttribute(USER_NAME, login);
            final String customer = CUSTOMER.getRoleName();
            session.setAttribute(ROLE, customer);

            req.setAttribute(ROLE, CUSTOMER);

            CarClassService carClassService = serviceFactory.getCarClassService();
            List<String> allCarClass = carClassService.findAllCarClass();
            req.setAttribute(CAR_CLASSES, allCarClass);

            req.getRequestDispatcher("controller?command=GO_TO_MAIN_PAGE&registrationInfo="
                    + REGISTRATION_INFO).forward(req, resp);

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_REGISTRATION_PAGE&errorMessage="
                    + ERROR_MESSAGE);
        }
    }
}

