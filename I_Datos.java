import java.awt.*;
import javax.swing.*;
import javax.swing.DefaultCellEditor;
import java.awt.event.*;

public class I_Datos extends JFrame{

    public I_Datos() {

		setSize(1200, 800);
        setLocationRelativeTo(null);
        setTitle("Igualacion de Estimulos Equivalentes");
        setLayout(null);
		
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
        Registro();
		Butons();

        this.getContentPane().add(fondo);

    }
    
    public void Titulo() {

		JLabel tit = new JLabel();

		tit.setBounds(300, 50, 600, 70);
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 50));
		tit.setText("Agregar Datos");
		tit.setOpaque(true);
		tit.setBackground(Color.GRAY);

        fondo.add(tit);

		JLabel s_tit = new JLabel();

		s_tit.setBounds(350, 175, 500, 50);
		s_tit.setHorizontalAlignment(SwingConstants.CENTER);
		s_tit.setFont(new Font("Arial", Font.BOLD, 25));
		s_tit.setText("Datos del Paciente");
		s_tit.setOpaque(true);
		s_tit.setBackground(Color.GRAY);

        fondo.add(s_tit);
	
    }

    JTextField nom;
    JTextField apell;
    JTextField edad;
    JTextField seme;

    JComboBox<String> carr;

    public void Registro() {

        JLabel t_nom = new JLabel("Nombre :");

        t_nom.setBounds(100, 300, 150, 50);
        t_nom.setFont(new Font("Arial", Font.BOLD, 25));
        t_nom.setHorizontalAlignment(SwingConstants.LEFT);
		t_nom.setOpaque(true);
        t_nom.setBackground(Color.GRAY);
        
        fondo.add(t_nom);

        nom = new JTextField();

        nom.setBounds(260, 300, 300, 50);
		nom.setFont(new Font("Arial", Font.BOLD, 25));
		nom.setOpaque(true);

        fondo.add(nom);

        JLabel t_apell = new JLabel("Apellidos :");

        t_apell.setBounds(100, 360, 150, 50);
        t_apell.setFont(new Font("Arial", Font.BOLD, 25));
        t_apell.setHorizontalAlignment(SwingConstants.LEFT);
		t_apell.setOpaque(true);
        t_apell.setBackground(Color.GRAY);
        
        fondo.add(t_apell);

        apell = new JTextField();

        apell.setBounds(260, 360, 300, 50);
		apell.setFont(new Font("Arial", Font.BOLD, 25));
		apell.setOpaque(true);

        fondo.add(apell);

        JLabel t_carr = new JLabel("Carrera :");

        t_carr.setBounds(100, 420, 150, 50);
		t_carr.setFont(new Font("Arial", Font.BOLD, 25));
		t_carr.setOpaque(true);
        t_carr.setBackground(Color.GRAY);
        
        fondo.add(t_carr);

        String[] s_carr = new String[] { 

            "PSICOLOGIA", 
            "OPTOMETRIA", 
            "BIOLOGIA", 
            "MEDICO CIRUJANO", 
            "CIRUJANO DENTISTA",
            "ENFERMERIA" 

        };
        
        carr = new JComboBox<String>(s_carr);

        carr.setFont(new Font("Arial", Font.BOLD, 20));
        carr.setBounds(260, 420, 300, 50);

        fondo.add(carr);

        JLabel t_edad = new JLabel("Edad :");

        t_edad.setBounds(700, 300, 150, 50);
		t_edad.setFont(new Font("Arial", Font.BOLD, 25));
		t_edad.setOpaque(true);
        t_edad.setBackground(Color.GRAY);
        
        fondo.add(t_edad);

        edad = new JTextField();

        edad.setBounds(860, 300, 150, 50);
        edad.setFont(new Font("Arial", Font.BOLD, 25));
        edad.setHorizontalAlignment(SwingConstants.CENTER);
        edad.addKeyListener(val);
		edad.setOpaque(true);

        fondo.add(edad);

        
        JLabel t_seme = new JLabel("Semestre :");

        t_seme.setBounds(700, 360, 150, 50);
		t_seme.setFont(new Font("Arial", Font.BOLD, 25));
		t_seme.setOpaque(true);
        t_seme.setBackground(Color.GRAY);
        
        fondo.add(t_seme);

        seme = new JTextField();

        seme.setBounds(860, 360, 150, 50);
        seme.setFont(new Font("Arial", Font.BOLD, 25));
        seme.setHorizontalAlignment(SwingConstants.CENTER);
        seme.addKeyListener(val);
		seme.setOpaque(true);

        fondo.add(seme);

    }

    
    static String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] m_ABC = ABC.toCharArray();

    static String abc = "abcdefghijklmnopqrstuvwxyz";
    char[] m_abc =abc.toCharArray();

    static String num = "0123456789";
    char[] m_num = num.toCharArray();

    static String formas = "|°¬!¡¿?#$%,&/()='*-+.@´¨~[]{}^`;:_";
	char[] m_formas = formas.toCharArray();
	
	KeyListener val = new KeyListener(){
    
        @Override
        public void keyTyped(KeyEvent e) {

            int tamano = 0;

            if (e.getSource() == edad) {

                tamano = 2;

                if (edad.getText().length() >= tamano) {
                
                    JOptionPane.showMessageDialog(rootPane, "Solo son numeros -_-");
    
                    e.consume();
    
                }

            } else {

                tamano = 1;

                if (seme.getText().length() >= tamano) {
                
                    JOptionPane.showMessageDialog(rootPane, "Solo son numeros -_-");
    
                    e.consume();
    
                }

            }

            for (int k = 0; k < m_ABC.length; k++) {    
                
                if (e.getKeyChar() == m_ABC[k]) {
                    
                    JOptionPane.showMessageDialog(rootPane, "Datos no Validos \n Solo Numeros");

                    e.consume();
                }
            }

            for (int k = 0; k < m_abc.length; k++) {

                if (e.getKeyChar() == m_abc[k]) {

                    JOptionPane.showMessageDialog(rootPane, "Datos no Validos \n Solo Numeros");

                    e.consume();
                }
            }

            for (int k = 0; k < m_formas.length; k++) {

                if (e.getKeyChar() == m_formas[k]) {

                    JOptionPane.showMessageDialog(rootPane, "Datos no Validos \n Solo Numeros");

                    e.consume();
                }
            }
        }
    
        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }
	};
	  

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

		JButton r_dato = new JButton();

		r_dato.setText("Ingresar Dato");
		r_dato.setBounds(700, 600, 400, 70);
		r_dato.setForeground(Color.WHITE);
		r_dato.setFont(new Font("Arial", Font.PLAIN, 30));
		r_dato.setBorder(null);
		r_dato.setOpaque(true);
		r_dato.setBackground(Color.BLUE);
		r_dato.addActionListener(ing);

		fondo.add(r_dato);

	}

	ActionListener reg = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {

			P_Entrada ent = new P_Entrada();

			ent.setVisible(true);

			dispose();			

		}
    }; 

    ActionListener ing = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {

            /*a_nom = nom.getText();
            a_apell = apell.getText();
            a_edad = edad.getText();
            a_carr = carr.getValue();
            */



            Molde mol = new Molde();

            mol.setVisible(true);

            dispose();

		}
    };
    
}