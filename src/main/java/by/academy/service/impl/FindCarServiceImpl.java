package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindCarDAO;
import by.academy.dao.entity.Car;
import by.academy.dao.entity.CarClass;
import by.academy.dao.exception.DAOException;
import by.academy.service.FindCarService;

import java.util.List;

public class FindCarServiceImpl implements FindCarService {
    @Override
    public List<Car> findCarsByCarClass(String carClass) {
        DAOFactory daoFactory = new DAOFactory();
        FindCarDAO findCarDAO = daoFactory.getFindCarDAO();
        try {
            findCarDAO.findCarsByCarClass(carClass);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Car findByCar(String carInfo) {
        return null;
    }
}
