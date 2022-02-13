package by.academy.dao;

import by.academy.dao.exception.DAOException;

import java.util.List;

public interface FindClassDAO {

    List<String> findAllClass() throws DAOException;

}
