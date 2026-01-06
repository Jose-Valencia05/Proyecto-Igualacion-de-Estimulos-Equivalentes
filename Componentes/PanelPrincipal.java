package Componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public abstract class PanelPrincipal extends JPanel {

    protected JPanel pnl_Titulo;
    protected JPanel pnl_Contenido;
    protected JPanel pnl_Botones;

    public PanelPrincipal() {

        this.setLayout(new BorderLayout());
        this.setBounds(0, 0, ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_VENTANA);

        iniciarPaneles();

        inicializarPanelTitulo();
        inicializarPanelContenido();
        inicializarPanelBotones();

        this.add(pnl_Titulo, BorderLayout.NORTH);
        this.add(pnl_Contenido, BorderLayout.CENTER);
        this.add(pnl_Botones, BorderLayout.SOUTH);
    }

    private void iniciarPaneles() {

        pnl_Titulo = new JPanel();
        pnl_Titulo.setLayout(new BoxLayout(pnl_Titulo, BoxLayout.Y_AXIS));
        pnl_Titulo.setPreferredSize(
                new Dimension(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_PANEL_TITULO));
        pnl_Titulo.setBackground(Color.DARK_GRAY);

        pnl_Contenido = new JPanel();
        pnl_Contenido.setLayout(new GridBagLayout());
        pnl_Contenido.setBackground(Color.white);

        pnl_Botones = new JPanel();
        pnl_Botones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl_Botones.setPreferredSize(
                new Dimension(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_PANEL_TITULO));
        pnl_Botones.setBackground(Color.DARK_GRAY);

    }

    protected abstract void inicializarPanelTitulo();

    protected abstract void inicializarPanelContenido();

    protected abstract void inicializarPanelBotones();

    protected void agregarBotonRegresar(int intVentanaDestino) {
        BotonRegresar btn = new BotonRegresar(intVentanaDestino);
        pnl_Botones.add(btn);
    }

}
