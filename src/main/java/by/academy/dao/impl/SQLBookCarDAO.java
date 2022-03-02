package by.academy.dao.impl;

import by.academy.dao.BookCarDAO;
import by.academy.dao.exception.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLBookCarDAO implements BookCarDAO {
//    private static final String GET_STATUS_ORDER;


    @Override
    public boolean bookCar(int carId) throws DAOException {
        return false;
    }

    @Override
    public boolean isCarBook(int Id) throws DAOException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;


        return false;
    }
}
