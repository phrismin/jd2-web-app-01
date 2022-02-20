package by.academy.controller.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("AuthFilter");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        HttpSession session = req.getSession();
        if (session == null && session.getAttribute("userName") == null) {
            session.setAttribute("errorMessage", "Please, Log in");
            resp.sendRedirect("controller?command=GO_TO_INDEX_PAGE");
        } else {
            filterChain.doFilter(req, resp);
        }
    }
}
