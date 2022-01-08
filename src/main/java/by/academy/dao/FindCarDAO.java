package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.entity.Car;
import by.academy.entity.CarClass;

import java.util.List;

public interface FindCarDAO {

    List<Car> findAllCars(CarClass carClass) throws DAOException;

    Car findByCar(String carInfo) throws DAOException;

}
