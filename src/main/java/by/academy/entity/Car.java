package by.academy.entity;

import java.util.Date;
import java.util.List;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private CarClass carClass;
    private Date dateOfIssue;
    private String transmission;
    private String color;
    private BodyType bodyType;
    private Double engineCapacity;
    private String fuelType;
    private String fuelConsumption;
    private String description;
    private List<String> options;
    private String vinCode;

    public Car() {
    }

    public Car(Long id, String brand, String model, CarClass carClass, Date dateOfIssue,
               String transmission, String color, BodyType bodyType, Double engineCapacity, String fuelType,
               String fuelConsumption, String description, List<String> options, String vinCode) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.carClass = carClass;
        this.dateOfIssue = dateOfIssue;
        this.transmission = transmission;
        this.color = color;
        this.bodyType = bodyType;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.description = description;
        this.options = options;
        this.vinCode = vinCode;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
