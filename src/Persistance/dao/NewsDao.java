package Persistance.dao;

import Domain.DTO.NewsDTO;
import Persistance.ConnectionDatabase;
import Persistance.Exception.NoDataFoundException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsDao {

    public NewsDTO getNewsById(int id) throws SQLException, NoDataFoundException {

        // Création d'une instance de la classe ConnectionDatabase
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        // Création d'une instance de la classe NewsDTO
        NewsDTO newsDTO = new NewsDTO();

        try {
            var connection = connectionDatabase.getConnection();
            var statement = connection.createStatement();

            // Requete SQL
            ResultSet resultSet = statement.executeQuery("SELECT * from news WHERE id_news= " + id);


            System.out.println(" ");
            System.out.println("AFFICHAGE DES NEWS : ");
            System.out.println(" ");

            if(resultSet.next()){
                newsDTO.setId(resultSet.getInt(1));
                newsDTO.setTitle(resultSet.getString(2));
                newsDTO.setContain(resultSet.getString(3));
                newsDTO.setDate(resultSet.getString(4));
                newsDTO.setId_reporter(resultSet.getInt(5));

                // Affichage de ma new
                System.out.println(newsDTO.toString());

                // Fermeture Connexion
                connection.close();

                return newsDTO;
            }else {
                throw new NoDataFoundException("Data not found in NewsDao::getNewsById()");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }



}
