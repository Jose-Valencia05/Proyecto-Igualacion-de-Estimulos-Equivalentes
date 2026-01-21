package Pantallas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import Componentes.Buttons;
import Componentes.ConstantesPantallas;
import Componentes.Labels;
import Componentes.PanelPrincipal;
import Componentes.Texts;

public class PantallaRegistro extends PanelPrincipal {

    private enum LargoComponente {
        PEQUEÑO(80), // Ancho en píxeles
        MEDIANO(200),
        GRANDE(400),
        FIJO(0); // Para etiquetas

        private final int ancho;

        LargoComponente(int ancho) {
            this.ancho = ancho;
        }

        public int getAncho() {
            return ancho;
        }
    }

    public PantallaRegistro() {
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent evt) {
                pnl_Contenido.revalidate();
                pnl_Contenido.repaint();
            }
        });

    }

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

        agregarComponente("Nombre:", new Texts("Juan Antonio", "Nombre del Paciente"), LargoComponente.GRANDE);
        agregarComponente("Apellidos:", new Texts("Perez Sanchez", "Apellidos del Paciente"), LargoComponente.GRANDE);
        agregarComponente("Edad:", new Texts(null, "Edad del Paciente"), LargoComponente.PEQUEÑO);
        agregarComponente("Carrera:", new JComboBox<String>(new String[] {
                "PSICOLOGIA",
                "OPTOMETRIA",
                "BIOLOGIA",
                "MEDICO CIRUJANO",
                "CIRUJANO DENTISTA",
                "ENFERMERIA"
        }), LargoComponente.MEDIANO);

        agregarComponente("Semestre:", new Texts(null, "Semestre del Paciente"), LargoComponente.PEQUEÑO);

    }

    private void agregarComponente(String strLabel, JComponent jcp_Componente, LargoComponente dblLargo) {

        JPanel pnl_Grupo = new JPanel(new BorderLayout(5, 2));

        pnl_Grupo.add(new Labels(strLabel), BorderLayout.NORTH);

        jcp_Componente.setPreferredSize(new Dimension(dblLargo.getAncho(), 35));
        pnl_Grupo.add(jcp_Componente, BorderLayout.CENTER);

        pnl_Contenido.add(pnl_Grupo);
        // new Texts(strTextText, (strTextTool == null ? "" : strTextTool)), gbc);

    }

    @Override
    protected void inicializarPanelBotones() {
        agregarBotonRegresar(ConstantesPantallas.PANTALLA_MENU);
        pnl_Botones.add(new Buttons("Guardar y  continuar", ConstantesPantallas.PANTALLA_REGISTRO));
    }
}
