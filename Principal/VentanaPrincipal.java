package principal;

import pantallas.*;
import componentes.*;

import java.awt.BorderLayout;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private JPanel pnl_Actual;

    public VentanaPrincipal() {

        this.setTitle(ConstantesPantallas.TITULO_VENTANA);
        this.setSize(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_VENTANA);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        this.cambiarPantalla(ConstantesPantallas.PANTALLA_MENU);

        this.setVisible(true);
    }

    public void cambiarPantalla(int intTipoPantalla) {

        if (pnl_Actual != null) {
            this.remove(pnl_Actual);
        }

        switch (intTipoPantalla) {
            case ConstantesPantallas.PANTALLA_MENU:
                pnl_Actual = new PantallaMenu();
                break;
            case ConstantesPantallas.PANTALLA_REGISTRO:
                pnl_Actual = new PantallaRegistro();
                break;
            case ConstantesPantallas.PANTALLA_REPORTE:
                pnl_Actual = new PantallaReporte();
                break;
            case ConstantesPantallas.PANTALLA_TESTMENU:
                pnl_Actual = new PantallaRegistro();
                break;
            case ConstantesPantallas.PANTALLA_TEST:
                pnl_Actual = new PantallaRegistro();
                break;
        }

        this.add(pnl_Actual, BorderLayout.CENTER);

        this.revalidate();
        this.repaint();
    }

}