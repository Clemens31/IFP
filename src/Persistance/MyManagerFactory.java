package Persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyManagerFactory {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-persistence-unit");

    public EntityManager getEntityManagerFactory() {
        return entityManagerFactory.createEntityManager();
    }

}
