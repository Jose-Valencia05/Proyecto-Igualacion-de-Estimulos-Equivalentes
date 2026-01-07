package Componentes;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import Principal.VentanaPrincipal;

public class Buttons extends JButton {

    public Buttons(String strTitulo, int intPantalla) {
        super(strTitulo);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Arial", Font.PLAIN, 30));
        this.setBorder(null);
        this.setOpaque(true);
        this.setBackground(Color.BLUE);
        this.setPreferredSize(new Dimension((super.getPreferredSize().width + 30), 50));

        this.addActionListener(e -> {
            Window w = SwingUtilities.getWindowAncestor(this);
            if (w instanceof VentanaPrincipal) {
                ((VentanaPrincipal) w).cambiarPantalla(intPantalla);
            }
        });
    }
}
