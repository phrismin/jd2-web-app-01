package by.academy.dao.impl;

import by.academy.dao.UserDAO;

import java.sql.SQLException;

public class SQLUserDAO implements UserDAO {
    @Override
    public String authorization(String login, String password) {

        try {
            throw new SQLException();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "admin";
    }
}
