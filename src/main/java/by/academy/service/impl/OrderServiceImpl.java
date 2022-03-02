package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.OrderDAO;
import by.academy.dao.exception.DAOException;
import by.academy.entity.Car;
import by.academy.entity.Order;
import by.academy.entity.ReservationStatus;
import by.academy.entity.User;
import by.academy.service.exception.ServiceException;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean createOrder(User user, Car car, String startReserv, String endReserv, String comment) throws ServiceException {
        Order order = new Order();
        order.setOrderNumber(createNumber());
        order.setReservTime(Timestamp.valueOf(LocalDateTime.now()));
        order.setStartReservDate(LocalDate.parse(startReserv));
        order.setEndReservDate(LocalDate.parse(startReserv));
        order.setStartMileage(car.getMileage());
        order.setDescription(comment);
        order.setCar(car);
        order.setUser(user);
        order.setReservationStatus(ReservationStatus.NEW);

        DAOFactory daoFactory = DAOFactory.getInstance();
        OrderDAO orderDAO = daoFactory.getOrderDAO();


        boolean isCreatedOrder;
        try {
            isCreatedOrder = orderDAO.createOrder(order);
        } catch (DAOException e) {
            throw new ServiceException("Failed to created the order", e);
        }

        return isCreatedOrder;
    }

    private String createNumber() {
        Date now = new Date(System.currentTimeMillis());
        return new SimpleDateFormat("yyMMddHHmmss").format(now);
    }
}
