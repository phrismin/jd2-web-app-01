package by.academy.service;

import by.academy.dao.entity.Reservation;
import by.academy.dao.entity.ReservationStatus;

import java.util.List;

public interface ReservationService {

    boolean reservation(Reservation reservation);

    List<Reservation> findReservationCars(ReservationStatus status);

    boolean addReservation(Reservation reservation);

}
