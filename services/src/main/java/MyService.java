import dao.Dao;
import dao.MyDao;
import data.Page;
import data.PagesEntity;
import data.UsersEntity;

import java.util.List;

import static org.junit.Assert.assertSame;
/**
 * Created by ragexe on 09.05.2015.
 */
public class MyService implements Service {
    private Dao dao;// = MyDao.getDao();

    public MyService() {
        dao = MyDao.getDao();
    }

    @Override
    public PagesEntity getPage(String id) {
        return dao.getPage(id);
    }

    @Override
    public List<PagesEntity> getPagesByParent(String parentid) {
        return dao.getPagesByParent(parentid);
    }

    @Override
    public int addPage(PagesEntity p) {
        return dao.addPage(p);
    }

    @Override
    public int deletePage(PagesEntity p) {
        return dao.deletePage(p);
    }

    @Override
    public int editPage(PagesEntity p) {
        return dao.editPage(p);
    }

    @Override
    public UsersEntity getUser(String email) {
        return dao.getUser(email);
    }

    @Override
    public UsersEntity getUser(int idu) {
        return dao.getUser(idu);
    }

    @Override
    public List<UsersEntity> getUsers() {
        return dao.getUsers();
    }
}
