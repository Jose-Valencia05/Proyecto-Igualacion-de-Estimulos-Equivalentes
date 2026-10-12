package componentes;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels extends JLabel {

    public Labels(String strTitulo) {
        super(strTitulo);
        this.setFont(Fuentes.FUENTE_TEXTO);
        this.setForeground(Color.BLACK);
        this.setHorizontalAlignment(SwingConstants.LEFT);
        this.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Eliminar al Subir a main
        this.setOpaque(true);
    }

    public void madeTitulo() {
        this.setFont(Fuentes.FUENTE_TITULO);
        this.setForeground(Color.WHITE);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public void madeSubtitle() {
        this.setFont(Fuentes.FUENTE_SUBTITULO);
        this.setForeground(Color.LIGHT_GRAY);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
