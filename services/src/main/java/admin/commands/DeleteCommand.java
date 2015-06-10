package admin.commands;

import dao.Dao;
import dao.MyDao;
import data.Page;
import data.PagesEntity;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCommand extends Command {
    private static final Logger log = Logger.getLogger(DeleteCommand.class);
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");
        PagesEntity page = (Page)request.getAttribute("pageBean");//получаем бин пэйдж
        Dao dao = MyDao.getDao();
        try {
            dao.deletePage(page);
            response.sendRedirect("admpanel.jsp");
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }

}
