package by.academy.service;

import by.academy.entity.Car;

import java.util.List;

public interface FindCarService {

    List<Car> showAllCars(String classCar);

    Car showCar(String carInfo);

}
