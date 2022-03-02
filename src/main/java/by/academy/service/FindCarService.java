package by.academy.service;

import by.academy.entity.Car;
import by.academy.service.exception.ServiceException;

import java.util.List;

public interface FindCarService {

    List<Car> findCarsByCarClass(String carClass) throws ServiceException;

    Car findById(int carId) throws ServiceException;

}
