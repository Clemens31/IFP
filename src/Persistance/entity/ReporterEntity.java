package Persistance.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "reporter")
public class ReporterEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name = "id_reporter")
    private int id;

    @Column (name = "name")
    private String pseudo ;

    @Column (name = "credit")
    private int credit;

    public ReporterEntity(){}

    public ReporterEntity(int id, String pseudo, int credit) {
        this.id = id;
        this.pseudo = pseudo;
        this.credit = credit;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReporterEntity that = (ReporterEntity) o;
        return id == that.id &&
                credit == that.credit &&
                Objects.equals(pseudo, that.pseudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pseudo, credit);
    }

    @Override
    public String toString() {
        return "ReporterEntity{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", credit=" + credit +
                '}';
    }
}
