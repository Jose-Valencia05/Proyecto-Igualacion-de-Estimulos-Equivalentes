package pantallas;

import java.awt.FlowLayout;
import java.util.stream.Gatherer.Integrator;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import componentes.Buttons;
import componentes.ConstantesPantallas;
import componentes.ConstantesPantallas.LargoComponente;
import modelos.Paciente;
import componentes.Labels;
import componentes.PanelPrincipal;
import componentes.Texts;

public class PantallaRegistro extends PanelPrincipal {

    private Texts txtNombres;
    private Texts txtApellidos;
    private Texts txtEdad;
    private JComboBox<String> cbxCarrera;
    private Texts txtSemestre;

    @Override
    protected void inicializarPanelTitulo() {
        Labels lblTitulo = new Labels("Agregar Registro");
        lblTitulo.madeTitulo();

        pnl_Titulo.add(lblTitulo);

        Labels lblSubtitulo = new Labels("Datos del Paciente");
        lblSubtitulo.madeSubtitle();

        pnl_Titulo.add(lblSubtitulo);
    }

    @Override
    protected void inicializarPanelContenido() {

        // Modificamos el Layout
        pnl_Contenido.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));

        // Escalable: Poder añadir mas componentes o retirarlos

        txtNombres = new Texts("Juan Antonio", "Nombre del Paciente");
        txtApellidos = new Texts("Perez Sanchez", "Apellidos del Paciente");
        txtEdad = new Texts(null, "Edad del Paciente");
        cbxCarrera = new JComboBox<String>(new String[] {
                "PSICOLOGIA",
                "OPTOMETRIA",
                "BIOLOGIA",
                "MEDICO CIRUJANO",
                "CIRUJANO DENTISTA",
                "ENFERMERIA"
        });
        txtSemestre = new Texts(null, "Semestre del Paciente");

        agregarComponente("Nombre:", txtNombres, LargoComponente.GRANDE);
        agregarComponente("Apellidos:", txtApellidos, LargoComponente.GRANDE);
        agregarComponente("Edad:", txtEdad, LargoComponente.PEQUEÑO);
        agregarComponente("Carrera:", cbxCarrera, LargoComponente.MEDIANO);
        agregarComponente("Semestre:", txtSemestre, LargoComponente.PEQUEÑO);

    }

    @Override
    protected void inicializarPanelBotones() {
        agregarBotonRegresar(ConstantesPantallas.PANTALLA_MENU);
        Buttons btnGuardar = new Buttons("Guardar y  continuar", ConstantesPantallas.PANTALLA_MENU);
        btnGuardar.addActionListener(e -> {
            Paciente nuevoPaciente = capturarPaciente();
            if (nuevoPaciente != null) {
                System.out.println("\tPaciente capturado: \n" + nuevoPaciente.toString());
            }
        });
        pnl_Botones.add(btnGuardar);

    }

    public Paciente capturarPaciente() {
        try {
            String strNombres = txtNombres.getText().trim();
            String strApellidos = txtApellidos.getText().trim();
            String strCarrera = txtSemestre.getText().trim();

            int intEdad = txtEdad.getText().isEmpty() ? 0 : Integer.parseInt(txtEdad.getText());
            int intSemestre = txtSemestre.getText().isEmpty() ? 0 : Integer.parseInt(txtSemestre.getText());

            return new Paciente(strNombres, strApellidos, intEdad, strCarrera, intSemestre);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Porfavor, ingrese solo números en Edad y Semestre");
            return null;
        }
    }
}
