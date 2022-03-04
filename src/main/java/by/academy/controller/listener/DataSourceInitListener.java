package by.academy.controller.listener;

import by.academy.dao.connection.ConnectionPool;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DataSourceInitListener implements ServletContextListener {
    private static final Logger logger = LogManager.getLogger(DataSourceInitListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ConnectionPool.getInstance();
        logger.info("ServletContext init");
        System.out.println("ServletContext init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ConnectionPool.getInstance().dispose();
        logger.info("ServletContext destroy");
        System.out.println("ServletContext destroy");
    }
}
