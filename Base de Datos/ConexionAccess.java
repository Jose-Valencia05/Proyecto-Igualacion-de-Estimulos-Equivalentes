import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConexionAccess
{
    //-- EL ARCHIVO BD "musica.mdb" DEBE DE ESTAR EN LA CARPETA
    //-- DEL PROYECTO PARA QUE FUNCIONE
    private String NombreBD = "Pacientes.mdb";

    private String ConexionBD = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + this.NombreBD;
    private String SentenciaSQL;
    private Connection CanalBD;
    private Statement Instruccion;
    private ResultSet Resultado;

 

    
    public ConexionAccess()
    {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error cargando el driver " + ex);
        }
        try{
            Connection conexion = DriverManager.getConnection("jdbc:odbc: Driver={Microsoft Access Driver (*.mdb)};" 
            + "DBQ=Database","administrador","admin123" ); 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error conectado la base de datos " + ex); 
        }
    }

    public void InsertInsertar(String SentenciaSQL)
    {
        this.SentenciaSQL = SentenciaSQL;

        try
        {
            this.Instruccion.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null,"LA CANCION SE AGREGO CON EXITO A LA BD");
        }
        catch (SQLException SQLE)
        {
            JOptionPane.showMessageDialog(null,"ERROR AL INSERTAR LA CANCION DE LA BD \n ERROR : " + SQLE.getMessage());
        }
    }

    public void UpdateModificar(String SentenciaSQL)
    {
        this.SentenciaSQL = SentenciaSQL;

        try
        {
            this.Instruccion.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null,"LA CANCION SE MODIFICO CON EXITO A LA BD");
        }
        catch (SQLException SQLE)
        {
            JOptionPane.showMessageDialog(null,"ERROR AL MODIFICAR LA CANCION DE LA BD \n ERROR : " + SQLE.getMessage());
        }
    }

    public void DeleteEliminar(String SentenciaSQL)
    {
        this.SentenciaSQL = SentenciaSQL;

        try
        {
            this.Instruccion.executeUpdate(this.SentenciaSQL);
            JOptionPane.showMessageDialog(null,"LA CANCION SE ELIMINO CON EXITO A LA BD");
        }
        catch (SQLException SQLE)
        {
            JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR LA CANCION DE LA BD \n ERROR : " + SQLE.getMessage());
        }
    }

    //-- ESTE METODO DEVUELVE UNA TABLA PARA MOSTRAR
    //-- PERO SI QUIERES LO PUEDES MODIFICAR PARA QUE
    //-- TE DEVUELVA UNA MATRIZ, O LO QUE QUIERAS
    public DefaultTableModel SelectConsultar(String SentenciaSQL)
    {
        //-- ESTO PUEDE VARIAR VARIAR SEGUN A LA BD CON LA QUE TRABAJAS

        this.SentenciaSQL = SentenciaSQL;

        String[] TITULOS = {"ID CANCION","NOMBRE","AUTOR","ALBUM"};
        String[] REGISTRO = new String[4];

        DefaultTableModel TABLA = new DefaultTableModel(null,TITULOS);

        try
        {
            this.Resultado = Instruccion.executeQuery(this.SentenciaSQL);

            while(Resultado.next())
            {
                REGISTRO[0] = Resultado.getString("Id_cancion");
                REGISTRO[1] = Resultado.getString("Nombre");
                REGISTRO[2] = Resultado.getString("Autor");
                REGISTRO[3] = Resultado.getString("Album");

                TABLA.addRow(REGISTRO);
            }
        }
        catch (SQLException SQLE)
        {
            JOptionPane.showMessageDialog(null,"ERROR AL CARGAR LOS DATOS DE LA BD \n ERROR : " + SQLE.getMessage());
        }

        return TABLA;
    }


}