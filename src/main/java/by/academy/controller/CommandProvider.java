package by.academy.controller;

import by.academy.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public final class CommandProvider {

    private final Map<String, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put("Log in", new LogInCommand());
        commands.put("Sign up", new SignUpCommand());

        commands.put("GO_TO_AUTHORIZATION_PAGE", new GoToAuthorizationPage());
        commands.put("GO_TO_REGISTRATION_PAGE", new GoToRegistrationPage());
        commands.put("GO_TO_INDEX_PAGE", new GoToIndexPage());
        commands.put("GO_TO_MAIN_PAGE", new GoToMainPage());
    }

    public Command getCommand(String commandName) {
        Command command = commands.get(commandName);
        return command;
    }
}
