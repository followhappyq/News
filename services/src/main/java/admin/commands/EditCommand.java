package admin.commands;


import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class EditCommand extends Command {
    private static final Logger log = Logger.getLogger(EditCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            log.error("ServletException � ������ execute ������ EditCommand!" + e); // ������ � ���-����
            e.printStackTrace();
        } catch (IOException e1) {
            log.error("IOException � ������ execute ������ EditCommand! -- " + e1); // ������ � ���-����
            e1.printStackTrace();
        }
    }
}
