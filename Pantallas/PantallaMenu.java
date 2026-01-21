package pantallas;

import componentes.Buttons;
import componentes.ConstantesPantallas;
import componentes.Labels;
import componentes.PanelPrincipal;

public class PantallaMenu extends PanelPrincipal {

    public PantallaMenu() {
        super();
    }

    @Override
    protected void inicializarPanelTitulo() {

        Labels lblTitulo = new Labels("Bienvenido Psicológ@");
        lblTitulo.madeTitulo();

        pnl_Titulo.add(lblTitulo);

        Labels lblSubtitulo = new Labels("Test Igualación de Estimulos Equivalentes");
        lblSubtitulo.madeSubtitle();

        pnl_Titulo.add(lblSubtitulo);
    }

    @Override
    protected void inicializarPanelContenido() {
        pnl_Contenido.add(new Labels("Ficha Tecnica"));
    }

    @Override
    protected void inicializarPanelBotones() {
        pnl_Botones.add(new Buttons("Ingresar Paciente", ConstantesPantallas.PANTALLA_REGISTRO));
        pnl_Botones.add(new Buttons("Consultar Datos", ConstantesPantallas.PANTALLA_REPORTE));

    }
}
