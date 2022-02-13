package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindCarDAO;
import by.academy.dao.entity.Car;
import by.academy.dao.exception.DAOException;
import by.academy.service.FindCarService;
import by.academy.service.exception.ServiceException;

import java.util.List;
import java.util.Locale;

public class FindCarServiceImpl implements FindCarService {

    @Override
    public List<Car> findCarsByCarClass(String carClass) throws ServiceException {
        DAOFactory daoFactory = new DAOFactory();
        FindCarDAO findCarDAO = daoFactory.getFindCarDAO();

        List<Car> carsByCarClass;

        try {
            String nameCarClass = carClass.replace("GO_TO_", "")
                    .replace("_CAR_PAGE", "")
                    .toLowerCase(Locale.ROOT);

            String firstSymbol = nameCarClass.substring(0, 1).toUpperCase(Locale.ROOT);
            String stringWithCapital = nameCarClass.replaceFirst("\\w", firstSymbol.toUpperCase(Locale.ROOT));

            carsByCarClass = findCarDAO.findCarsByCarClass(stringWithCapital);

        } catch (DAOException e) {
            throw new ServiceException("Can't found cars", e);
        }

        return carsByCarClass;
    }

//    @Override
//    public List<Car> findClassesCarsClass() throws ServiceException {
//        DAOFactory daoFactory = new DAOFactory();
//        FindCarDAO findCarDAO = daoFactory.getFindCarDAO();
//
//        List<Car> carsByCarClass;
//
//        try {
//
//            carsByCarClass = findCarDAO.findClassesCars();
//
//        } catch (DAOException e) {
//            throw new ServiceException("Can't found cars", e);
//        }
//
//
//        return carsByCarClass;
//        return null;
//    }

}
