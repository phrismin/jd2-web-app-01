package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.entity.Order;

public interface OrderDAO {

    boolean createOrder(Order order) throws DAOException;

    Order findOrder(int id) throws DAOException;

    boolean isExistOrder(int carId) throws DAOException;
}
