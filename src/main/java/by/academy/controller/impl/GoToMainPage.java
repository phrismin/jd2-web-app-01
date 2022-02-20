package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToMainPage implements Command {
    private static final String URL = "url";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToMainPage");

        StringBuffer requestURL = req.getRequestURL();
        System.out.println("URL " + requestURL);

        req.getSession().setAttribute(URL, requestURL);

        req.getRequestDispatcher("/WEB-INF/jsp/mainPage.jsp").forward(req, resp);
    }
}
