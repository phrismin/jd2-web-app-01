package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindCarClassDAO;
import by.academy.dao.entity.CarClass;
import by.academy.dao.exception.DAOException;
import by.academy.service.CarClassService;
import by.academy.service.exception.ServiceException;

import java.util.List;

public class CarClassServiceImpl implements CarClassService {

    @Override
    public List<String> findAllCarClass() throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FindCarClassDAO findCarClassDAO = daoFactory.getFindCarClassDAO();

        List<String> allCarClass;
        try {
            allCarClass = findCarClassDAO.findAllCarClass();
        } catch (DAOException e) {
            throw new ServiceException("Can't find list of car's classes", e);
        }

        return allCarClass;
    }

}
