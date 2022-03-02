package by.academy.service.impl;

import by.academy.entity.Car;
import by.academy.entity.User;
import by.academy.service.exception.ServiceException;

public interface OrderService {
    boolean createOrder(User user, Car car, String startReserv, String endReserv, String comment) throws ServiceException;
}
