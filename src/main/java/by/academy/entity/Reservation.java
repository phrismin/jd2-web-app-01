package by.academy.entity;

import java.sql.Time;

public class Reservation {
    private static final long SerialVersionUID = 3;

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
}
