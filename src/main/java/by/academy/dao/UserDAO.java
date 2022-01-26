package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.entity.User;
import by.academy.entity.UserInfo;

import java.util.Optional;

public interface UserDAO {

    User authorization(String login, String password) throws DAOException;

    boolean registration(User user, UserInfo userInfo) throws DAOException;

}
