package by.academy.dao.impl;

import by.academy.dao.connection.ConnectionPool;
import by.academy.dao.connection.ConnectionPoolException;
import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.Role;
import by.academy.dao.entity.User;
import by.academy.dao.entity.UserInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class SQLUserDAO implements UserDAO {
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String GET_USER_BY_LOGIN_AND_PASSWORD =
            "SELECT * FROM rent_cars_db.users WHERE login = ? AND password = ?";

    private static final String GET_USER_INFO_BY_ID =
            "SELECT * FROM user_info WHERE id = ?";


    @Override
    public User authorization(String login, String password) throws DAOException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        User user = new User();

        try {
            con = connectionPool.takeConnection();
            st = con.prepareStatement(GET_USER_BY_LOGIN_AND_PASSWORD);

            st.setString(1, login);
            st.setString(2, password);
            rs = st.executeQuery();

            while (rs.next()) {
                user.setId(rs.getLong("id"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setUserRole(Role.valueOf(rs.getString("role").toUpperCase(Locale.ROOT)));
            }

        } catch (ConnectionPoolException e) {
            throw new DAOException("Database server connection problem", e);
        } catch (SQLException e) {
            throw new DAOException("User isn't exist", e);
        } finally {
            connectionPool.closeConnection(con, st, rs);
        }

        return user;
    }

    @Override
    public boolean registration(User user, UserInfo userInfo) {
        return false;
    }
}
