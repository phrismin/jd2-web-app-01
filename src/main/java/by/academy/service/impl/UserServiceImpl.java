package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;
import by.academy.service.exception.ServiceException;
import by.academy.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String authorization(String login, String password) throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        UserDAO userDAO = daoFactory.getUserDAO();

        String role;

        try {
            role = userDAO.authorization(login, password);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return role;
    }

    @Override
    public boolean registration(String login, String password, String email) {
        return false;
    }
}
