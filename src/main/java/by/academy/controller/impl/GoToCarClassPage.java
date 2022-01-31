package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.dao.entity.Car;
import by.academy.service.CarClassService;
import by.academy.service.FindCarService;
import by.academy.service.ServiceFactory;
import by.academy.service.exception.ServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GoToCarClassPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToCarClassPage");

        String carClassName = req.getParameter("command");

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FindCarService findCarService = serviceFactory.getFindCarService();

        try {
            List<Car> carList = findCarService.findCarsByCarClass(carClassName);
            req.setAttribute("cars", carList);

            req.getRequestDispatcher("/WEB-INF/jsp/carClassPage.jsp").forward(req, resp);

        } catch (ServiceException e) {
            resp.sendRedirect("controller?command=GO_TO_ERROR_PAGE");
        }
    }
}
