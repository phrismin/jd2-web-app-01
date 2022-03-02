package by.academy.controller.impl;


import by.academy.controller.Command;
import by.academy.service.ServiceFactory;
import by.academy.service.UserService;
import by.academy.service.exception.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static by.academy.entity.Role.*;

public class LogInCommand implements Command {
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String USER_NAME = "userName";
    private static final String ERROR_MESSAGE = "Please, check your login, email and password";
    private static final String ROLE = "role";
    private static final String CAR_CLASSES = "carClasses";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LOG IN");

        String login = req.getParameter(LOGIN);
        String password = req.getParameter(PASSWORD);
        System.out.println(login + " " + password);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        try {
            String role = userService.authorization(login, password);

            HttpSession session = req.getSession();
            session.setAttribute(USER_NAME, login);

            String admin = ADMIN.getRoleName();
            String manager = MANAGER.getRoleName();
            String customer = CUSTOMER.getRoleName();

            if (admin.equals(role)) {
                session.setAttribute(ROLE, admin);
            } else if (manager.equals(role)) {
                session.setAttribute(ROLE, manager);
            } else if (customer.equals(role)) {
                session.setAttribute(ROLE, customer);
            } else {
                resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE&" +
                        "errorMessage=" + ERROR_MESSAGE);
            }

            resp.sendRedirect("controller?command=GO_TO_MAIN_PAGE");

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_ERROR_PAGE");
        }
    }
}

