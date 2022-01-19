package by.academy.dao.impl;

import by.academy.dao.FindCarDAO;
import by.academy.dao.exception.DAOException;
import by.academy.entity.Car;
import by.academy.entity.CarClass;

import java.util.List;

public class SQLFindCarDAO implements FindCarDAO {
    @Override
    public List<Car> findAllCars(CarClass carClass) throws DAOException {

        return null;
    }

    @Override
    public Car findByCar(String carInfo) throws DAOException {
        return null;
    }
}
