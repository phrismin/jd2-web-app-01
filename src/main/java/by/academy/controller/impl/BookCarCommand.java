package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.entity.Car;
import by.academy.entity.User;
import by.academy.service.ServiceFactory;
import by.academy.service.exception.ServiceException;
import by.academy.service.impl.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookCarCommand implements Command {
    private static final String REGISTRATION_INFO = "Booking completed";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("BookCarCommand");

        String startReservDate = req.getParameter("startReservDate");
        String endReservDate = req.getParameter("endReservDate");
        String comment = req.getParameter("comment");
        Car car = (Car) req.getSession().getAttribute("car");
        User user = (User) req.getSession().getAttribute("userName");

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        OrderService orderService = serviceFactory.getOrderService();


        try {
            boolean order = orderService.createOrder(user, car, startReservDate, endReservDate, comment);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        resp.sendRedirect("controller?command=GO_TO_ORDER_PAGE&registrationInfo=" + REGISTRATION_INFO);
//        req.getRequestDispatcher("controller?command=GO_TO_ORDER_PAGE&registrationInfo="
//                + REGISTRATION_INFO).forward(req, resp);

    }
}
