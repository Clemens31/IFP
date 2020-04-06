package Persistance.dao;

import Domain.NewsBean;
import Persistance.ConnectionDatabase;
import Persistance.Exception.NoDataFoundException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsDao {

    public NewsBean getNewsById(int id) throws SQLException, NoDataFoundException {

        // Création d'une instance de la classe ConnectionDatabase
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        // Création d'une instance de la classe NewsDTO
        NewsBean newsBean = new NewsBean();

        try {
            var connection = connectionDatabase.getConnection();
            var statement = connection.createStatement(); // CHANGER par prepareStatement

            // Requete SQL
            ResultSet resultSet = statement.executeQuery("SELECT * from news WHERE id_news= " + id);


            System.out.println(" ");
            System.out.println("AFFICHAGE DES NEWS : ");
            System.out.println(" ");

            if(resultSet.next()){
                TranferStatementOnObjectBean(resultSet, newsBean );

                // Affichage de ma new
                System.out.println(newsBean.toString());

                // Fermeture Connexion
                connection.close();

                return newsBean;
            }else {
                throw new NoDataFoundException("Data not found in NewsDao::getNewsById()");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public NewsBean TranferStatementOnObjectBean(ResultSet resultSet, NewsBean newsBean) throws SQLException{
        newsBean.setId(resultSet.getInt(1));
        newsBean.setTitle(resultSet.getString(2));
        newsBean.setContain(resultSet.getString(3));
        newsBean.setDate(resultSet.getDate(4));
        newsBean.setReporter(resultSet.getString(5));

        return newsBean;
    }


}
