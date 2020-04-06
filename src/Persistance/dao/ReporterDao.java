package Persistance.dao;

import Domain.DTO.ReporterDTO;
import Persistance.ConnectionDatabase;
import Persistance.Exception.NoDataFoundException;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReporterDao {

    public ReporterDTO getReporterById (int id) throws SQLException, NoDataFoundException {

        // Création d'une instance de la classe ConnectionDatabase
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        // Création d'une instance de la classe ReporterDTO
        ReporterDTO reporterDTO = new ReporterDTO();

        try{
            // Appel de la méthode pour récupérer la connexion
            var connection = connectionDatabase.getConnection();
            var statement = connection.createStatement();

            // Requete SQL
            ResultSet resultSet = statement.executeQuery("SELECT * from reporter WHERE id_reporter= " + id);


            System.out.println(" ");
            System.out.println("AFFICHAGE DU REPORTER PAR L'ID : ");
            System.out.println(" ");


            if(resultSet.next()){
                reporterDTO.setId(resultSet.getInt(1));
                reporterDTO.setPseudo(resultSet.getString(2));
                reporterDTO.setCredit(resultSet.getInt(3));

            // Affichage de mon reporter
            System.out.println(reporterDTO.toString());

            // Fermeture
            connection.close();

            return reporterDTO;
            }else {
                throw new NoDataFoundException("Data not found in ReporterDAO: getReporterById");
            }

        }catch (SQLException e){
            e.printStackTrace();
            throw e;
        }
    }


}
