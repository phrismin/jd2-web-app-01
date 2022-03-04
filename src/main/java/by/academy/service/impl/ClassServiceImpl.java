package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindClassDAO;
import by.academy.dao.exception.DAOException;
import by.academy.dao.impl.SQLFindCarDAO;
import by.academy.service.ClassService;
import by.academy.service.exception.ServiceException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

public class ClassServiceImpl implements ClassService {
    private static final Logger logger = LogManager.getLogger(SQLFindCarDAO.class);

    @Override
    public List<String> findAllClass() throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FindClassDAO findCarClassDAO = daoFactory.getFindCarClassDAO();

        List<String> classesCars;
        try {
            classesCars = findCarClassDAO.findAllClass();
        } catch (DAOException e) {
            logger.error("Can't find list of car's classes", e);
            throw new ServiceException("Can't find list of car's classes", e);
        }

        return classesCars;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
