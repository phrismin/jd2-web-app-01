package by.academy.service;

import by.academy.service.impl.*;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final UserService userService = new UserServiceImpl();
    private final FindCarService findCarService = new FindCarServiceImpl();
    private final ClassService classService = new ClassServiceImpl();
    private final OrderService orderService = new OrderServiceImpl();

    private ServiceFactory() {
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public FindCarService getFindCarService() {
        return findCarService;
    }


    public ClassService getClassService() {
        return classService;
    }

}
