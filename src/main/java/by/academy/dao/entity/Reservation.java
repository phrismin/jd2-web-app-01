package by.academy.dao.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

public class Reservation implements Serializable {
    private static final long serialVersionUID = 9L;

    private Long id;
    private String orderNumber;
    private Time startReservTime;
    private Time endReservTime;
    private Integer startMileage;
    private Integer endMileage;
    private String description;
    private User user;
    private Car car;
    private ReservationStatus reservationStatus;

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Time getStartReservTime() {
        return startReservTime;
    }

    public void setStartReservTime(Time startReservTime) {
        this.startReservTime = startReservTime;
    }

    public Time getEndReservTime() {
        return endReservTime;
    }

    public void setEndReservTime(Time endReservTime) {
        this.endReservTime = endReservTime;
    }

    public Integer getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(Integer startMileage) {
        this.startMileage = startMileage;
    }

    public Integer getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(Integer endMileage) {
        this.endMileage = endMileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) && Objects.equals(orderNumber, that.orderNumber)
                && Objects.equals(startReservTime, that.startReservTime)
                && Objects.equals(endReservTime, that.endReservTime)
                && Objects.equals(startMileage, that.startMileage)
                && Objects.equals(endMileage, that.endMileage)
                && Objects.equals(description, that.description) && Objects.equals(user, that.user)
                && Objects.equals(car, that.car) && reservationStatus == that.reservationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, startReservTime, endReservTime, startMileage,
                endMileage, description, user, car, reservationStatus);
    }
}
