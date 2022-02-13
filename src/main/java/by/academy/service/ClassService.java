package by.academy.service;

import by.academy.service.exception.ServiceException;

import java.util.List;

public interface ClassService {

    List<String> findAllClass() throws ServiceException;

}
