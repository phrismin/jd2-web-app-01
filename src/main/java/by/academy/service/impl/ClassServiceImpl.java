package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindClassDAO;
import by.academy.dao.exception.DAOException;
import by.academy.service.ClassService;
import by.academy.service.exception.ServiceException;

import java.util.List;

public class ClassServiceImpl implements ClassService {

    @Override
    public List<String> findAllClass() throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FindClassDAO findCarClassDAO = daoFactory.getFindCarClassDAO();

        List<String> classesCars;
        try {
            classesCars = findCarClassDAO.findAllClass();
        } catch (DAOException e) {
            throw new ServiceException("Can't find list of car's classes", e);
        }

        return classesCars;
    }

}
