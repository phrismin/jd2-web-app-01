package by.academy.controller;

import by.academy.controller.impl.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class CommandProvider implements Serializable {
    private static final long serialVersionUID = 12L;

    private final Map<String, Command> commands = new HashMap<>();

    public static final String LOG_IN_COMMAND = "Log in";
    public static final String SIGN_IN_COMMAND = "Sign up";

    public static final String AUTHORIZATION_PAGE = "GO_TO_AUTHORIZATION_PAGE";
    public static final String REGISTRATION_PAGE = "GO_TO_REGISTRATION_PAGE";
    public static final String INDEX_PAGE = "GO_TO_INDEX_PAGE";
    public static final String MAIN_PAGE = "GO_TO_MAIN_PAGE";
    public static final String ERROR_PAGE = "GO_TO_ERROR_PAGE";

    public CommandProvider() {
        commands.put(LOG_IN_COMMAND, new LogInCommand());
        commands.put(SIGN_IN_COMMAND, new SignUpCommand());

        commands.put(AUTHORIZATION_PAGE, new GoToAuthorizationPage());
        commands.put(REGISTRATION_PAGE, new GoToRegistrationPage());
        commands.put(INDEX_PAGE, new GoToIndexPage());
        commands.put(MAIN_PAGE, new GoToMainPage());
        commands.put(ERROR_PAGE, new GoToErrorPage());
    }

    public Command getCommand(String commandName) {
        Command command = commands.get(commandName);
        return command;
    }
}
