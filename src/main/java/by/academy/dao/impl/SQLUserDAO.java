package by.academy.dao.impl;

import by.academy.dao.connection.ConnectionPool;
import by.academy.dao.connection.ConnectionPoolException;
import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;
import by.academy.entity.Role;
import by.academy.entity.User;
import by.academy.entity.UserInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Optional;

public class SQLUserDAO implements UserDAO {
    //language=MySQL
    private static final String GET_USER_BY_NAME_AND_PASSWORD =
            "SELECT * FROM users WHERE login = ? AND password = ?";

    private static final String GET_USER_INFO_BY_ID =
            "SELECT * FROM user_info WHERE id = ?";

    @Override
    public Optional<User> authorization(String login, String password) throws DAOException {
        User user = new User();

        try (Connection connection = ConnectionPool.getInstance().takeConnection();
             var statement = connection.prepareStatement(GET_USER_BY_NAME_AND_PASSWORD)) {

            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            user.setId(resultSet.getLong(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            user.setUserRole(Role.valueOf(resultSet.getString(4).toLowerCase(Locale.ROOT)));

            ConnectionPool.closeConnection(connection, statement, resultSet);

        } catch (ConnectionPoolException e) {
            throw new DAOException("ConnectionPoolException on SQLUserDAO", e);
        } catch (SQLException e) {
            throw new DAOException("User isn't exist", e);
        }

        return Optional.of(user);
    }

    @Override
    public boolean registration(User user, UserInfo userInfo) {
        return false;
    }
}
