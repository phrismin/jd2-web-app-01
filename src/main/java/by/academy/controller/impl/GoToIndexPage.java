package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToIndexPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToIndexPage");

        req.getRequestDispatcher("/WEB-INF/jsp/helloPage.jsp").forward(req, resp);
    }
}
