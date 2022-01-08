package by.academy.controller.impl;


import by.academy.controller.Command;
import by.academy.service.ServiceFactory;
import by.academy.service.UserService;
import by.academy.service.exception.ServiceException;
import by.academy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogInCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LOG IN");

        String login = req.getParameter("login");
        String password = req.getParameter("psw");
        System.out.println(login + " " + password);

        String userName = "Vasyl";
        String errorMessage = "Please, check your login, email and password";
        String logInfo = "Hello";
        String role;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();

        try {
            role = userService.authorization(login, password);

            HttpSession session = req.getSession();
            if ("".equals(role)) {
                session.setAttribute("userName", userName);
                session.setAttribute("role", role);
                resp.sendRedirect("controller?command=GO_TO_MAIN_PAGE&" +
                        "loginationInfo=" + logInfo);
            } else {
                resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE&" +
                        "errorMessage=" + errorMessage);
            }

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE&" +
                    "errorMessage=" + errorMessage);
        }
    }
}

