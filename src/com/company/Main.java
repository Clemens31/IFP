package com.company;
import Persistance.Exception.NoDataFoundException;
import Persistance.dao.NewsDao;
import Persistance.dao.ReporterDao;

import java.sql.SQLException;


public class Main {

    public static void main(String[] args)  {

        // 1. Lire un reporter par son id :
        
        ReporterDao reporterDao = new ReporterDao();
        reporterDao.getAllReporter();

        // 2. Lire une new
        // 2.1 avec son journaliste
        NewsDao newsDao = new NewsDao();
        try {
            newsDao.getNewsById(2);
        } catch (SQLException | NoDataFoundException e) {
            e.printStackTrace();
            System.exit((-1));
        }

        // 2.2 en récupérant la liste de tags


        // 3 Ecrire une news
        // 3.1 Générer l'ID de reporter


        // 3.2 Gérer la liste des tags
    }

}
