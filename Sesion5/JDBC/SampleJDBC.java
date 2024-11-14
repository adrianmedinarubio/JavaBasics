
import java.sql.*;

public class SampleJDBC {

    public static void main(String args[]){

        String path = "C:/Users/vn0t09b/Documents/Coaching_Java/Sesion5/JDBC/Students.accdb;";
        String url="jdbc:ucanaccess://" + path;  
        String sqlStatement = "SELECT Id, Nombre, Apellidos, Organización, Nivel" +
                              " FROM Alumnos";
        //String sqlStamenentP = "Select Id, Nombre, Apellidos, Organización, Nivel from Alumnos where Id = ?"; 

        try
        {
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            //PreparedStatement prepStatement = connection.prepareStatement(sqlStatement);
            //prepStatement.setInt(1,1);           
            ResultSet resultSet = statement.executeQuery(sqlStatement);
            //ResultSet resultSet = prepStatement.executeQuery(sqlStatement);

            while(resultSet.next()){  
                System.out.println(resultSet.getObject(1));
                System.out.println(resultSet.getObject(2));
                System.out.println(resultSet.getObject(3));
                System.out.println(resultSet.getObject(4));
                System.out.println(resultSet.getObject(5));
            }

            connection.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
