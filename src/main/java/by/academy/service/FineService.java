package by.academy.service;

import by.academy.entity.Fine;
import by.academy.service.exception.ServiceException;

public interface FineService {

    void addFine(Fine fine) throws ServiceException, com.google.protobuf.ServiceException;

}
