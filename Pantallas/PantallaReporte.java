package Pantallas;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import Componentes.ConstantesPantallas;
import Componentes.Labels;
import Componentes.PanelPrincipal;

public class PantallaReporte extends PanelPrincipal {

    private String strNombreDoctor;

    @Override
    protected void inicializarPanelTitulo() {
        Labels lbl_Titulo = new Labels("Registros de Pacientes");
        lbl_Titulo.madeTitulo();
        pnl_Titulo.add(lbl_Titulo);

        Labels lbl_Subtitulo = new Labels("Psicológ@: " + strNombreDoctor);
        lbl_Subtitulo.madeSubtitle();
        pnl_Titulo.add(lbl_Subtitulo);

    }

    @Override
    protected void inicializarPanelContenido() {

        String[] strColumnas = {
                "ID", "Nombre", "Apellidos", "Carrera", "Semestre", "Edad", "Sexo",
                "F1: Errores", "F1: Aciertos", "F1: Tiempo",
                "F2: Errores", "F2: Aciertos", "F2: Tiempo",
                "F3: Errores", "F3: Aciertos", "F3: Tiempo"
        };

        DefaultTableModel dtmTabla = new DefaultTableModel(strColumnas, 20);

        JTable jtbTabla = new JTable(dtmTabla);
        jtbTabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtbTabla.setRowHeight(30);

        jtbTabla.setEnabled(false);

        jtbTabla.getColumnModel().getColumn(1).setPreferredWidth(250);
        jtbTabla.getColumnModel().getColumn(2).setPreferredWidth(150);

        JTableHeader jth = jtbTabla.getTableHeader();
        jth.setResizingAllowed(false);
        jth.setReorderingAllowed(false);

        jtbTabla.setTableHeader(jth);

        JScrollPane scp_Tabla = new JScrollPane(jtbTabla);
        scp_Tabla.setBorder(null);

        pnl_Contenido.setLayout(new BorderLayout());
        pnl_Contenido.add(scp_Tabla, BorderLayout.CENTER);

    }

    @Override
    protected void inicializarPanelBotones() {
        agregarBotonRegresar(ConstantesPantallas.PANTALLA_MENU);
    }

}
