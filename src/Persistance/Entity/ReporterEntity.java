package Persistance.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reporter")
public class ReporterEntity {

    @Id
    @Column (name = "id_reporter")
    private int id;

    @Column (name = "name")
    private String pseudo ;

    @Column (name = "credit")
    private int credit;

}
