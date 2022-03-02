package by.academy.service.impl;

import by.academy.dao.DAOFactory;
import by.academy.dao.FindCarDAO;
import by.academy.entity.Car;
import by.academy.dao.exception.DAOException;
import by.academy.service.FindCarService;
import by.academy.service.exception.ServiceException;

import java.util.List;
import java.util.Locale;

public class FindCarServiceImpl implements FindCarService {
    private static final DAOFactory DAO_FACTORY = DAOFactory.getInstance();

    @Override
    public List<Car> findCarsByCarClass(String carClass) throws ServiceException {
        FindCarDAO findCarDAO = DAO_FACTORY.getFindCarDAO();

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

    @Override
    public Car findById(int carId) throws ServiceException {
        FindCarDAO findCarDAO = DAO_FACTORY.getFindCarDAO();

        Car car;

        try {
//            if (!isCarBook(carId)) {
//                throw new ServiceException("Sorry, car is booked");
//            };
            car = findCarDAO.findById(carId);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return car;
    }

    private boolean isCarBook(int carId) {
        return false;
    }

}
