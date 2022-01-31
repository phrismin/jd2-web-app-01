package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.Car;

import java.util.List;

public interface FindCarDAO {

    List<Car> findAllCars() throws DAOException;

    Car findByCar(String carInfo) throws DAOException;

    List<Car> findCarsByCarClass(String carClass) throws DAOException;

}
