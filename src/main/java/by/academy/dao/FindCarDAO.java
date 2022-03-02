package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.entity.Car;

import java.util.List;

public interface FindCarDAO {

    List<Car> findAllCars() throws DAOException;

    Car findById(int carId) throws DAOException;

    List<Car> findCarsByCarClass(String carClass) throws DAOException;

//    List<Car> findClassesCars() throws DAOException;

}
