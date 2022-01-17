package by.academy.controller.listener;

import by.academy.config.ConnectionPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DataSourceInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        ConnectionPool cp = ConnectionPool.getInstance();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.dispose();
        ServletContextListener.super.contextDestroyed(sce);
    }
}
