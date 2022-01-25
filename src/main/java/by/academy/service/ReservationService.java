package by.academy.service;

import by.academy.entity.Reservation;
import by.academy.entity.ReservationStatus;

import java.util.List;

public interface ReservationService {

    boolean reservation(Reservation reservation);

    List<Reservation> findReservationCars(ReservationStatus status);

    boolean addReservation(Reservation reservation);

}
