import data.Page;
import data.PagesEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ragexe on 17.05.2015.
 */
public class page extends HttpServlet {
    private static final long serialVersionUID = 4L;
    private Service service;
    private PagesEntity page;
    public page() {}

    public void init() throws ServletException {
        super.init();
        service = new MyService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                                                        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String sect = request.getParameter("sect");
        String subsect = request.getParameter("subsect");
        String id;
        if (sect.equals("")){
            id = "main";
        } else if (subsect.equals("")){
            id = sect;
        } else{
            id = subsect;
        }
        page = service.getPage(id);
        request.setAttribute("pageBean", page);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
