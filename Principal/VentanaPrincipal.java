package Principal;

import Componentes.*;
import Pantallas.*;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {

        this.setTitle(ConstantesPantallas.TITULO_VENTANA);
        this.setSize(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_VENTANA);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.cambiarPantalla(ConstantesPantallas.PANTALLA_MENU);

        this.setVisible(true);
    }

    public void cambiarPantalla(int intTipoPantalla) {
        this.getContentPane().removeAll(); // Limpiar ventana actual

        switch (intTipoPantalla) {
            case ConstantesPantallas.PANTALLA_MENU:
                add(new PantallaMenu());
                break;
            case ConstantesPantallas.PANTALLA_REGISTRO:
                add(new PantallaRegistro());
                break;
            case ConstantesPantallas.PANTALLA_REPORTE:
                add(new PantallaRegistro());
                break;
            case ConstantesPantallas.PANTALLA_TESTMENU:
                add(new PantallaRegistro());
                break;
            case ConstantesPantallas.PANTALLA_TEST:
                add(new PantallaRegistro());
                break;
        }

        this.revalidate();
        this.repaint();
    }

}