package by.academy.dao;

import by.academy.dao.impl.SQLFindCarDAO;
import by.academy.dao.impl.SQLFindClassDAO;
import by.academy.dao.impl.SQLFineDAO;
import by.academy.dao.impl.SQLUserDAO;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final UserDAO userDAO = new SQLUserDAO();
    private final FineDAO fineDAO = new SQLFineDAO();
    private final FindCarDAO findCarDAO = new SQLFindCarDAO();
    private final FindClassDAO findClassDAO = new SQLFindClassDAO();

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public FineDAO getFineDAO() {
        return fineDAO;
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
