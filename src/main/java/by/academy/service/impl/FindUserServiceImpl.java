package by.academy.service.impl;

import by.academy.entity.Role;
import by.academy.entity.User;
import by.academy.entity.UserInfo;
import by.academy.service.FindUserService;

import java.util.List;
import java.util.Optional;

public class FindUserServiceImpl implements FindUserService {
    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByName(String name) {
        return null;
    }

    @Override
    public Role getRoleByLoginAndPassword(String login, String password) {
        return null;
    }

    @Override
    public boolean isExistUser(String login, String password) {
        return false;
    }

    @Override
    public Optional<UserInfo> findUserInfo() {
        return Optional.empty();
    }

}
