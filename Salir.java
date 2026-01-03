import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Salir extends JFrame{

    public Salir() {

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

        Buton();

        this.getContentPane().add(fondo);

    }
    
    public void Buton() {

		JLabel red = new JLabel();

		red.setBounds(350, 500, 500, 50);
		red.setText(Integer.toString(Molde.res));
        red.setHorizontalAlignment(SwingConstants.CENTER);
		red.setFont(new Font("Arial", Font.BOLD, 25));
        red.setOpaque(true);
        red.setBackground(Color.GRAY);

        fondo.add(red);


		JButton b_empezar = new JButton();

		b_empezar.setText("SALIR");
		b_empezar.setBounds(400, 600, 400, 70);
		b_empezar.setForeground(Color.WHITE);
		b_empezar.setFont(new Font("Arial", Font.PLAIN, 30));
		b_empezar.setBorder(null);
		b_empezar.setOpaque(true);
		b_empezar.setBackground(Color.BLUE);
		b_empezar.addActionListener(emp);

		fondo.add(b_empezar);

	}


	ActionListener emp = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {

			Usuario usuario = new Usuario();

            /*usuario.setNombre(nom.getText());
            usuario.setApellido(apell.getText());
            usuario.setEdad(edad.getText());
            usuario.setCarrera(carr.getValue());
           */
			P_Entrada ent = new P_Entrada();

			ent.setVisible(true);

			dispose();			
			
		}
	}; 
	
}