package Pantallas;

import Componentes.Buttons;
import Componentes.ConstantesPantallas;
import Componentes.Labels;
import Componentes.PanelPrincipal;

public class PantallaRegistro extends PanelPrincipal {
    @Override
    protected void inicializarPanelTitulo() {
        Labels lblTitulo = new Labels("Agregar Registro");
        lblTitulo.madeTitulo();

        pnl_Titulo.add(lblTitulo);

        Labels lblSubtitulo = new Labels("Datos del Paciente");
        lblSubtitulo.madeSubtitle();

        pnl_Titulo.add(lblSubtitulo);
    }

    @Override
    protected void inicializarPanelContenido() {

    }

    @Override
    protected void inicializarPanelBotones() {
        agregarBotonRegresar(ConstantesPantallas.PANTALLA_MENU);
        pnl_Botones.add(new Buttons("Guardar y  continuar", ConstantesPantallas.PANTALLA_REGISTRO));
    }
}
