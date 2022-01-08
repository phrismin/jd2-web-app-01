package by.academy.dao.impl;

import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;

import java.sql.SQLException;

public class SQLUserDAO implements UserDAO {
    @Override
    public String authorization(String login, String password) throws DAOException {

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
