package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindCarClassDAO;
import by.academy.dao.entity.Car;
import by.academy.dao.entity.CarClass;
import by.academy.dao.exception.DAOException;
import by.academy.service.CarClassService;
import by.academy.service.exception.ServiceException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarClassServiceImpl implements CarClassService {

    @Override
    public Map<String, String> findAllCarClass() throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FindCarClassDAO findCarClassDAO = daoFactory.getFindCarClassDAO();

        Map<String, String> rusEngCarClasses = new HashMap<>();

        try {
            List<String> allCarClass = findCarClassDAO.findAllCarClass();
            String nameCarClass;
            for (String carClass : allCarClass) {
                nameCarClass = carClass;
                switch (nameCarClass) {
                    case "Эконом-класс" -> rusEngCarClasses.put(nameCarClass, CarClass.BUDGET.name());
                    case "Средний класс" -> rusEngCarClasses.put(nameCarClass, CarClass.MIDDLE.name());
                    case "Бизнес-класс" -> rusEngCarClasses.put(nameCarClass, CarClass.BUSINESS.name());
                    case "Премиум" -> rusEngCarClasses.put(nameCarClass, CarClass.PREMIUM.name());
                    case "Внедорожник" -> rusEngCarClasses.put(nameCarClass, CarClass.SUV.name());
                    case "Микроавтобус" -> rusEngCarClasses.put(nameCarClass, CarClass.BUS.name());
                    case "Кабриолет" -> rusEngCarClasses.put(nameCarClass, CarClass.CONVERTIBLE.name());
                    case "Эксклюзив" -> rusEngCarClasses.put(nameCarClass, CarClass.EXCLUSIVE.name());
                    default -> throw new ServiceException("Unknown car's class");
                }
            }

        } catch (DAOException e) {
            throw new ServiceException("Can't find list of car's classes", e);
        }

        return rusEngCarClasses;
    }

    @Override
    public List<Car> findCarsByClass(String carClass) throws ServiceException {
        DAOFactory daoFactory = new DAOFactory();
        FindCarClassDAO findCarClassDAO = daoFactory.findCarClassDAO;
        
        return null;
    }
}
