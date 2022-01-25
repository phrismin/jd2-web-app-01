package by.academy.service;

import by.academy.entity.Car;
import by.academy.entity.CarClass;

import java.util.List;

public interface FindCarService {

    List<Car> findCarsByCarClass(CarClass carClass);

    Car findByCar(String carInfo);

}
