package sample;

import java.sql.*;

public class Database {
    public void init(){
        final String DATABASE_URL = "jdbc:postgresql://localhost:5432/student";
        final String user = "ahmet";
        final String pass = "postgre";
        final String SELECT_QUERY = "SELECT * FROM STUDENT";

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Statement statement = null;

        try{
            Connection connection = DriverManager.getConnection(DATABASE_URL,user, pass);
            statement = connection.createStatement();
            ResultSet res = statement.executeQuery(SELECT_QUERY);

            while(res.next()){
                System.out.println(res.getInt("No"));
                System.out.println(res.getString("Name&Surname"));
                System.out.println(res.getString("Department"));
            }
        }
        catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
