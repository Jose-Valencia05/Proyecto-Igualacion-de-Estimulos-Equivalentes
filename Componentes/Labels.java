package Componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels extends JLabel {

    public Labels(String strTitulo) {
        super(strTitulo);
        this.setFont(new Font("Arial", Font.PLAIN, 18));
        this.setForeground(Color.BLACK);
        this.setHorizontalAlignment(SwingConstants.LEFT);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public void setTitulo() {
        this.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 50));
        this.setForeground(Color.WHITE);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public void setSubtitle() {
        this.setFont(new Font("Arial", Font.BOLD, 25));
        this.setForeground(Color.LIGHT_GRAY);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
