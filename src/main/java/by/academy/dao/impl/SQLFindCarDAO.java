package by.academy.dao.impl;

import by.academy.dao.FindCarDAO;
import by.academy.dao.connection.ConnectionPool;
import by.academy.dao.connection.ConnectionPoolException;
import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.Car;
import by.academy.dao.entity.CarClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SQLFindCarDAO implements FindCarDAO {
    private final ConnectionPool connectionPool = ConnectionPool.getInstance();

    private String GET_CARS_BY_CAR_CARS = "SELECT * FROM rent_cars_db.cars cars " +
            "JOIN rent_cars_db.car_classes classes " +
            "ON cars.car_classes_id = classes.id " +
            "WHERE classes.name = ?";

    @Override
    public List<Car> findCarsByCarClass(String carClass) throws DAOException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Car> carList = new ArrayList<>();

        try {
            con = connectionPool.takeConnection();
            st = con.prepareStatement(GET_CARS_BY_CAR_CARS);

            st.setString(1, carClass);
            rs = st.executeQuery();

            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getLong("id"));
                car.setVinCode(rs.getString("vin_code"));
                car.setBrand(rs.getString("brand"));
                car.setModel(rs.getString("model"));
                car.setBodyType(rs.getString("body_type"));
                car.setYearOfIssue(rs.getInt("year_of_issue"));
                car.setColor(rs.getString("color"));
                car.setEngineCapacity(rs.getString("engine_capacity"));
                car.setFuelType(rs.getString("fuel_type"));
                car.setTransmission(rs.getString("transmission"));
                car.setFuelConsumption(rs.getString("fuel_consumption"));
                car.setNumberDoors(rs.getInt("number_doors"));
                car.setNumberSeats(rs.getInt("number_seats"));
                car.setMileage(rs.getInt("mileage"));

                String nameCarClass = rs.getString("name");
                CarClass carClass2 = CarClass.valueOf(nameCarClass.toUpperCase(Locale.ROOT));
                car.setCarClass(carClass2);

                carList.add(car);
            }

        } catch (ConnectionPoolException e) {
            throw new DAOException("Database server connection problem", e);
        } catch (SQLException e) {
            throw new DAOException("Car isn't exist", e);
        } finally {
            connectionPool.closeConnection(con, st, rs);
        }

        return carList;
    }

    @Override
    public List<Car> findAllCars() throws DAOException {
        return null;
    }

    @Override
    public Car findByCar(String carInfo) {
        return null;
    }
}
