package by.academy.controller.impl;

import by.academy.controller.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SignOutCommand implements Command {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("SignOutCommand");

        HttpSession session = req.getSession();
        if (session.getAttribute("userName") == null) {
            session.invalidate();
        }

        resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE");
    }
}
