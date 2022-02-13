package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.service.ClassService;
import by.academy.service.ServiceFactory;
import by.academy.service.exception.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoToClassPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToClassesPage");

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ClassService classService = serviceFactory.getClassService();

        try {
            List<String> classes = classService.findAllClass();
            req.setAttribute("classes", classes);

            req.getRequestDispatcher("/WEB-INF/jsp/classesPage.jsp").forward(req, resp);

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_ERROR_PAGE");
        }
    }
}
