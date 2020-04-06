package Domain;

import java.util.Objects;

public class ReporterBean {

    private int id;
    private String pseudo ;
    private int credit;

    public ReporterBean() {
    }

    public ReporterBean(int i, String bob, int i1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "ReporterBean{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", credit=" + credit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReporterBean that = (ReporterBean) o;
        return id == that.id &&
                credit == that.credit &&
                Objects.equals(pseudo, that.pseudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pseudo, credit);
    }


}
