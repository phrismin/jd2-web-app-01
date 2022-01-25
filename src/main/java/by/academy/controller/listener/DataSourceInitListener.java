package by.academy.controller.listener;

import by.academy.dao.connection.ConnectionPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DataSourceInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        ConnectionPool.getInstance();
        System.out.println("ServletContext init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.getInstance().destroyed();
        ServletContextListener.super.contextDestroyed(sce);
        System.out.println("ServletContext destroy");
    }
}
