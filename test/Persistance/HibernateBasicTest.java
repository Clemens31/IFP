package Persistance;

import org.junit.jupiter.api.Test;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateBasicTest {

    @Test
    void sessionOk() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");
    }



}
