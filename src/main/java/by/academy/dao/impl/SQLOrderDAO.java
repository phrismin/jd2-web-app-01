package by.academy.dao.impl;

import by.academy.dao.OrderDAO;
import by.academy.dao.connection.ConnectionPool;
import by.academy.dao.connection.ConnectionPoolException;
import by.academy.dao.exception.DAOException;
import by.academy.entity.Order;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.Locale;

public class SQLOrderDAO implements OrderDAO {
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();
    private static final Logger logger = LogManager.getLogger(SQLOrderDAO.class);

    private static final String INSERT_ORDER = "INSERT INTO orders (" +
            "order_number, reserv_time, start_reserv_date, end_reserv_date, start_mileage, " +
            "description, users_id, cars_id, statuses_id) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    @Override
    public boolean createOrder(Order order) throws DAOException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = connectionPool.takeConnection();
            st = con.prepareStatement(INSERT_ORDER);

            st.setString(1, order.getOrderNumber());
            st.setTimestamp(2, order.getReservTime());
            st.setDate(3, Date.valueOf(order.getStartReservDate()));
            st.setDate(4, Date.valueOf(order.getEndReservDate()));
            st.setInt(5, order.getStartMileage());
            st.setString(6, order.getDescription());
            st.setLong(7, order.getUser().getId());
            st.setLong(8, order.getCar().getId());
            st.setString(9, String.valueOf(order.getStartReservDate()));

            int executeUpdate = st.executeUpdate();

        } catch (ConnectionPoolException e) {
            logger.error("Database server connection has problem", e);
            throw new DAOException("Database server connection has problem", e);
        } catch (SQLException e) {
            logger.error("Failed to create the order", e);
            throw new DAOException("Failed to create the order", e);
        } finally {
            connectionPool.closeConnection(con, st, rs);
        }
        return true;
    }

    @Override
    public Order findOrder(int id) throws DAOException {
        return null;
    }

    @Override
    public boolean isExistOrder(int carId) throws DAOException {
        return false;
    }
}
