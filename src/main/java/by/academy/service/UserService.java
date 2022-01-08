package by.academy.service;

import by.academy.service.exception.ServiceException;

public interface UserService {

    String authorization(String login, String password) throws ServiceException;

    boolean registration(String login, String password, String email) throws ServiceException;

}
