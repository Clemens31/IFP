package Persistance.dao;

import Domain.News;
import Persistance.ConnectionDatabase;
import Persistance.Exception.NoDataFoundException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsDao {

    public News getNewsById(int id) throws SQLException, NoDataFoundException {
        // Création d'une instance de la classe ConnectionDatabase
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        // Création d'une instance de la classe News
        News news = new News();

        try {
            var connection = connectionDatabase.getConnection();
            var statement = connection.createStatement();

            // Requete SQL pour récupérer tout depuis
            ResultSet resultSet = statement.executeQuery("SELECT * from news WHERE id_news= " + id);

            if(resultSet.next()){
                System.out.println("AFFICHAGE DES NEWS : ");

                // Ajout dans mon objet du domain des données
                news.setId(resultSet.getInt(1));
                news.setTitle(resultSet.getString(2));
                news.setContain(resultSet.getString(3));
                news.setDate(resultSet.getDate(4));
                news.setId_reporter(resultSet.getInt(5));

                System.out.println(news.getId());
                System.out.println(news.getTitle());
                System.out.println(news.getContain());
                System.out.println(news.getDate());
                System.out.println(news.getId_reporter());

                return news;
            }else {
                throw new NoDataFoundException("Data not found in NewsDao::getNewsById()");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }


}
