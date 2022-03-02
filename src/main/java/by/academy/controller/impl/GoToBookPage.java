package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToBookPage implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        System.out.println("GoToBookPage");

        req.getRequestDispatcher("/WEB-INF/jsp/bookingPage.jsp").forward(req, resp);
    }
}
