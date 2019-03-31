import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;

import javax.swing.*;
import org.nfunk.jep.JEP;

public class FrameGeometrica extends JFrame
{
    JEP jep;

	JLabel eZ1;
	JTextField campo_ReZ1;
	JLabel e_ReZ1;
	
	JTextField campo_ImZ1;
	JLabel e_iZ1;
	JLabel e_ImZ1;
	
	JLabel eZ2;
	JTextField campo_ReZ2;
	JLabel e_ReZ2;
	
	JTextField campo_ImZ2;
	JLabel e_iZ2;
	JLabel e_ImZ2;
	
	JLabel eZR;
	JTextArea campo_ZR;
        JScrollPane campoZrBarras;
//------------------------------------------------------------	
	JButton sum;
	JButton res;
	JButton mul;
	JButton div;
        JButton pot;

	JButton tri;
	JButton eul;
	
	JButton conZ1;
	JButton modZ1;
	JButton raizZ1;
	
	JButton conZ2;
	JButton modZ2;
	JButton raizZ2;
	
	JButton conZR;
	JButton modZR;
	JButton raizZR;
        
        JButton bGraficar;
        
	
	public FrameGeometrica()
	{
            
		setTitle("Calculadora(Forma Algebraica)");
		setLayout(null);
                setSize(640,350);
                setLocationRelativeTo(null);
		setResizable(false);
		
		eZ1=new JLabel("Z1");
		eZ1.setBounds(95, 20, 60, 20);
		add(eZ1);
		
		campo_ReZ1=new JTextField(20);
		campo_ReZ1.setBounds(25, 50, 60, 20);
		add(campo_ReZ1);
		
		e_ReZ1=new JLabel("Re");
		e_ReZ1.setBounds(45, 70, 60, 20);
		add(e_ReZ1);
//-------------------------------------------------------------------
		e_iZ1=new JLabel("i");
		e_iZ1.setBounds(120, 50, 60, 20);
		add(e_iZ1);
		
//-------------------------------------------------------------------		
		campo_ImZ1=new JTextField(20);
		campo_ImZ1.setBounds(130, 50, 60, 20);
		add(campo_ImZ1);
		
		e_ImZ1=new JLabel("Im");
		e_ImZ1.setBounds(150, 70, 60, 20);
		add(e_ImZ1);
//--------------------------------------------------------------------------
		

		
		
		
//Z2 Z2 Z2-------------------------------------------------------------	
		
		eZ2=new JLabel("Z2");
		eZ2.setBounds(300, 20, 60, 20);
		add(eZ2);
		
		campo_ReZ2=new JTextField(20);
		campo_ReZ2.setBounds(230, 50, 60, 20);
		add(campo_ReZ2);
		
		e_ReZ2=new JLabel("Re");
		e_ReZ2.setBounds(255, 70, 60, 20);
		add(e_ReZ2);
//-------------------------------------------------------------------
		e_iZ2=new JLabel("i");
		e_iZ2.setBounds(325, 50, 60, 20);
		add(e_iZ2);
		
//-------------------------------------------------------------------		
		campo_ImZ2=new JTextField(20);
		campo_ImZ2.setBounds(335, 50, 60, 20);
		add(campo_ImZ2);
		
		e_ImZ2=new JLabel("Im");
		e_ImZ2.setBounds(355, 70, 60, 20);
		add(e_ImZ2);
//--------------------------------------------------------------------------
		
//ZR ZR ZR ZR------------------------------
		
		eZR=new JLabel("ZR");
		eZR.setBounds(530,20,20,20);
		add(eZR);
		
		campo_ZR=new JTextArea(8,20);
                campoZrBarras=new JScrollPane(campo_ZR);
		campoZrBarras.setBounds(450, 50, 170, 80);
		add(campoZrBarras);

//-----------------------------------------------------

                
		sum=new JButton();
		sum.setBounds(70,130,30,30);
		sum.setIcon(new ImageIcon(FrameGeometrica.class.getResource("sum.jpg")));
                sum.addActionListener(new Eventos());
		add(sum);
		
		res=new JButton();
		res.setBounds(70,170,30,30);
		res.setIcon(new ImageIcon("src/res.jpg"));
                res.addActionListener(new Eventos());
		add(res);
		
		mul=new JButton();
		mul.setBounds(110,130,30,30);
		mul.setIcon(new ImageIcon("src/mul.jpg"));
                mul.addActionListener(new Eventos());
		add(mul);
		
		div=new JButton();
		div.setBounds(110,170,30,30);
		div.setIcon(new ImageIcon("src/div.jpg"));
                div.addActionListener(new Eventos());
		add(div);
                
                pot=new JButton();
		pot.setBounds(70,210,30,30);
		pot.setIcon(new ImageIcon("src/pot.jpg"));
                pot.addActionListener(new Eventos());
		add(pot);

//------------------------------------------------------------------OPERCIONES COMPLEJAS		
		
		conZ1=new JButton();
		conZ1.setBounds(260,130,30,30);
		conZ1.setIcon(new ImageIcon("src/conZ1.jpg"));
                conZ1.addActionListener(new Eventos());
		add(conZ1);
		
		modZ1=new JButton();
		modZ1.setBounds(260,170,30,30);
		modZ1.setIcon(new ImageIcon("src/modZ1.jpg"));
                modZ1.addActionListener(new Eventos());
		add(modZ1);
		
		raizZ1=new JButton();
		raizZ1.setBounds(260,210,30,30);
		raizZ1.setIcon(new ImageIcon("src/raizZ1.jpg"));
                raizZ1.addActionListener(new Eventos());
		add(raizZ1);
//-----------------
		
		conZ2=new JButton();
		conZ2.setBounds(300,130,30,30);
		conZ2.setIcon(new ImageIcon("src/conZ2.jpg"));
                conZ2.addActionListener(new Eventos());
		add(conZ2);
		
		modZ2=new JButton();
		modZ2.setBounds(300,170,30,30);
		modZ2.setIcon(new ImageIcon("src/modZ2.jpg"));
                modZ2.addActionListener(new Eventos());
		add(modZ2);
		
		raizZ2=new JButton();
		raizZ2.setBounds(300,210,30,30);
		raizZ2.setIcon(new ImageIcon("src/raizZ2.jpg"));
                raizZ2.addActionListener(new Eventos());
		add(raizZ2);

//-----------------------------
		conZR=new JButton();
		conZR.setBounds(340,130,30,30);
		conZR.setIcon(new ImageIcon("src/conZR.jpg"));
                conZR.addActionListener(new Eventos());
		add(conZR);
		
		modZR=new JButton();
		modZR.setBounds(340,170,30,30);
		modZR.setIcon(new ImageIcon("src/modZR.jpg"));
                modZR.addActionListener(new Eventos());
		add(modZR);
		
		raizZR=new JButton();
		raizZR.setBounds(340,210,30,30);
		raizZR.setIcon(new ImageIcon("src/raizZR.jpg"));
                raizZR.addActionListener(new Eventos());
		add(raizZR);

//--------------------------------------
		
		tri=new JButton("Forma Trigonometrica");
		tri.setBounds(450,155,170,30);
                tri.addActionListener(new Eventos());
		add(tri);
		
		eul=new JButton("Forma Euler");
		eul.setBounds(450,205,170,30);
                eul.addActionListener(new Eventos());
		add(eul);
                
                bGraficar=new JButton("Graficar");
		bGraficar.setBounds(450,255,170,30);
                bGraficar.addActionListener(new Eventos());
		add(bGraficar);
                
		
		setVisible(true);	
	}
        
        class Eventos implements ActionListener
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                Geometrica g=new Geometrica(Double.parseDouble(campo_ReZ1.getText()),Double.parseDouble(campo_ImZ1.getText()),Double.parseDouble(campo_ReZ2.getText()),Double.parseDouble(campo_ImZ2.getText()));
              
                if(e.getSource()==sum)
                {
                   campo_ZR.setText(g.tostring(g.sumar()));
                }
                
                if(e.getSource()==res)
                {
                   campo_ZR.setText(g.tostring(g.resta()));
                }
                
                if(e.getSource()==mul)
                {
                   campo_ZR.setText(g.tostring(g.Multiplicacion()));
                }
                
                if(e.getSource()==div)
                {
                   campo_ZR.setText(g.tostring(g.Division()));
                }
                
                if(e.getSource()==pot)
                {
                    FramePotencia p=new FramePotencia();
                    p.setgg(g);
                    p.setAux(g.a);
                    p.setAux2(g.b);
                    g.toComplex(campo_ZR.getText());
                    p.setAux3(g.R);
                    
                }
                //-----------------------------------------------------------
                if(e.getSource()==conZ1)
                {
                   campo_ZR.setText(g.tostring(g.Conjugado(1)));
                }
                
                if(e.getSource()==conZ2)
                {
                   campo_ZR.setText(g.tostring(g.Conjugado(2)));
                }
                
                if(e.getSource()==conZR)
                {
                    g.toComplex(campo_ZR.getText());
                   campo_ZR.setText(g.tostring(g.Conjugado(3)));
                }
                //-------------------------------------------------------------
                if(e.getSource()==modZ1)
                {
                    campo_ZR.setText(String.valueOf(g.Modulo(1)));
                }
                
                if(e.getSource()==modZ2)
                {
                   campo_ZR.setText(String.valueOf(g.Modulo(2)));
                }
                
                if(e.getSource()==modZR)
                {
                    g.toComplex(campo_ZR.getText());
                    campo_ZR.setText(String.valueOf(g.Modulo(3)));
                }
                //-------------------------------------------------------------
                 if(e.getSource()==raizZ1)
                {  
                    FrameRaices f=new FrameRaices();
                    f.setAux(g.a);
                    f.setgg(g);
                }
                
                if(e.getSource()==raizZ2)
                {
                   FrameRaices f=new FrameRaices();
                    f.setAux(g.b);
                    f.setgg(g);
                }
                
                if(e.getSource()==raizZR)
                {
                    FrameRaices f=new FrameRaices();
                    g.toComplex(campo_ZR.getText());
                    f.setAux(g.R);
                    f.setgg(g);
                }
                //----------------------------------
                if(e.getSource()==tri)
                {
                    Euler eu4=new Euler();
                    
                    g.toComplex(campo_ZR.getText());

                    eu4.rR=Euler.redondear(g.R.abs());
           
                     eu4.anR=Euler.redondear(eu4.valor_an(g.R)/Math.PI);
 
                    campo_ZR.setText(String.valueOf(eu4.rR)+"[Cos("+String.valueOf(eu4.anR)+"pi)+iSen("+String.valueOf(eu4.anR)+"pi)]");
                }
                
                if(e.getSource()==eul)
                {
                    Euler eu3=new Euler();
                    
                    g.toComplex(campo_ZR.getText());

                    eu3.rR=Euler.redondear(g.R.abs());
           
                     eu3.anR=Euler.redondear(eu3.valor_an(g.R)/Math.PI);
 
                    campo_ZR.setText(String.valueOf(eu3.rR)+"e^i("+String.valueOf(eu3.anR)+"pi)");
                   
                }
                
                 if(e.getSource()==bGraficar)
                {
                    Grafica grafica1 = new Grafica("Grafica","Re", "Im");
                    ArrayList<Vector> datosS1 = new ArrayList<>();
                    ArrayList<Vector> datosS2 = new ArrayList<>();
                    ArrayList<Vector> gComplejo = new ArrayList<>();

                    //x
                    datosS1.add(new Vector(-50, 0));
                    datosS1.add(new Vector(50, 0));

                    //y
                    datosS2.add(new Vector(0, -50));
                    datosS2.add(new Vector(0, 50));

                    g.toComplex(campo_ZR.getText()); //damos el valor a r
                                   
                   gComplejo.add(new Vector(0,0));
                   gComplejo.add(new Vector(g.R.re(),g.R.im()));     

                    grafica1.crearSerie("Eje X", datosS1);
                    grafica1.crearSerie("Eje Y", datosS2);
                    grafica1.crearSerie("ZR", gComplejo);

                    grafica1.mostrarGrafica();
                }  
                //--------------------------------------------------------

            }  
        }
}




