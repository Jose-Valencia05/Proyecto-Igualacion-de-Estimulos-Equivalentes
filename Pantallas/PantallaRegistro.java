package Pantallas;

import java.awt.GridLayout;

import javax.swing.JComboBox;

import Componentes.Buttons;
import Componentes.ConstantesPantallas;
import Componentes.Labels;
import Componentes.PanelPrincipal;
import Componentes.Texts;

public class PantallaRegistro extends PanelPrincipal {
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

        pnl_Contenido.setLayout(new GridLayout(0, 6, 20, 50));

        pnl_Contenido.add(new Labels("Nombre:"));
        pnl_Contenido.add(new Texts("Juan Antonio", "Nombre del paciente"));
        pnl_Contenido.add(new Labels("Apellidos:"));
        pnl_Contenido.add(new Texts("Perez Sanchez", "Apellidos del paciente"));
        pnl_Contenido.add(new Labels("Edad:"));
        pnl_Contenido.add(new Texts("Edad", "Edad del paciente"));
        pnl_Contenido.add(new Labels("Carrera:"));
        pnl_Contenido.add(new JComboBox<String>(new String[] {
                "PSICOLOGIA",
                "OPTOMETRIA",
                "BIOLOGIA",
                "MEDICO CIRUJANO",
                "CIRUJANO DENTISTA",
                "ENFERMERIA"
        }));
        pnl_Contenido.add(new Labels("Semestre:"));

    }

    @Override
    protected void inicializarPanelBotones() {
        agregarBotonRegresar(ConstantesPantallas.PANTALLA_MENU);
        pnl_Botones.add(new Buttons("Guardar y  continuar", ConstantesPantallas.PANTALLA_REGISTRO));
    }
}
