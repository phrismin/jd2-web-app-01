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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoToCarClassPage implements Command {
    private static final String BUDGET_CARS = "BUDGET";
    private static final String MIDDLE_CARS = "MIDDLE";
    private static final String BUSINESS_CARS = "BUSINESS";
    private static final String PREMIUM_CARS = "PREMIUM";
    private static final String SUV_CARS = "SUV";
    private static final String BUS_CARS = "BUS";
    private static final String CONVERTIBLE_CARS = "CONVERTIBLE";
    private static final String EXCLUSIVE_CARS = "EXCLUSIVE";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("GoToCarClassPage");

        String carClass = req.getParameter("command");
        String withoutStart = carClass.replace("GO_TO_", "");
        String engNameCarClass = withoutStart.replace("_CAR_PAGE", "");

        String rusNameCarClass;
        switch (engNameCarClass) {
            case "BUDGET" -> rusNameCarClass = "Эконом-класс";
            case "MIDDLE" -> rusNameCarClass = "Средний класс";
            case "BUSINESS" -> rusNameCarClass = "Бизнес-класс";
            case "PREMIUM" -> rusNameCarClass = "Премиум";
            case "SUV" -> rusNameCarClass = "Внедорожник";
            case "BUS" -> rusNameCarClass = "Микроавтобус";
            case "CONVERTIBLE" -> rusNameCarClass = "Кабриолет";
            case "EXCLUSIVE" -> rusNameCarClass = "Эксклюзив";
            default -> throw new RuntimeException("Unknown car's class");
        }

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FindCarService findCarService = serviceFactory.getFindCarService();

        try {
            findCarService.findCarsByCarClass(rusNameCarClass);
        } catch (ServiceException e) {
            e.printStackTrace();
        }

        req.getRequestDispatcher("/WEB-INF/jsp/carClassPage.jsp").forward(req, resp);
    }
}
