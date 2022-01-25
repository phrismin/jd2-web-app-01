package by.academy.controller.impl;


import by.academy.controller.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("SIGN UP");

        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("psw");
        System.out.println(login + " " + email + " " + password);

        boolean flag = false; //stub
        String errorMessage = "Please, check your login, email and password";
        String regInfo = "Registration is successful";

        if (flag) {
            resp.sendRedirect("controller?command=GO_TO_MAIN_PAGE&registrationInfo="
                    + regInfo);
        } else {
            resp.sendRedirect("controller?command=GO_TO_REGISTRATION_PAGE&errorMessage="
                    + errorMessage);
        }
    }
}

