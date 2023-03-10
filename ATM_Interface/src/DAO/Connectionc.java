package DAO;
import java.sql.*;

public class Connectionc {
    public static void main(String[] args){
        String url= "jdbc:mysql://localhost:4306/atm";
        String username="root";
        String password = "";
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection= DriverManager.getConnection(url, username, password);

                Statement statement = connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from users");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+resultSet.getString(4)+" "+resultSet.getInt(5));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
