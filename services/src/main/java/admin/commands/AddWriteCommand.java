package admin.commands;

import dao.Dao;
import dao.MyDao;
import data.Page;

import data.PagesEntity;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddWriteCommand extends Command {
    private static final Logger log = Logger.getLogger(AddWriteCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        PagesEntity page = new PagesEntity();
        Dao dao = MyDao.getDao();
        try {
            page.setId(request.getParameter("id"));
            page.setParentid(request.getParameter("parentid"));
            page.setTitle(request.getParameter("title"));
            page.setTitle4Menu(request.getParameter("title4menu"));
            page.setUser(Integer.parseInt(request.getParameter("user")));
            page.setDate(request.getParameter("date"));
            page.setMaintext(request.getParameter("maintext"));
            dao.addPage(page);
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            log.error("IOException � ������ execute ������ AddWriteCommand! -- " + e); // ������ � ���-����
            e.printStackTrace();
        } catch (NumberFormatException e2) {
            log.error("NumberFormatException � ������ execute ������ AddWriteCommand! -- " + e2); // ������ � ���-����
            e2.printStackTrace();
        } catch (NullPointerException e1) {
            log.error("NullPointerException � ������ execute ������ AddWriteCommand! -- " + e1); // ������ � ���-����
            e1.printStackTrace();
        }
    }
}
