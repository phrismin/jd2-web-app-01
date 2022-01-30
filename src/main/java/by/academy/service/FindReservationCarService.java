package by.academy.service;

import by.academy.dao.entity.Reservation;
import by.academy.dao.entity.User;

import java.util.List;

public interface FindReservationCarService {

    List<Reservation> findByUser(User user);

    List<Reservation> findAllReservation();

}
