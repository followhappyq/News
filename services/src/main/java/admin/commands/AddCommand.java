package admin.commands;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCommand extends admin.commands.Command {
    private static final Logger log = Logger.getLogger(AddCommand.class);


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/add.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            log.error("ServletException � ������ execute ������ AddCommand!" + e.getMessage()); // ������ � ���-����
            e.printStackTrace();
        } catch (IOException e1) {
            log.error("IOException � ������ execute ������ AddCommand! -- " + e1.getMessage()); // ������ � ���-����
            e1.printStackTrace();
        }
    }
}
