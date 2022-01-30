package by.academy.service;

import by.academy.dao.entity.Role;
import by.academy.dao.entity.User;
import by.academy.dao.entity.UserInfo;

import java.util.List;
import java.util.Optional;

public interface FindUserService {

    List<User> findAllUsers();

    Optional<User> findById(Integer id);

    Optional<User> findByName(String name);

    Role getRoleByLoginAndPassword(String login, String password);

    boolean isExistUser(String login, String password);

    Optional<UserInfo> findUserInfo();

}
