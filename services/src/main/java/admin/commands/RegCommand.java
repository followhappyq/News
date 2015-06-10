package admin.commands;

import dao.Dao;
import dao.MyDao;
import data.Users;
import data.UsersEntity;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegCommand extends Command {
    private static final Logger log = Logger.getLogger(RegCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        UsersEntity user = new UsersEntity();
        Dao dao = MyDao.getDao();
        try {
            user.setRole(Integer.parseInt(request.getParameter("role")));
            user.setName(request.getParameter("name"));
            user.setLastname(request.getParameter("lastname"));
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            dao.addUser(user);
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }

}
