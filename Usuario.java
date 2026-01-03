import java.sql.*;
import java.sql.Driver;

public class Usuario {
    
    private String nom;
    private String ape;
    private int eda;
    private String carr;
    private int asc;
    
    public Usuario(){}
     
    public Usuario(String nom, String ape, int eda, String carr, int asc) {
        this.nom=nom;
        this.ape = ape;
        this.eda = eda;
        this.carr = carr;
        this.asc = asc;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return ape;
    }

    public void setApellido(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return eda;
    }

    public void setEdad(int eda) {
        this.eda = eda;
    }

    public String getCarrera() {
        return carr;
    }

    public void setCarrera(String carr) {
        this.carr = carr;
    }

    public int getAciertos() {
        return asc;        
    }

    public void setAciertos() {
        this.asc = asc;        
    }

    /*public void IngresarDatos(){
        Conexion MySQLConnect = new Conexion();
        Connection conexion = Conexion.MySQLConnect();
        String query = "INSERT INTO usuarios (id, nom, ape, eda, car, aci) values(?,?,?,?,?,?)";
        try {
            
            PreparedStatement tes = conexion.prepareStatement(query);
            
            tes.setString(2, nom);
            tes.setString(3, ape);
            tes.setInt(4, eda);
            tes.setString(5, carr);
            tes.setInt(6, asc);
            
            tes.executeUpdate();
            System.out.println("Ya chingo wey");
            conexion.close();
        } catch (Exception e) {
            System.out.println("Te rechazó de nuez");
            //TODO: handle exception
        }
    }
    */
}