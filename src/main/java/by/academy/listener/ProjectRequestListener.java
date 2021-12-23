package by.academy.listener;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ProjectRequestListener implements HttpSessionListener {

    public ProjectRequestListener() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpServletRequest servletRequest = (HttpServletRequest) se.getSession();
        System.out.println("Session from " + servletRequest.getContextPath()
                + " was created.");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpServletRequest servletRequest = (HttpServletRequest) se.getSession();
        System.out.println("Session from " + servletRequest.getContextPath()
                + " was destroyed.");
    }
}
