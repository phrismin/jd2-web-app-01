package by.academy.controller;

import by.academy.controller.impl.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class CommandProvider implements Serializable {
    private static final long serialVersionUID = 12L;

    private final Map<String, Command> commands = new HashMap<>();

    private static final String LOG_IN_COMMAND = "Log in";
    private static final String SIGN_IN_COMMAND = "Sign up";
    private static final String SIGN_OUT_COMMAND = "Sign out";

    private static final String AUTHORIZATION_PAGE = "GO_TO_AUTHORIZATION_PAGE";
    private static final String REGISTRATION_PAGE = "GO_TO_REGISTRATION_PAGE";
    private static final String INDEX_PAGE = "GO_TO_INDEX_PAGE";
    private static final String MAIN_PAGE = "GO_TO_MAIN_PAGE";
    private static final String ERROR_PAGE = "GO_TO_ERROR_PAGE";
    private static final String CLASSES_PAGE = "GO_TO_CLASSES_PAGE";
    private static final String BUDGET_CAR_PAGE = "GO_TO_BUDGET_CAR_PAGE";
    private static final String MIDDLE_CAR_PAGE = "GO_TO_MIDDLE_CAR_PAGE";
    private static final String BUSINESS_CAR_PAGE = "GO_TO_BUSINESS_CAR_PAGE";
    private static final String PREMIUM_CAR_PAGE = "GO_TO_PREMIUM_CAR_PAGE";
    private static final String SUV_CAR_PAGE = "GO_TO_SUV_CAR_PAGE";
    private static final String BUS_CAR_PAGE = "GO_TO_BUS_CAR_PAGE";
    private static final String CONVERTIBLE_CAR_PAGE = "GO_TO_CONVERTIBLE_CAR_PAGE";
    private static final String EXCLUSIVE_CAR_PAGE = "GO_TO_EXCLUSIVE_CAR_PAGE";

    public CommandProvider() {
        commands.put(LOG_IN_COMMAND, new LogInCommand());
        commands.put(SIGN_IN_COMMAND, new SignUpCommand());
        commands.put(SIGN_OUT_COMMAND, new SignOutCommand());

        commands.put(AUTHORIZATION_PAGE, new GoToAuthorizationPage());
        commands.put(REGISTRATION_PAGE, new GoToRegistrationPage());
        commands.put(INDEX_PAGE, new GoToIndexPage());
        commands.put(MAIN_PAGE, new GoToMainPage());
        commands.put(ERROR_PAGE, new GoToErrorPage());
        commands.put(CLASSES_PAGE, new GoToClassPage());
        commands.put(BUDGET_CAR_PAGE, new GoToCarPage());
        commands.put(MIDDLE_CAR_PAGE, new GoToCarPage());
        commands.put(BUSINESS_CAR_PAGE, new GoToCarPage());
        commands.put(PREMIUM_CAR_PAGE, new GoToCarPage());
        commands.put(SUV_CAR_PAGE, new GoToCarPage());
        commands.put(BUS_CAR_PAGE, new GoToCarPage());
        commands.put(CONVERTIBLE_CAR_PAGE, new GoToCarPage());
        commands.put(EXCLUSIVE_CAR_PAGE, new GoToCarPage());
    }

    public Command getCommand(String commandName) {
        Command command = commands.get(commandName);
        return command;
    }
}
