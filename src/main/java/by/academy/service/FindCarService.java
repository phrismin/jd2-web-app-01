package by.academy.service;

import by.academy.dao.entity.Car;
import by.academy.service.exception.ServiceException;

import java.util.List;

public interface FindCarService {

    List<Car> findCarsByCarClass(String carClass) throws ServiceException;
//    List<Car> findClassesCarsClass() throws ServiceException;

}
