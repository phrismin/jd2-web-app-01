package by.academy.dao;

import by.academy.dao.exception.DAOException;

import java.util.List;

public interface FindCarClassDAO {

    List<String> findAllCarClass() throws DAOException;

}
