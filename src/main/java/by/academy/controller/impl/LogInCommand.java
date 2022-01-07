package by.academy.controller.impl;


import by.academy.controller.Command;
import by.academy.service.ServiceFactory;

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

        boolean flag = true; //stub
        String userName = "Vasyl";
        String errorMessage = "Please, check your login, email and password";
        String logInfo = "Hello";
        String role;

        ServiceFactory factory = new ServiceFactory();

//
//        try {
//
//        }

        HttpSession session = req.getSession();
        session.setAttribute("userName", userName);
        session.setAttribute("role", "user");

        if (flag) {
            resp.sendRedirect("controller?command=GO_TO_MAIN_PAGE&" +
                    "loginationInfo=" + logInfo);
        } else {
            resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE&" +
                    "errorMessage=" + errorMessage);
        }
    }
}

