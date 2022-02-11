package by.academy.service;

import by.academy.service.exception.ServiceException;

public interface UserService {

    String authorization(String login, String password) throws ServiceException;

    boolean registration(String login, String password, String email, String passpName,
                         String passpSurname, String passpPatronymic, String passpDateBirth, String passpDateIssue,
                         String passpNumber, String drivLicDateIssue, String drivLicSerialNumber,
                         String drivLicCategory) throws ServiceException;

    boolean isExistUser(String login, String password) throws ServiceException;

}
