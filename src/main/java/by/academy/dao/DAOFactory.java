package by.academy.dao;

import by.academy.dao.impl.*;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final BookCarDAO bookCarDAO = new SQLBookCarDAO();
    private final UserDAO userDAO = new SQLUserDAO();
    private final FindCarDAO findCarDAO = new SQLFindCarDAO();
    private final FindClassDAO findClassDAO = new SQLFindClassDAO();
    private final OrderDAO orderDAO = new SQLOrderDAO();

    public DAOFactory() {
    }

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public BookCarDAO getBookCarDAO() {
        return bookCarDAO;
    }

    public FindClassDAO getFindClassDAO() {
        return findClassDAO;
    }

    public FindCarDAO getFindCarDAO() {
        return findCarDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public FindClassDAO getFindCarClassDAO() {
        return findClassDAO;
    }
}
