import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class Molde extends JFrame{

    public Molde() {

		setSize(1200, 800);
        setLocationRelativeTo(null);
        setTitle("Igualacion de Estimulos Equivalentes");
        setLayout(null);

        Panel();
		
        setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

    public JPanel pan;

    public void Panel(){ //Listo
        
        pan = new JPanel();
  
    	pan.setLayout(null);
        pan.setBounds(0, 0, 1200, 800);
        pan.setBackground(Color.GRAY);
        
        A_Empezar(pan);

        this.getContentPane().add(pan);

    }

    ImageIcon F_Carita = new ImageIcon("Imagenes/F_Carita.png");
    ImageIcon T_Carita = new ImageIcon("Imagenes/T_Carita.png");
    ImageIcon Pelota = new ImageIcon("Imagenes/Pelota.png","SUCIO");
    ImageIcon Mochila = new ImageIcon("Imagenes/Mochila.png", "FRACASO");
    ImageIcon Zapatos = new ImageIcon("Imagenes/Zapatos.png", "ESPECIAL");

    public JLabel pres;
    public JLabel cart;

    public JButton b1;
    public JButton b2;
    public JButton b3;

    JButton b = new JButton();
    Color p = b.getBackground();

    ImageIcon[] img = new ImageIcon[] {Pelota, Mochila, Zapatos};
    Color[] col = new Color[]{Color.YELLOW, Color.WHITE, Color.BLUE};
    String[] cons = new String[]{Pelota.getDescription(), Mochila.getDescription(), Zapatos.getDescription()};

    int[] pos = new int[]{0, 1, 2};

    Font fon = new Font("Arial", Font.BOLD, 50);

    private int cnt = 0; //Labels
    private int mund = 0; //
    private int mund2 = 0;
    private int uni = 0;

    private int err = 0 ;

    public JPanel A_Test(JPanel p){//Listo

        pres = new JLabel();

        pres.setBounds(250, 50, 700, 325);
        pres.setFont(fon);
        pres.setOpaque(true);
        pres.setBackground(Color.GRAY);
        pres.setHorizontalAlignment(0);
        pres.setVerticalAlignment(0);

                
        b1 = new JButton();

        b1.setBounds(25, 450, 350, 275);
        b1.setFont(fon);
        b1.setHorizontalAlignment(0);
        b1.setVerticalAlignment(0);
        b1.addActionListener(b_1);


        b2 = new JButton();

        b2.setBounds(425, 450, 350, 275);
        b2.setFont(fon);
        b2.setHorizontalAlignment(0);
        b2.setVerticalAlignment(0);
        b2.addActionListener(b_2);


        b3 = new JButton();

        b3.setBounds(825, 450, 350, 275);
        b3.setFont(fon);
        b3.setHorizontalAlignment(0);
        b3.setVerticalAlignment(0);
        b3.addActionListener(b_3);


        pres.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);

        p.add(pres);
        p.add(b1);
        p.add(b2);
        p.add(b3);

        return p;

    }

    public JLabel tit;
    public JLabel s_tit;
    public JTextArea inst;

    public JLabel red;

    public JButton b_empezar;

    public void A_Empezar(JPanel p) {

        tit = new JLabel();

		tit.setBounds(300, 50, 600, 70);
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setFont(new Font("Arial", Font.ITALIC + Font.BOLD, 50));
		tit.setText("Comienzo de Test");
		tit.setOpaque(true);
		tit.setBackground(Color.GRAY);

        p.add(tit);

		s_tit = new JLabel();

		s_tit.setBounds(350, 150, 500, 50);
		s_tit.setHorizontalAlignment(SwingConstants.CENTER);
		s_tit.setFont(new Font("Arial", Font.BOLD, 25));
        s_tit.setText("INSTRUCIONES");
		s_tit.setOpaque(true);
		s_tit.setBackground(Color.GRAY);

        p.add(s_tit);

        inst = new JTextArea();

		inst.setBounds(100, 220, 1000, 200);
		//inst.setHorizontalAlignment(SwingConstants.CENTER);
		inst.setFont(new Font("Arial", Font.PLAIN, 25));
        inst.setText("\n\n\n    Se te van a presentar imagenes colores y conceptos, selecciona el que creas que se" 
                        + "\n relaciona mejor.");
        inst.setEditable(false);
		inst.setOpaque(true);
		inst.setBackground(Color.GRAY);

        p.add(inst);

        red = new JLabel("¿Listo para empezar?");

        red.setBounds(350, 500, 500, 50);
        red.setHorizontalAlignment(SwingConstants.CENTER);
		red.setFont(new Font("Arial", Font.BOLD, 25));
        red.setOpaque(true);
        red.setBackground(Color.GRAY);

        p.add(red);

        b_empezar = new JButton();

		b_empezar.setText("Empezar Test");
		b_empezar.setBounds(400, 600, 400, 70);
		b_empezar.setForeground(Color.WHITE);
		b_empezar.setFont(new Font("Arial", Font.PLAIN, 30));
		b_empezar.setBorder(null);
		b_empezar.setOpaque(true);
		b_empezar.setBackground(Color.BLUE);
		b_empezar.addActionListener(emp);

        p.add(b_empezar);
        
        tit.setVisible(true);
        s_tit.setVisible(true);
        inst.setVisible(true);
        red.setVisible(true);
        b_empezar.setVisible(true);

    }

    int n;    
    int k;

    public int[] mod;

    public int[] num;

    public void R_Pres() {

        n = 3;
        k = n;

        mod = new int [3];
        num = new int[3];

        Random rad = new Random();
        int ob;

        for(int i = 0; i < n ; i++){

            num[i] = i;

        }
        
        for(int i = 0 ; i < n ; i++){

            ob = rad.nextInt(k);            
            mod[i] = num[ob];
            num[ob] = num[k - 1];
            k--;

        }
    }

    public void Limpiar() { // Listo
             
        if (uni  == 1 || uni == 3 || uni == 4) {

            pres.setVisible(false);
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);

        } else {

            pres.setIcon(null);
            pres.setText(null);
            pres.setBackground(null);
    

            b1.setText(null);
            b2.setText(null);
            b3.setText(null);


            b1.setIcon(null);
            b2.setIcon(null);
            b3.setIcon(null);

            b1.setBackground(p);
            b2.setBackground(p);
            b3.setBackground(p);
 
        }

    }


    public JPanel A(JPanel p) {
         
        pres.setIcon(img[mod[mund]]);
        pres.repaint();

        b1.setBackground(col[pos[0]]);

        b2.setBackground(col[pos[1]]);

        b3.setBackground(col[pos[2]]);

        return p;
     
    }

    public JPanel B(JPanel p) {

        pres.setBackground(col[mod[mund]]);
        pres.repaint();

        b1.setText(cons[pos[0]]);

        b2.setText(cons[pos[1]]);

        b3.setText(cons[pos[2]]);

        return p;
     
    }

    public JPanel C(JPanel p){

        pres.setIcon(img[mod[mund]]);
        pres.repaint();

        b1.setIcon(img[pos[0]]);

        b2.setIcon(img[pos[1]]);

        b3.setIcon(img[pos[2]]);

        return p;
    }

    public JPanel D(JPanel p) {

        pres.setBackground(col[mod[mund]]);
        pres.repaint();

        b1.setIcon(img[pos[0]]);

        b2.setIcon(img[pos[1]]);

        b3.setIcon(img[pos[2]]);

        return p;
    }

    public JPanel E(JPanel p) {

        pres.setText(cons[mod[mund]]);
        pres.repaint();
        
        b1.setBackground(col[pos[0]]);

        b2.setBackground(col[pos[1]]);

        b3.setBackground(col[pos[2]]);

        return p;

    }

    public JPanel F(JPanel p) {

        pres.setIcon(img[mod[mund]]);
        pres.repaint();

        b1.setText(cons[pos[0]]);

        b2.setText(cons[pos[1]]);

        b3.setText(cons[pos[2]]);

        return p;

    }

    public JPanel G(JPanel p) {

        pres.setText(cons[mod[mund]]);
        pres.repaint();

        b1.setIcon(img[pos[0]]);

        b2.setIcon(img[pos[1]]);

        b3.setIcon(img[pos[2]]);

        return p;

    }


    public void S_Metodos(){

        switch (uni) {

            case 0: //Control
            
                A(pan);

                break;

            case 1: 

                E_Control();

                break;
            
            case 2:

                B(pan);

                break;

            case 3: 

                E_Control();

                break;

            case 4:

                Limpiar();

                A_Empezar(pan);

                break;

            case 5: //Evaluacion

                C(pan);

                break;

            case 6:
                       
                D(pan);

                break;

            case 7:
            
                E(pan);

                break;

            case 8:

                F(pan);

                break;

            case 9:

                G(pan);

                break;

            default:

                uni = 0;

                Limpiar();

                Salir sl = new Salir();

                sl.setVisible(true);

                dispose();

                break;
        }

    }

    public void E_Control() {

        Limpiar();

        if (err < 2) {
           
            if (res < 22 ) {

                if (uni == 1) {

                    uni = 0;

                } else {
                    
                    uni = 2;

                }

                err++;
                       
            } else {

                err = 0;

                uni++;

            }   

        } else {
            
            uni = 12;

        }


        System.out.println(cnt);
        System.out.println(mund);
        System.out.println(mund2);
        System.out.println(uni);

        System.out.println(err);
        System.out.println(res);

        res = 0;

        A_Test(pan);

        S_Metodos();

    }


    public void Recorrer() {

        int g = 0;

        for (int i = 0; i < pos.length - 1; i++) {

            g = pos[i];

            pos[i] = pos[i + 1];

            pos[i + 1] = g;
           
        }

    }


    int la = 0;
    int but = 0;

    static int res = 0;
    static int f = 0;

    public void Evaluar() {

        la = mod[mund];
        
        if (uni == 0 || uni == 2) {
            
            if (la == pos[but]) {

                res++;

                f = 1;
                    
                JOptionPane.showMessageDialog(null, null, "Control", JOptionPane.INFORMATION_MESSAGE, F_Carita);
                
            } else {
                                
                JOptionPane.showMessageDialog(null, null, "Control", JOptionPane.INFORMATION_MESSAGE, T_Carita);
                
            }

        } else {

            if (la == pos[but]) {

                res++;

                f = 1;

            }

        }
                
        System.out.println("Res: " + res);
        System.out.println(f); // Falta anexarlo al Array

        f = 0;

        Recorrer();
         
    }


    //Nuevo metodo
    //Evaluaion agragada al array 
    //mund, mund2 <- me marca las pocisiones del array

    
    public void Siguiente() {

        Limpiar();

        if (cnt < 2) {

            cnt++;
           
        } else {

            if (mund < 2) {

                cnt = 0;

                mund++;

            } else{

                if (mund2  < 2) {

                    mund2++;
                    
                } else {

                    uni++;

                    mund2 = 0;

                }
                
                cnt = 0;

                mund = 0;

                R_Pres();

            }

        }
        
        S_Metodos();

    }


    ActionListener b_1 = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) { 

            but = 0;

            Evaluar();

            Siguiente();

        }
    }; 
    
    ActionListener b_2 = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) { 

            but = 1;

            Evaluar();

            Siguiente();

		}
    }; 
    
    ActionListener b_3 = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) { 

            but = 2;

            Evaluar();

            Siguiente();

        }
    }; 
    
    ActionListener emp = new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {

            tit.setVisible(false);
            s_tit.setVisible(false);
            inst.setVisible(false);
            red.setVisible(false);
            b_empezar.setVisible(false);



            res = 0;

            A_Test(pan);

            if(uni == 0) {

                R_Pres();

                S_Metodos();

            } else {
    
                uni++;
    
                S_Metodos();

            }

		}
	}; 
    
}