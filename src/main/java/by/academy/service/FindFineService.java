package by.academy.service;

import by.academy.dao.entity.Car;
import by.academy.dao.entity.Fine;
import by.academy.dao.entity.User;

import java.util.List;

public interface FindFineService {

    List<Fine> findAll();

    List<Fine> findByCar(Car car);

    List<Fine> findByUser(User user);

}
