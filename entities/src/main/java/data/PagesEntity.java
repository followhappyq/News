package data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "pages", schema = "", catalog = "newsbase")
public class PagesEntity{
    private String id;
    private String parentid;
    private String title;
    private String title4Menu;
    private int user;
    private String date;
    private String maintext;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 10)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parentid", nullable = false, insertable = true, updatable = true, length = 10)
    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "title", nullable = false, insertable = true, updatable = true, length = 80)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "title4menu", nullable = false, insertable = true, updatable = true, length = 50)
    public String getTitle4Menu() {
        return title4Menu;
    }

    public void setTitle4Menu(String title4Menu) {
        this.title4Menu = title4Menu;
    }

    @Basic
    @Column(name = "user", nullable = false, insertable = true, updatable = true)
    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Basic
    @Column(name = "date", nullable = false, insertable = true, updatable = true)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "maintext", nullable = false, insertable = true, updatable = true, length = 65535)
    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PagesEntity that = (PagesEntity) o;

        if (user != that.user) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (maintext != null ? !maintext.equals(that.maintext) : that.maintext != null) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return !(title4Menu != null ? !title4Menu.equals(that.title4Menu) : that.title4Menu != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (title4Menu != null ? title4Menu.hashCode() : 0);
        result = 31 * result + user;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (maintext != null ? maintext.hashCode() : 0);
        return result;
    }
}
