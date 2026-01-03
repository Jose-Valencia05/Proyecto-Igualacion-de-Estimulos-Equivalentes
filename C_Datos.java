import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class C_Datos extends JFrame{

    public C_Datos() {

		setSize(1200, 800);
        setLocationRelativeTo(null);
		setTitle("Igualacion de Estimulos Equivalentes");
		
		Panel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public JPanel fondo;

	public void Panel() {

		fondo = new JPanel();

		fondo.setLayout(null);
        fondo.setBounds(0, 0, 1200, 800);
		fondo.setBackground(Color.GRAY);
        
		Titulo();
		P_Tabla();
		Butons();

        this.getContentPane().add(fondo);

    }

    public void Titulo() {

		JLabel tit = new JLabel();

		tit.setBounds(300, 50, 600, 70);
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 50));
		tit.setText("Datos Obtenidos");
		tit.setOpaque(true);
		tit.setBackground(Color.GRAY);

        fondo.add(tit);
	}


	//private Conexion db = new Conexion();
	//private Object[][] dtPersona;

	public void P_Tabla(){
        
        String[] columns = new String[] {
            "Id", "Nombre", "Carrera", "Semestre", "Edad", "Sexo", "Total de aciertos"
        };

        Object[][] data = new Object[][]{

            {1, null, null, null, null, null, null},
            {2, null, null, null, null, null, null},
			{3, null, null, null, null, null, null},
			{4, null, null, null, null, null, null},
			{5, null, null, null, null, null, null},
			{6, null, null, null, null, null, null},
			{7, null, null, null, null, null, null},
			{8, null, null, null, null, null, null},
			{9, null, null, null, null, null, null},
			{10, null, null, null, null, null, null},
			{11, null, null, null, null, null, null}

		};
		
		//dtPersona = db.Select_Persona();

        JTable d_table = new JTable(data, columns);

		d_table.setBounds(100, 100, 600, 600 );
		d_table.setFocusable(false);

		d_table.setEnabled(false);

		d_table.getTableHeader().setResizingAllowed(false);
		d_table.getTableHeader().setReorderingAllowed(false);

		d_table.setRowHeight(50);
		d_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		d_table.getColumnModel().getColumn(0).setPreferredWidth(20);
		d_table.getColumnModel().getColumn(1).setPreferredWidth(150);
		d_table.getColumnModel().getColumn(2).setPreferredWidth(150);
		d_table.getColumnModel().getColumn(3).setPreferredWidth(75);
		d_table.getColumnModel().getColumn(4).setPreferredWidth(50);
		d_table.getColumnModel().getColumn(5).setPreferredWidth(50);
		d_table.getColumnModel().getColumn(6).setPreferredWidth(100);
		
		JScrollPane sp = new JScrollPane(d_table);

		sp.setBounds(150, 150, 900, 400);

        fondo.add(sp);

    }

	public void Butons() {

		JButton b_regresar = new JButton();

		b_regresar.setText("Regresar");
		b_regresar.setBounds(100, 600, 400, 70);
		b_regresar.setForeground(Color.WHITE);
		b_regresar.setFont(new Font("Arial", Font.PLAIN, 30));
		b_regresar.setBorder(null);
		b_regresar.setOpaque(true);
		b_regresar.setBackground(Color.BLUE);
		b_regresar.addActionListener(reg);

		fondo.add(b_regresar);

	}

	ActionListener reg = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {

			P_Entrada ent = new P_Entrada();

			ent.setVisible(true);

			dispose();			

		}
	};

}