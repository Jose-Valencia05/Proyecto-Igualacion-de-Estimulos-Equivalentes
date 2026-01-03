import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Acces {

    static Connection con = null;
    static String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    static String url = "jdbc:ucanaccess://C:\\Users\\Usuario\\Documents\\P_Test\\Pacientes.accbd";

    public static Connection obtenerConexion() {

        try {
            
            if (con == null) {
                Class.forName(driver);
                con = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexion corrercta");                
            }



        } catch (Exception ex) {
            
            ex.printStackTrace();
            con = null;

        }

        return con;

    }

    public static void main(String[] args){

        Connection cn = Conexion.obtenerConexion();

    }

}