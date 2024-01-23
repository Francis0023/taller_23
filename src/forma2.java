import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.DriverManager;
import java.sql.Statement;

public class forma2 {
    private JLabel texto1;
    JPanel panel2;
    private JTextArea textArea1;

    public forma2() {
        textArea1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Conexion base de datos
                String dburl="jdbc:mysql://localhost:3306/usuarios"; //Nombre de la base de datos conexion
                String dbusername="root";
                String dbcontraseña="";
                java.sql.Connection connection=null;

                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(dburl,dbusername,dbcontraseña);

                    Statement statement;
                    statement=connection.createStatement();
                    java.sql.ResultSet resultSet;
                    resultSet=statement.executeQuery("select * from Datos");
                    String nombre;
                    int contraseña;

                    while (resultSet.next()){
                        nombre=resultSet.getString("Nombre");
                        contraseña=resultSet.getInt("contraseña");
                        System.out.println(nombre+"    "+contraseña);
                    }
                }catch (Exception ex){
                    System.out.println(ex);
                }
            }
        });
    }

    public void mostrarPantalla() {
        JFrame aplicacion = new JFrame("Pantalla 2");
        aplicacion.setContentPane(new forma2().panel2);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.pack();
        aplicacion.setVisible(true);
    }
}
