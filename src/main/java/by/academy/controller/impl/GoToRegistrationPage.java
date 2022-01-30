package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.dao.entity.Greeting;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToRegistrationPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToRegistrationPage");

        Greeting greeting = new Greeting("Welcome to registration");
        req.setAttribute("myObj", greeting);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
        dispatcher.forward(req, resp);
    }
}
