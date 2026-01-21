package componentes;

public interface ConstantesPantallas {

    public static final String TITULO_VENTANA = "Igualación de Estimulos Equivalentes";
    public static final int ALTURA_VENTANA = 600;
    public static final int ANCHO_VENTANA = 1000;

    public static final int ALTURA_PANEL_TITULO = 100;
    public static final int ALTURA_PANEL_CONTENIDO = 600;

    public static final int PANTALLA_MENU = 1;
    public static final int PANTALLA_REGISTRO = 2;
    public static final int PANTALLA_REPORTE = 3;
    public static final int PANTALLA_TESTMENU = 4;
    public static final int PANTALLA_TEST = 5;

    public enum LargoComponente {
        PEQUEÑO(80), // Ancho en píxeles
        MEDIANO(200),
        GRANDE(400),
        FIJO(0); // Para etiquetas

        private final int ancho;

        LargoComponente(int ancho) {
            this.ancho = ancho;
        }

        public int getAncho() {
            return ancho;
        }
    }

}
