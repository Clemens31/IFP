package Domain.DTO;

import java.util.Date;

public class NewsDTO {

    private int id;
    private String title ;
    private String contain ;
    private String date ;
    private int id_reporter;

    public NewsDTO(){    }

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId_reporter() {
        return id_reporter;
    }

    public void setId_reporter(int id_reporter) {
        this.id_reporter = id_reporter;
    }


    @Override
    public String toString() {
        return "NewsDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contain='" + contain + '\'' +
                ", date='" + date + '\'' +
                ", id_reporter=" + id_reporter +
                '}';
    }
}