package Componentes;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import Principal.VentanaPrincipal;

public class BotonRegresar extends JButton {

    public BotonRegresar(int ventana) {

        setText("Regresar");
        setPreferredSize(new Dimension(200, 50));
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 30));
        setBorder(null);
        setOpaque(true);
        setBackground(Color.BLUE);

        this.addActionListener(e -> {
            Window w = SwingUtilities.getWindowAncestor(this);

            if (w instanceof VentanaPrincipal) {
                ((VentanaPrincipal) w).cambiarPantalla(ventana);
            }
        });
    }

}
