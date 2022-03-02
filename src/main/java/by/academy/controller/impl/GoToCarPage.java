package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.entity.Car;
import by.academy.service.FindCarService;
import by.academy.service.ServiceFactory;
import by.academy.service.exception.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoToCarPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToCarPage");

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FindCarService findCarService = serviceFactory.getFindCarService();

        String command = req.getParameter("command");

        try {
            List<Car> cars = findCarService.findCarsByCarClass(command);
            req.setAttribute("cars", cars);
            req.getRequestDispatcher("/WEB-INF/jsp/carsPage.jsp").forward(req, resp);

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_ERROR_PAGE");
        }


    }
}
