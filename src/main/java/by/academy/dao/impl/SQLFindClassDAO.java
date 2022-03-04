package by.academy.dao.impl;

import by.academy.dao.FindClassDAO;
import by.academy.dao.connection.ConnectionPool;
import by.academy.dao.connection.ConnectionPoolException;
import by.academy.dao.exception.DAOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLFindClassDAO implements FindClassDAO {
    private static final Logger logger = LogManager.getLogger(SQLFindClassDAO.class);
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private static final String GET_ALL_CAR_CLASS = "SELECT * FROM car_classes ORDER BY id";

    @Override
    public List<String> findAllClass() throws DAOException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        ArrayList<String> carClasses = new ArrayList<>();

        try {
            con = connectionPool.takeConnection();
            st = con.createStatement();
            rs = st.executeQuery(GET_ALL_CAR_CLASS);
            while (rs.next()) {
                carClasses.add(rs.getString("name"));
            }

        } catch (ConnectionPoolException e) {
            logger.error("Database server connection problem", e);
            throw new DAOException("Database server connection problem", e);
        } catch (SQLException e) {
            logger.error("List of car's classes has a problem", e);
            throw new DAOException("List of car's classes has a problem", e);
        } finally {
            connectionPool.closeConnection(con, st, rs);
        }

        return carClasses;
    }
}
