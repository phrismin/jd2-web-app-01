package by.academy.dao.impl;

import by.academy.config.ConnectionPool;
import by.academy.config.ConnectionPoolException;
import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;

import java.sql.Connection;
import java.sql.SQLException;

public class SQLUserDAO implements UserDAO {
    @Override
    public String authorization(String login, String password) throws DAOException {
        try {
            Connection connection = ConnectionPool.getInstance().takeConnection();
            connection.prepareStatement("d");
        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String role = "admin";
        if (!role.equals("admin")) {
            try {
                throw new SQLException();
            } catch (SQLException e) {
                throw new DAOException(e);
            }
        }

        return role;
    }

    @Override
    public boolean registration(String login, String password, String email) {
        return false;
    }
}
