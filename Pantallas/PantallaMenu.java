package Pantallas;

import Componentes.Labels;
import Componentes.PanelPrincipal;

public class PantallaMenu extends PanelPrincipal {

    public PantallaMenu() {
        super();
    }

    @Override
    protected void inicializarPanelTitulo() {

        Labels lblTitulo = new Labels("Bienvenido Psicológ@");
        lblTitulo.setTitulo();

        Labels lblSubtitulo = new Labels("Test Igualación de Estimulos Equivalentes");
        lblSubtitulo.setSubtitle();

        pnl_Titulo.add(lblTitulo);
        pnl_Titulo.add(lblSubtitulo);
    }

    @Override
    protected void inicializarPanelContenido() {

    }

    @Override
    protected void inicializarPanelBotones() {

    }
}
