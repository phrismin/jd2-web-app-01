package by.academy.dao;

import by.academy.dao.exception.DAOException;

public interface UserDAO {

    String authorization(String login, String password) throws DAOException;

    boolean registration(String login, String password, String email) throws DAOException;

}
