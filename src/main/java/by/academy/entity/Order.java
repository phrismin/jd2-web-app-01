package by.academy.entity;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

public class Order implements Serializable {
    private static final long serialVersionUID = 9L;

    private Long id;
    private String orderNumber;
    private Timestamp reservTime;
    private LocalDate startReservDate;
    private LocalDate endReservDate;
    private Integer startMileage;
    private Integer endMileage;
    private String description;
    private User user;
    private Car car;
    private ReservationStatus reservationStatus;

    public Order() {
    }

    public Timestamp getReservTime() {
        return reservTime;
    }

    public void setReservTime(Timestamp reservTime) {
        this.reservTime = reservTime;
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

    public LocalDate getStartReservDate() {
        return startReservDate;
    }

    public void setStartReservDate(LocalDate startReservDate) {
        this.startReservDate = startReservDate;
    }

    public LocalDate getEndReservDate() {
        return endReservDate;
    }

    public void setEndReservDate(LocalDate endReservDate) {
        this.endReservDate = endReservDate;
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
        Order that = (Order) o;
        return Objects.equals(id, that.id) && Objects.equals(orderNumber, that.orderNumber)
                && Objects.equals(startReservDate, that.startReservDate)
                && Objects.equals(endReservDate, that.endReservDate)
                && Objects.equals(startMileage, that.startMileage)
                && Objects.equals(endMileage, that.endMileage)
                && Objects.equals(description, that.description) && Objects.equals(user, that.user)
                && Objects.equals(car, that.car) && reservationStatus == that.reservationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, startReservDate, endReservDate, startMileage,
                endMileage, description, user, car, reservationStatus);
    }
}
