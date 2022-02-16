package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToAuthorizationPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToAuthorizationPage");

        req.getRequestDispatcher("/WEB-INF/jsp/authorization.jsp").forward(req, resp);
    }
}