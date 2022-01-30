package by.academy.controller.impl;


import by.academy.controller.Command;
import by.academy.dao.entity.CarClass;
import by.academy.service.CarClassService;
import by.academy.service.ServiceFactory;
import by.academy.service.UserService;
import by.academy.service.exception.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LogInCommand implements Command {
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String USER_NAME = "userName";
    private static final String ERROR_MESSAGE = "Please, check your login, email and password";
    private static final String ADMIN = "admin";
    private static final String MANAGER = "manager";
    private static final String CUSTOMER = "customer";
    private static final String ROLE = "role";
    private static final String CAR_CLASSES = "carClass=budget&carClass=middle&carClass=business" +
            "&carClass=premium&carClass=suv&carClass=convertible&carClass=exclusive";

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

            if (ADMIN.equals(role)) {
                session.setAttribute(ROLE, ADMIN);
            } else if (MANAGER.equals(role)) {
                session.setAttribute(ROLE, MANAGER);
            } else if (CUSTOMER.equals(role)) {
                session.setAttribute(ROLE, CUSTOMER);
            } else {
                resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE&" +
                        "errorMessage=" + ERROR_MESSAGE);
            }

            CarClassService carClassService = serviceFactory.getCarClassService();
            Map<String, String> mapCarClasses = carClassService.findAllCarClass();
            req.setAttribute("mapCar", mapCarClasses);

            req.getRequestDispatcher("controller?command=GO_TO_MAIN_PAGE").forward(req, resp);

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_ERROR_PAGE");
        }
    }
}

