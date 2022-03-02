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


public class SelectCarCommand implements Command {
    private static final String ERROR_MESSAGE = "Ooops";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("SelectCarCommand");

        int carId = Integer.parseInt(req.getParameter("carId"));

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FindCarService findCarService = serviceFactory.getFindCarService();

        try {
            Car car = findCarService.findById(carId);
            // TODO
//            req.setAttribute("car", car);
//            req.getRequestDispatcher("/WEB-INF/jsp/bookingPage").forward(req, resp);
            req.getSession().setAttribute("car", car);
            resp.sendRedirect("controller?command=GO_TO_BOOKING_PAGE");


        } catch (ServiceException e) {
            // TODO GO_TO_CARS_PAGE

            resp.sendRedirect("controller?command=GO_TO_REGISTRATION_PAGE&errorMessage="
                    + ERROR_MESSAGE);
        }
    }
}
