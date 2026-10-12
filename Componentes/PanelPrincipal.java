package componentes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import componentes.ConstantesPantallas.LargoComponente;

public abstract class PanelPrincipal extends JPanel {

    protected JPanel pnl_Titulo;
    protected JPanel pnl_Contenido;
    protected JPanel pnl_Botones;
    protected JScrollPane jsp_Contenido;

    public PanelPrincipal() {

        this.setLayout(new BorderLayout());

        pnl_Titulo = crearPanelTitulo();
        pnl_Contenido = crearPanelContenido();
        pnl_Botones = crearPanelBotones();

        jsp_Contenido = new JScrollPane(pnl_Contenido);
        jsp_Contenido.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jsp_Contenido.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsp_Contenido.setBorder(null);

        this.add(pnl_Titulo, BorderLayout.NORTH);
        this.add(jsp_Contenido, BorderLayout.CENTER);
        this.add(pnl_Botones, BorderLayout.SOUTH);

        inicializarPanelTitulo();
        inicializarPanelContenido();
        inicializarPanelBotones();

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                pnl_Contenido.revalidate();
                pnl_Contenido.repaint();
            }
        });

    }

    private JPanel crearPanelTitulo() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
        pnl.setPreferredSize(new Dimension(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_PANEL_TITULO));
        return pnl;
    }

    private JPanel crearPanelContenido() {
        JPanel pnl = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                if (getLayout() instanceof FlowLayout && getParent() != null) {
                    return new Dimension(getParent().getWidth(), super.getPreferredSize().height);
                }
                return super.getPreferredSize();
            }
        };
        pnl.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));
        return pnl;
    }

    private JPanel crearPanelBotones() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        pnl.setPreferredSize(new Dimension(ConstantesPantallas.ANCHO_VENTANA, ConstantesPantallas.ALTURA_PANEL_TITULO));
        return pnl;
    }

    protected abstract void inicializarPanelTitulo();

    protected abstract void inicializarPanelContenido();

    protected abstract void inicializarPanelBotones();

    protected void agregarBotonRegresar(int intPantallaAnterior) {
        pnl_Botones.add(new Buttons("Regresar", intPantallaAnterior));
    }

    protected void agregarComponente(String strLabel, JComponent jcp_Componente, LargoComponente dblLargo) {

        JPanel pnl_Grupo = new JPanel(new BorderLayout(5, 2));

        pnl_Grupo.add(new Labels(strLabel), BorderLayout.NORTH);

        jcp_Componente.setPreferredSize(new Dimension(dblLargo.getAncho(), 35));
        pnl_Grupo.add(jcp_Componente, BorderLayout.CENTER);

        pnl_Contenido.add(pnl_Grupo);

    }
}
