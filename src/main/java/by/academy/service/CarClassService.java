package by.academy.service;

import by.academy.dao.entity.Car;
import by.academy.service.exception.ServiceException;

import java.util.List;
import java.util.Map;

public interface CarClassService {

    Map<String, String> findAllCarClass() throws ServiceException;



}
