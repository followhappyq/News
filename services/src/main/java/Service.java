import data.Page;
import data.PagesEntity;
import data.Users;
import data.UsersEntity;

import java.util.List;

/**
 * Created by ragexe on 09.05.2015.
 */
public interface Service {
    PagesEntity getPage(String id);
    List<PagesEntity> getPagesByParent(String parentid);
    int addPage(PagesEntity p);
    int deletePage(PagesEntity p);
    int editPage(PagesEntity p);
    UsersEntity getUser(String email);
    UsersEntity getUser(int idu);
    List<UsersEntity> getUsers();
}

