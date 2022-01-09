package by.academy.entity;

import java.util.Date;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private Enum carClass;
    private Date dateOfIssue;
    private Enum color;
    private Enum bodyType;
    private Double engineCapacity;
    private Enum fuelType;
    private String fuelConsumption;
    private Enum transmission;
    private List<String> options;
    private String vinCode;


    public Car() {
    }

    public Car(String brand, String model, CarClass carClass, Date dateOfIssue, Enum color,
               Enum bodyType, Double engineCapacity, Enum fuelType, String fuelConsumption,
               Enum transmission, List<String> options, String vinCode) {
        this.brand = brand;
        this.model = model;
        this.carClass = carClass;
        this.dateOfIssue = dateOfIssue;
        this.color = color;
        this.bodyType = bodyType;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.transmission = transmission;
        this.options = options;
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

    public Enum getCarClass() {
        return carClass;
    }

    public void setCarClass(Enum carClass) {
        this.carClass = carClass;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    public Enum getBodyType() {
        return bodyType;
    }

    public void setBodyType(Enum bodyType) {
        this.bodyType = bodyType;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Enum getFuelType() {
        return fuelType;
    }

    public void setFuelType(Enum fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Enum getTransmission() {
        return transmission;
    }

    public void setTransmission(Enum transmission) {
        this.transmission = transmission;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }
}
