package by.academy.entity;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private static final long serialVersionUID = 5L;

    private Long id;
    private String vinCode;
    private String brand;
    private String model;
    private String bodyType;
    private Integer yearOfIssue;
    private String color;
    private String engineCapacity;
    private String fuelType;
    private String transmission;
    private String fuelConsumption;
    private Integer numberDoors;
    private Integer numberSeats;
    private Integer mileage;
    private CarClass carClass;

    public Car() {
    }

    public Car(Long id, String vinCode, String brand, String model, String bodyType,
               Integer yearOfIssue, String color, String engineCapacity, String fuelType,
               String transmission, String fuelConsumption, Integer numberDoors,
               Integer numberSeats, Integer mileage, CarClass carClass) {
        this.id = id;
        this.vinCode = vinCode;
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.fuelConsumption = fuelConsumption;
        this.numberDoors = numberDoors;
        this.numberSeats = numberSeats;
        this.mileage = mileage;
        this.carClass = carClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(Integer numberDoors) {
        this.numberDoors = numberDoors;
    }

    public Integer getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(Integer numberSeats) {
        this.numberSeats = numberSeats;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(vinCode, car.vinCode)
                && Objects.equals(brand, car.brand) && Objects.equals(model, car.model)
                && bodyType == car.bodyType && Objects.equals(yearOfIssue, car.yearOfIssue)
                && Objects.equals(color, car.color) && Objects.equals(engineCapacity, car.engineCapacity)
                && Objects.equals(fuelType, car.fuelType) && Objects.equals(transmission, car.transmission)
                && Objects.equals(fuelConsumption, car.fuelConsumption)
                && Objects.equals(numberDoors, car.numberDoors) && Objects.equals(numberSeats, car.numberSeats)
                && Objects.equals(mileage, car.mileage) && carClass == car.carClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vinCode, brand, model, bodyType, yearOfIssue, color, engineCapacity,
                fuelType, transmission, fuelConsumption, numberDoors, numberSeats, mileage, carClass);
    }
}
