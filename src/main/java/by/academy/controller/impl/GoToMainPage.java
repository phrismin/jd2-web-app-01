package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.entity.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoToMainPage implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String userName = (String) req.getSession().getAttribute("userName");
        if (userName.equals("Vasyl")) {
            List<Car> carList = new ArrayList<>();
            carList.add(new Car("Passenger", "VW", "50"));
            carList.add(new Car("SUV", "Toyota", "120"));
            carList.add(new Car("Cabriolet", "Mercedes", "150"));

            req.setAttribute("cars", carList);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/mainPage.jsp");
        dispatcher.forward(req, resp);
    }
}
