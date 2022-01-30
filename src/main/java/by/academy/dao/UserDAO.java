package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.User;
import by.academy.dao.entity.UserInfo;

public interface UserDAO {

    User authorization(String login, String password) throws DAOException;

    boolean registration(User user, UserInfo userInfo) throws DAOException;

}
