package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToMainPage implements Command {
    private static final String BUDGET = "budget";
    private static final String MIDDLE = "middle";
    private static final String BUSINESS = "business";
    private static final String PREMIUM = "premium";
    private static final String SUV = "suv";
    private static final String CONVERTIBLE = "convertible";
    private static final String EXCLUSIVE = "exclusive";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToMainPage");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/mainPage.jsp");
        dispatcher.forward(req, resp);
    }
}
