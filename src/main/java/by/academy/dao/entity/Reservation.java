package by.academy.dao.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

public class Reservation implements Serializable {
    private static final long serialVersionUID = 9L;

    private Long id;
    private String orderNumber;
    private ReservationStatus reservationStatus;
    private Time startTime;
    private Time endTime;
    private Time reservTime;
    private String description;

    public Reservation() {
    }

    public Reservation(Long id, String orderNumber, ReservationStatus reservationStatus,
                       Time startTime, Time endTime, Time reservTime, String description) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.reservationStatus = reservationStatus;
        this.startTime = startTime;
        this.endTime = endTime;
        this.reservTime = reservTime;
        this.description = description;
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

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Time getReservTime() {
        return reservTime;
    }

    public void setReservTime(Time reservTime) {
        this.reservTime = reservTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) && Objects.equals(orderNumber, that.orderNumber)
                && reservationStatus == that.reservationStatus && Objects.equals(startTime, that.startTime)
                && Objects.equals(endTime, that.endTime) && Objects.equals(reservTime, that.reservTime)
                && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, reservationStatus, startTime, endTime, reservTime, description);
    }
}
