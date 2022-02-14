package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class GoToOrderPage implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToOrderPage");

        HttpSession session = req.getSession();
        String login = (String) session.getAttribute("userName");

        System.out.println(login);
    }
}
