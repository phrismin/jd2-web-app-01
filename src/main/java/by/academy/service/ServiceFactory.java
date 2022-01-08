package by.academy.service;

import by.academy.service.impl.FindCarServiceImpl;
import by.academy.service.impl.FindUserServiceImpl;
import by.academy.service.impl.UserServiceImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImpl();
    private final FindUserService findUserService = new FindUserServiceImpl();
    private final FindCarService findCarService = new FindCarServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public FindUserService getFindUserService() {
        return findUserService;
    }

    public FindCarService getFindCarService() {
        return findCarService;
    }
}
