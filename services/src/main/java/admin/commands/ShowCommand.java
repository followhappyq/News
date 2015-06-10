package admin.commands;

import dao.Dao;
import dao.MyDao;
import data.Page;
import data.PagesEntity;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ShowCommand extends Command {
    private static final Logger log = Logger.getLogger(ShowCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");
        List<PagesEntity> list;
        List<PagesEntity> subList;
        Iterator<PagesEntity> pageIterator;
        Dao dao = MyDao.getDao();
        list = dao.getPagesByParent("main");
        pageIterator = list.iterator();
        StringBuffer st = new StringBuffer();
        st.append("<ul>");
        while (pageIterator.hasNext())     // ���������� ��� ���������
        {
            PagesEntity Page = pageIterator.next();
            st.append("<li>");
            st.append(Page.getTitle());
            st.append(" <a href=\"adminPanel?operation=edit&id=");
            st.append(Page.getId());
            st.append("\">Edit</a>");
            st.append(" <a href=\"adminPanel?operation=delete&id=");
            st.append(Page.getId());
            st.append("\">Delete</a>");
            //st.append("</a>");

            subList = dao.getPagesByParent(Page.getId());
            Iterator<PagesEntity> subpageIterator = subList.iterator();

            st.append("<ul>");
            while (subpageIterator.hasNext()) {
                PagesEntity subPage = subpageIterator.next();
                st.append("<li>");
                st.append(subPage.getId());
                st.append(" | ");
                st.append(subPage.getTitle());
                st.append(" | ");
                st.append(subPage.getDate());
                st.append(" | ");
                st.append(" <a href=\"adminPanel?operation=edit&id=");
                st.append(subPage.getId());
                st.append("\">Edit</a>");
                st.append(" <a href=\"adminPanel?operation=delete&id=");
                st.append(subPage.getId());
                st.append("\">Delete</a>");
                st.append("</li>");
            }
            st.append("<li><a href=\"adminPanel?operation=add&id=");
            st.append(Page.getId());
            st.append("\">Add page</a></li>");
            st.append("</ul>");
            st.append("</li>");
        }
        st.append("<li><a href=\"adminPanel?operation=add&id=main\">");
        st.append("Add page</a></li>");
        st.append("<ul><li><a href=\\>На главную</a></li></ul>");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/mainadmin.jsp");
        request.setAttribute("menu", st.toString());
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            log.error("NumberFormatException � ������ execute ������ EditWriteCommand! -- " + e);
            e.printStackTrace();
        } catch (IOException e) {
            log.error("NumberFormatException � ������ execute ������ EditWriteCommand! -- " + e);
            e.printStackTrace();
        }


    }

}
