package Persistance.dao;

import Persistance.MyManagerFactory;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateBasicTest {

    @Test
    void sessionOk() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");
    }



}
