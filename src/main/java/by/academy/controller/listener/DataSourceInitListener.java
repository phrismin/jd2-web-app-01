package by.academy.controller.listener;

import by.academy.dao.connection.ConnectionPool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DataSourceInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ConnectionPool.getInstance();
//        logger.log(Level.INFO, "ServletContext init");
        System.out.println("ServletContext init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.getInstance().dispose();
//        logger.log(Level.ERROR, "ServletContext destroy");
        System.out.println("ServletContext destroy");
    }
}
