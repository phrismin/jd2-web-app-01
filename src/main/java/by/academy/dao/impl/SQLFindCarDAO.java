package by.academy.dao.impl;

import by.academy.dao.FindCarDAO;
import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.Car;
import by.academy.dao.entity.CarClass;

import java.util.List;

public class SQLFindCarDAO implements FindCarDAO {

    @Override
    public List<Car> findAllCars() throws DAOException {
        return null;
    }

    @Override
    public List<Car> findCarsByCarClass(String carClass) throws DAOException {

        return null;
    }

    @Override
    public Car findByCar(String carInfo) {
        return null;
    }
}
