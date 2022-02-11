package by.academy.dao;

import by.academy.dao.entity.Role;
import by.academy.dao.exception.DAOException;
import by.academy.dao.entity.User;

import java.time.LocalDate;

public interface UserDAO {

    User authorization(String login, String password) throws DAOException;

    boolean registration(String login, String password, String role, String email, String passpName,
                         String passpSurname, String passpPatronymic, LocalDate passpDateBirth,
                         LocalDate passpDateIssue, String passpNumber, LocalDate drivLicDateIssue,
                         String drivLicSerialNumber, String drivLicCategory) throws DAOException;

}
