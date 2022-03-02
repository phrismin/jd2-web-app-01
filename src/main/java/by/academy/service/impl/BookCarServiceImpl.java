package by.academy.service.impl;

import by.academy.dao.BookCarDAO;
import by.academy.dao.DAOFactory;
import by.academy.dao.exception.DAOException;
import by.academy.service.exception.ServiceException;

//public class BookCarServiceImpl  {
//    private static final DAOFactory DAO_FACTORY = DAOFactory.getInstance();
//
//    public boolean bookCar(int id) throws ServiceException {
//        BookCarDAO bookCarDAO = DAO_FACTORY.getBookCarDAO();
//
//        try {
//            if (!isCarBook(id, bookCarDAO)) {
//                return false;
//            }
//
//            bookCarDAO.bookCar(id);
//        } catch (DAOException e) {
//            throw new ServiceException("Failed to book the car", e);
//        }
//        return false;
//    }
//
//    private boolean isCarBook(int id, BookCarDAO bookCarDAO) throws ServiceException {
//        if (isExistOrder(id, bookCarDAO)) {
//            return true;
//        };
//        try {
//            boolean isBook = bookCarDAO.isCarBook(id);
//        } catch (DAOException e) {
//            throw new ServiceException("Failed to check the car reservation", e);
//        }
//        return false;
//    }
//
//    private boolean isExistOrder(int id, BookCarDAO bookCarDAO) throws ServiceException {
//        try {
//            bookCarDAO.isCarBook(id);
//        } catch (DAOException e) {
//            throw new ServiceException("Failed to check the order on the car", e);
//        }
//
//        return false;
//    }
//}
