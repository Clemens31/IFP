package Domain;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class NewsBean {

    // Attributs
    private int id;
    private String title ;
    private String contain ;
    private Date date ;
    private List<String> tagList;
    private String reporter;

    // Constructeur
    public NewsBean() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contain='" + contain + '\'' +
                ", date=" + date +
                ", tagList=" + tagList +
                ", reporter='" + reporter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsBean newsBean = (NewsBean) o;
        return id == newsBean.id &&
                Objects.equals(title, newsBean.title) &&
                Objects.equals(contain, newsBean.contain) &&
                Objects.equals(date, newsBean.date) &&
                Objects.equals(tagList, newsBean.tagList) &&
                Objects.equals(reporter, newsBean.reporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, contain, date, tagList, reporter);
    }
}
