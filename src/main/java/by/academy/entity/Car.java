package by.academy.entity;

import java.util.Objects;

public class Car {
    private String type;
    private String name;
    private String price;

    public Car(String type, String name, String price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(type, car.type) && Objects.equals(name, car.name) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, price);
    }
}
