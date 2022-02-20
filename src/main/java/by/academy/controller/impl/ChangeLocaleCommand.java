package by.academy.controller.impl;

import by.academy.controller.Command;
import by.academy.controller.locale.LocaleManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChangeLocaleCommand implements Command {
    private static final String URL = "url";
    private static final String COMMAND = "command";
    private static final String LOCALE = "locale";
    private static final String LOCALE_RU = "ru";
    private static final String LOCALE_EN = "en";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        System.out.println("ChangeLocaleCommand");

        String locale = req.getParameter(COMMAND);
        LocaleManager localeManager = LocaleManager.getInstance();

        if (locale.equals(LOCALE_RU)) {
            ResourceBundle resourceBundleRU = localeManager.getResourceBundleRU();
            Locale localeRU = resourceBundleRU.getLocale();
            req.getSession().setAttribute(LOCALE, localeRU);
        }
        if (locale.equals(LOCALE_EN)) {
            ResourceBundle resourceBundleEN = localeManager.getResourceBundleEN();
            Locale localeEN = resourceBundleEN.getLocale();
            req.getSession().setAttribute(LOCALE, localeEN);
        }

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
