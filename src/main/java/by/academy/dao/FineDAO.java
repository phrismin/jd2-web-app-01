package by.academy.dao;

import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.Fine;

public interface FineDAO {

    void addFine(Fine fine) throws DAOException;

}
