import java.sql.*;

public class Conexion {

    private String bd = "test";
    private String login = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/"+bd;
    private Connection conn = null;

    public Conexion() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            
            if (conn != null) {
                System.out.println("OK base de datos " + bd + " listo");
            }

        } catch (SQLException e) {

            System.out.println(e);

        } catch (ClassNotFoundException e) {

            System.out.println(e);            

        }
    }

    public Connection getConnection() {

        return this.conn;

    }

    public Object[][] Select_Persona() {

        int registros = 0;

        String consulta = "Select p_id,p_nombre,p_apellido,p_edad FROM persona ";
        String consulta2 = "Select count(*) as total from persona ";

        try {
            
            PreparedStatement pstm = conn.prepareStatement(consulta2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();

        } catch (SQLException e) {

            System.out.println(e);
            
        }

        Object[][] data = new String[registros][4];

        try {
            
            PreparedStatement pstm = conn.prepareStatement(consulta);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            
            while(res.next()) {

                data[i][0] = res.getString("p_id");
                data[i][1] = res.getString("p_nombre");
                data[i][2] = res.getString("p_apellido");
                data[i][3] = res.getString("p_edad");

                i++;

            }

            res.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        return data;

    }

    public boolean update(String valores, String id) {
        boolean res = false;
        String q = " UPDATE persona SET " + valores + " WHERE p_id= " + id;
 
        try {
            
            PreparedStatement pstm = conn.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;


        } catch (Exception e) {

            System.out.println(e);

        }

        return res;

    }
}