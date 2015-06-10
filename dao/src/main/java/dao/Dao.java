package dao;

import data.Page;
import data.PagesEntity;
import data.Users;
import data.UsersEntity;

import java.util.List;

public interface Dao {
    PagesEntity getPage(String id);
    List<PagesEntity> getPagesByParent(String parentid);
    int addPage(PagesEntity p);
    int deletePage(PagesEntity p);
    int editPage(PagesEntity p);
    UsersEntity getUser(String email);
    UsersEntity getUser(int idu);
    int addUser(UsersEntity user);
    List<UsersEntity> getUsers();


}