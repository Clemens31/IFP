package Persistance;

import java.sql.*;

public class ConnectionDatabase {

    public Connection getConnection() throws SQLException {

        // Nom du pilote JDBC
        String nomDriver = "com.mysql.cj.jdbc.Driver";

        try {
            // Chargement du pilote JDBC
            Class.forName(nomDriver);
            System.out.println("**********************************");
            System.out.println("Le pilote JDBC MySQL a été chargé");
            System.out.println("**********************************");


            // Information connexion BDD
            // TODO mettre dans un fichier property
            String url ="jdbc:mysql://localhost:3306/IFP?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String password = "";


            Connection connection = DriverManager.getConnection(url,user,password);
            return connection;

        }catch(ClassNotFoundException cnfe){
            System.out.println("La classe " + nomDriver + " n'a pas été trouvée");
            cnfe.printStackTrace();
            throw  new SQLException(cnfe);
        }
    }

}
