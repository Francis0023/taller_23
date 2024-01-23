import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static JFrame frame = new JFrame("primera pantalla");
    public static void main(String[] args) {
        frame.setContentPane(new forma1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

//        // Conexion base de datos
//        String dburl="jdbc:mysql://localhost:3306/usuarios"; //Nombre de la base de datos conexion
//        String dbusername="root";
//        String dbcontraseña="";
//        java.sql.Connection connection=null;
//
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(dburl,dbusername,dbcontraseña);
//
//            Statement statement;
//            statement=connection.createStatement();
//            java.sql.ResultSet resultSet;
//            resultSet=statement.executeQuery("select * from Datos");
//            String nombre;
//            int contraseña;
//
//            while (resultSet.next()){
//                nombre=resultSet.getString("Nombre");
//                contraseña=resultSet.getInt("contraseña");
//                System.out.println(nombre+"    "+contraseña);
//            }
//        }catch (Exception ex){
//            System.out.println(ex);
//        }



    }
}
