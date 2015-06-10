package data;

import java.io.Serializable;

public class Page extends PagesEntity implements Serializable {

    private static final long serialVersionUID = 8L;

    public Page() {
    }

    private String id;
    private String parentid;
    private String title;
    private String title4menu;
    private int user;
    private String date;
    private String maintext;

    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getTitle4menu() {
        return title4menu;
    }

    public void setTitle4menu(String title4menu) {
        this.title4menu = title4menu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof Page) {
            Page pd = (Page) obj;

            if (id.equals(pd.id) && parentid.equals(pd.parentid) && title.equals(pd.title) && title4menu.equals(pd.title4menu) && date.equals(pd.date) && maintext.equals(pd.maintext))
                return true;
            else
                return false;
        } else
            return false;

        //return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return id.hashCode();
        //return super.hashCode();
    }


    @Override
    public String toString() {
        return id + " " + parentid + " " + title + " " + title4menu + " " + user + " " + date + " " + maintext;
    }

}
