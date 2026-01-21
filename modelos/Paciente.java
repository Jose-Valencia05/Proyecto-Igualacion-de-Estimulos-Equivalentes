package modelos;

public class Paciente {

    private String strNombres = null;
    private String strApellidos = null;
    private int intEdad;
    private String strCarrera = null;
    private int intSemestre;

    public Paciente(String strNombre, String strApellidos, int intEdad, String strCarrera, int intSemestre) {
        this.strNombres = strNombre;
        this.strApellidos = strApellidos;
        this.intEdad = intEdad;
        this.strCarrera = strCarrera;
        this.intSemestre = intSemestre;
    }

    public void setNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getNombres() {
        return this.strNombres;
    }

    public void setApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

    public String getApellidos() {
        return this.strApellidos;
    }

    public void setEdad(int intEdad) {
        this.intEdad = intEdad;
    }

    public int getEdad() {
        return this.intEdad;
    }

    public void setCarrera(String strCarrera) {
        this.strCarrera = strCarrera;
    }

    public String getCarrera() {
        return this.strCarrera;
    }

    public void setSemestre(int intSemestre) {
        this.intSemestre = intSemestre;
    }

    public int getSemestre() {
        return this.intSemestre;
    }

    public String toString() {
        return "Nombre: " + strNombres + " " + strApellidos + "\nEdad: " + intEdad + "\nCarrera: " + strCarrera
                + "\nSemestre: " + intSemestre;
    }
}
