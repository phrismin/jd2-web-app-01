package by.academy.service;

import by.academy.entity.User;

import java.util.List;

public interface FindUserService {

    List<User> showAllUsers();

    User showUser();

}
