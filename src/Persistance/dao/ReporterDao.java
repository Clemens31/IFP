package Persistance.dao;

import Persistance.ConnectionDatabase;

import java.sql.ResultSet;

public class ReporterDao {

    public void getAllReporter (){

        // Création d'une instance de la classe ConnectionDatabase
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();

        try{
            // Appel de la méthode pour récupérer la connexion
            var connection = connectionDatabase.getConnection();
            var statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM reporter ");


            // Affichage de mes reporters
            while(resultSet.next()){
                System.out.println("ID : " + resultSet.getInt(1) + " ");
                System.out.println("Name : " + resultSet.getString(2)+ " ");
                System.out.println("Credit : " + resultSet.getInt(3));
                System.out.println("   **********************  ");

            }
            connection.close();


        }catch (Exception e){

        }

    }

}
