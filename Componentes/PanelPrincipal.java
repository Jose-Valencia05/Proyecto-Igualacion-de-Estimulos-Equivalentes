package Componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public abstract class PanelPrincipal extends JPanel {

    protected JPanel pnl_Titulo;
    protected JPanel pnl_Contenido;
    protected JPanel pnl_Botones;

    public PanelPrincipal() {

        this.setLayout(new BorderLayout());
        this.setBounds(0, 0, ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_VENTANA);

        iniciarPaneles();

        this.add(pnl_Titulo, BorderLayout.NORTH);

        JScrollPane jsp_Contenido = new JScrollPane(pnl_Contenido);
        jsp_Contenido.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_Contenido.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsp_Contenido.setBorder(null);

        this.add(jsp_Contenido, BorderLayout.CENTER);
        this.add(pnl_Botones, BorderLayout.SOUTH);
    }

    private void iniciarPaneles() {

        pnl_Titulo = new JPanel();
        pnl_Titulo.setLayout(new BoxLayout(pnl_Titulo, BoxLayout.Y_AXIS));
        pnl_Titulo.setPreferredSize(
                new Dimension(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_PANEL_TITULO));
        pnl_Titulo.setBackground(Color.DARK_GRAY);

        pnl_Contenido = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(getParent().getWidth(), super.getPreferredSize().height);
            }
        };
        pnl_Contenido.setLayout(new GridBagLayout());
        pnl_Contenido.setBackground(Color.white);

        pnl_Botones = new JPanel();
        pnl_Botones.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        pnl_Botones.setPreferredSize(
                new Dimension(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_PANEL_TITULO));
        pnl_Botones.setBackground(Color.DARK_GRAY);

        inicializarPanelTitulo();
        inicializarPanelContenido();
        inicializarPanelBotones();

    }

    protected abstract void inicializarPanelTitulo();

    protected abstract void inicializarPanelContenido();

    protected abstract void inicializarPanelBotones();

    protected void agregarBotonRegresar(int intPantallaAnterior) {
        pnl_Botones.add(new Buttons("Regresar", intPantallaAnterior));
    }

}
