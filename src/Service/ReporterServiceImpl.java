package Service;

import Persistance.entity.ReporterEntity;
import Persistance.MyManagerFactory;
import Persistance.Repository.ReporterRepository;

import javax.persistence.EntityManager;

public class ReporterServiceImpl implements ReporterRepository{


    public ReporterEntity find(Integer id){

        /* Implémentation de la factory */
        MyManagerFactory myManagerFactory = new MyManagerFactory();

        /* Création de notre objet EntityManager via la factory */
        EntityManager entityManager;

        entityManager = myManagerFactory.getEntityManagerFactory();
        ReporterEntity reporterEntity = entityManager.find(ReporterEntity.class,id);
        entityManager.close();
        myManagerFactory.close();

        return reporterEntity;
    }



}
