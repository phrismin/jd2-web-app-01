package by.academy.service;

import by.academy.entity.Car;
import by.academy.entity.Fine;
import by.academy.entity.User;

import java.util.List;

public interface FindFineService {

    List<Fine> findAll();

    List<Fine> findByCar(Car car);

    List<Fine> findByUser(User user);

}
