package by.academy.controller;

import by.academy.controller.filter.AuthFilter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/", name = "controller")
public class Controller extends HttpServlet {
    public static final Logger logger = LogManager.getLogger(AuthFilter.class);

    public static final long serialVersionUID = 1L;

    private static final String COMMAND = "command";
    private final CommandProvider provider = new CommandProvider();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("Controller");

        logger.info("Controller {}");

        String commandName = req.getParameter(COMMAND);
        Command command = provider.getCommand(commandName);
        command.execute(req, resp);
    }
}
