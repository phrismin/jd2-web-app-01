package by.academy.dao;

import by.academy.dao.exception.DAOException;

public interface BookCarDAO {

    boolean bookCar(int carId) throws DAOException;

    boolean isCarBook(int Id) throws DAOException;
}
