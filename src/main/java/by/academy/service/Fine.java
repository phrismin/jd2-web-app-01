package by.academy.service;

import by.academy.entity.Car;

import java.util.List;

public interface Fine {

    List<by.academy.entity.Fine> findAll();

    List<by.academy.entity.Fine> findByCar(Car car);
}
