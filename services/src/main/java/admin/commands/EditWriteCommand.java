package admin.commands;

import dao.Dao;
import dao.MyDao;
import data.Page;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditWriteCommand extends Command {
    private static final Logger log = Logger.getLogger(EditWriteCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page();
        Dao dao = MyDao.getDao();
        response.setContentType("text/html; charset=UTF-8");
        try {
            page.setId(request.getParameter("id"));
            page.setParentid(request.getParameter("parentid"));
            page.setTitle(request.getParameter("title"));
            page.setTitle4menu(request.getParameter("title4menu"));
            page.setUser(Integer.parseInt(request.getParameter("user")));
            page.setDate(request.getParameter("date"));
            page.setMaintext(request.getParameter("maintext"));
            dao.editPage(page);
            response.sendRedirect("admpanel.jsp");
        } catch (IOException e) {
            log.error("IOException � ������ execute ������ EditWriteCommand! -- " + e); // ������ � ���-����
            e.printStackTrace();
        } catch (NumberFormatException e2) {
            log.error("NumberFormatException � ������ execute ������ EditWriteCommand! -- " + e2); // ������ � ���-����
            e2.printStackTrace();
        } catch (NullPointerException e1) {
            log.error("NullPointerException � ������ execute ������ EditWriteCommand! -- " + e1); // ������ � ���-����
            e1.printStackTrace();
        }

    }

}
