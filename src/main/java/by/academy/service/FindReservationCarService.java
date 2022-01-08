package by.academy.service;

import by.academy.entity.Reservation;
import by.academy.entity.User;

import java.util.List;

public interface FindReservationCarService {

    List<Reservation> findByUser(User user);

    List<Reservation> findAllReservation();

}
