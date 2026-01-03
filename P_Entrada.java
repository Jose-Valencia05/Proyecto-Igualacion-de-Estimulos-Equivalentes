import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class P_Entrada extends JFrame{

	public P_Entrada() {

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

		Labels();
		Butons();

        this.getContentPane().add(fondo);

	}

	public void Labels(){

		JLabel tit = new JLabel();

		tit.setBounds(300, 50, 600, 70);
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 50));
		tit.setText("Bienvenido Psicolog@");
		tit.setOpaque(true);
		tit.setBackground(Color.GRAY);

		fondo.add(tit);


		JLabel test = new JLabel();

		test.setText("Igualacion de Estimulos Equivalentes");
		test.setFont(new Font("Arial", Font.BOLD, 25));
		test.setBounds(350, 175, 500, 50);
		test.setHorizontalAlignment(SwingConstants.CENTER);
		test.setOpaque(true);
		test.setBackground(Color.GRAY);
		
		fondo.add(test);


		JLabel cont = new JLabel();

		cont.setText("Aqui va la informacion correspondiente a lo que se va a trabajar");
		cont.setBounds(100, 250, 1000, 300);
		cont.setFont(new Font("Arial", Font.PLAIN, 20));
		cont.setOpaque(true);
		cont.setBackground(Color.GRAY);

		fondo.add(cont);

	}

	public void Butons() {

		JButton i_datos = new JButton();

		i_datos.setText("Ingresar más Datos");
		i_datos.setBounds(100, 600, 400, 70);
		i_datos.setForeground(Color.WHITE);
		i_datos.setFont(new Font("Arial", Font.PLAIN, 30));
		i_datos.setBorder(null);
		i_datos.setOpaque(true);
		i_datos.setBackground(Color.BLUE);
		i_datos.addActionListener(i_Datos);

		fondo.add(i_datos);

		JButton c_datos = new JButton();

		c_datos.setText("Consultar los Datos");
		c_datos.setBounds(700, 600, 400, 70);
		c_datos.setForeground(Color.WHITE);
		c_datos.setFont(new Font("Arial", Font.PLAIN, 30));
		c_datos.setBorder(null);
		c_datos.setOpaque(true);
		c_datos.setBackground(Color.BLUE);
		c_datos.addActionListener(c_Datos);

		fondo.add(c_datos);

	}

	ActionListener i_Datos = new ActionListener(){
	
		@Override
		public void actionPerformed(ActionEvent e) {

			I_Datos i_d = new I_Datos();

			i_d.setVisible(true);

			dispose();			

		}
	};

	ActionListener c_Datos = new ActionListener(){
	
		@Override
		public void actionPerformed(ActionEvent e) {
		
			C_Datos c_d = new C_Datos();

			c_d.setVisible(true);

			dispose();
			
		}
	};

}