package Componentes;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;

public class Texts extends JTextField {

    public Texts(String strTexto) {
        super(strTexto);
        this.setFont(Fuentes.FUENTE_TEXTO);
        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent event) {
                selectAll();
            }
        });
    }

    public Texts(String strTexto, String strToolTip) {
        this(strTexto);
        this.setToolTipText(strToolTip);
    }

}
