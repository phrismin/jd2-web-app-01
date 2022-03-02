package by.academy.dao.impl;

import by.academy.dao.connection.ConnectionPool;
import by.academy.dao.connection.ConnectionPoolException;
import by.academy.dao.UserDAO;
import by.academy.dao.exception.DAOException;
import by.academy.entity.Role;
import by.academy.entity.User;

import java.sql.*;
import java.time.LocalDate;
import java.util.Locale;

public class SQLUserDAO implements UserDAO {
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String GET_USER_BY_LOGIN_AND_PASSWORD =
            "SELECT * FROM rent_cars_db.users WHERE login = ? AND password = ?";

    private static final String GET_USER_INFO_BY_ID =
            "SELECT * FROM user_info WHERE id = ?";

    private static final String INSERT_USER =
            "INSERT INTO users (login, password, role) VALUES (?, ?, ?)";

    private static final String INSERT_USER_INFO = "INSERT INTO user_info (email, passp_name, " +
            "passp_surname, passp_patronymic, passp_date_birth, passp_date_issue, " +
            "passp_identification_number, driv_lic_date_issue, driv_lic_serial_number, " +
            "driv_lic_category, users_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
            throw new DAOException("Database server connection has problem", e);
        } catch (SQLException e) {
            throw new DAOException("User isn't exist", e);
        } finally {
            connectionPool.closeConnection(con, st, rs);
        }

        return user;
    }

    @Override
    public boolean registration(String login, String password, String role, String email, String passpName,
                                String passpSurname, String passpPatronymic, LocalDate passpDateBirth,
                                LocalDate passpDateIssue, String passpNumber, LocalDate drivLicDateIssue,
                                String drivLicSerialNumber, String drivLicCategory) throws DAOException {

        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        int idUser = -1;

        try {
            con = connectionPool.takeConnection();
            con.setAutoCommit(false);

            try {
                //INSERT_USER
                st = con.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
                st.setString(1, login);
                st.setString(2, password);
                st.setString(3, role);

                int affectedRows = st.executeUpdate();
                if (affectedRows == 0) {
                    throw new DAOException("Creating user failed, no rows affected.");
                }

                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    idUser = rs.getInt(1);
                } else {
                    throw new DAOException("Creating user failed, no ID obtained.");
                }

                //INSERT_USER_INFO
                st = con.prepareStatement(INSERT_USER_INFO);
                st.setString(1, email);
                st.setString(2, passpName);
                st.setString(3, passpSurname);
                st.setString(4, passpPatronymic);
                st.setDate(5, Date.valueOf(passpDateBirth));
                st.setDate(6, Date.valueOf(passpDateIssue));
                st.setString(7, passpNumber);
                st.setDate(8, Date.valueOf(drivLicDateIssue));
                st.setString(9, drivLicSerialNumber);
                st.setString(10, drivLicCategory);
                st.setInt(11, idUser);

                st.executeUpdate();

                con.commit();

            } catch (SQLException e) {
                con.rollback();
                throw new DAOException("Unable to insert user's data or user's information", e);
            }

        } catch (SQLException e) {
            throw new DAOException("Transaction is failed", e);
        } catch (ConnectionPoolException e) {
            throw new DAOException("Database server connection has problem", e);
        } finally {
            connectionPool.closeConnection(con, st, rs);
        }

        return true;
    }
}
