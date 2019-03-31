import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;
import javax.swing.*;
import org.nfunk.jep.JEP;

public class FrameEuler extends JFrame
{
    JEP jep;
    
	JLabel eZ1;
	JTextField campo_rZ1;
	JLabel e_rZ1;
	
	JTextField campo_anZ1;
	JLabel e_iZ1;
	JLabel e_anZ1;
	
	JLabel eZ2;
	JTextField campo_rZ2;
	JLabel e_rZ2;
	
	JTextField campo_anZ2;
	JLabel e_iZ2;
	JLabel e_anZ2;
        
        JLabel simEuler;
        JLabel simEuler2;
	
	JLabel eZR;
	JTextArea campo_ZR;
        JScrollPane campoZrBarras;
//------------------------------------------------------------	
	JButton sum;
	JButton res;
	JButton mul;
	JButton div;
        JButton pot;

	JButton geo;
	JButton tri;
	
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
        
	
	public FrameEuler()
	{
                
                
		setTitle("Calculadora(Forma Euler)");
		setLayout(null);
                setSize(640,350);
                setLocationRelativeTo(null);
		setResizable(false);
		
		eZ1=new JLabel("Z1");
		eZ1.setBounds(95, 20, 60, 20);
		add(eZ1);
		
		campo_rZ1=new JTextField(20);
		campo_rZ1.setBounds(25, 70, 60, 20);
		add(campo_rZ1);
		
		e_rZ1=new JLabel("r");
		e_rZ1.setBounds(88, 70, 60, 20);
		add(e_rZ1);
//-------------------------------------------------------------------
		e_iZ1=new JLabel("i");
		e_iZ1.setBounds(120, 50, 60, 20);
		add(e_iZ1);
		
//-------------------------------------------------------------------		
		campo_anZ1=new JTextField(20);
		campo_anZ1.setBounds(130, 50, 60, 20);
		add(campo_anZ1);
		
		e_anZ1=new JLabel("θ");
		e_anZ1.setBounds(193, 50, 60, 20);
		add(e_anZ1);
                
                simEuler=new JLabel("e");
                simEuler.setBounds(110, 70, 60, 20);
		add(simEuler);
                
//--------------------------------------------------------------------------

//Z2 Z2 Z2-------------------------------------------------------------	
		
		eZ2=new JLabel("Z2");
		eZ2.setBounds(300, 20, 60, 20);
		add(eZ2);
		
		campo_rZ2=new JTextField(20);
		campo_rZ2.setBounds(230, 70, 60, 20);
		add(campo_rZ2);
		
		e_rZ2=new JLabel("r");
		e_rZ2.setBounds(293, 70, 5, 20);
		add(e_rZ2);
//-------------------------------------------------------------------
		e_iZ2=new JLabel("i");
		e_iZ2.setBounds(325, 50, 60, 20);
		add(e_iZ2);
		
//-------------------------------------------------------------------		
		campo_anZ2=new JTextField(20);
		campo_anZ2.setBounds(335, 50, 60, 20);
		add(campo_anZ2);
		
		e_anZ2=new JLabel("θ");
		e_anZ2.setBounds(398, 50, 60, 20);
		add(e_anZ2);
                
                simEuler2=new JLabel("e");
                simEuler2.setBounds(315, 70, 60, 20);
		add(simEuler2);
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
		sum.setIcon(new ImageIcon("src/sum.jpg"));
                sum.addActionListener(new EventosE());
		add(sum);
		
		res=new JButton();
		res.setBounds(70,170,30,30);
		res.setIcon(new ImageIcon("src/res.jpg"));
                res.addActionListener(new EventosE());
		add(res);
		
		mul=new JButton();
		mul.setBounds(110,130,30,30);
		mul.setIcon(new ImageIcon("src/mul.jpg"));
                mul.addActionListener(new EventosE());
		add(mul);
		
		div=new JButton();
		div.setBounds(110,170,30,30);
		div.setIcon(new ImageIcon("src/div.jpg"));
                div.addActionListener(new EventosE());
		add(div);
                
                pot=new JButton();
		pot.setBounds(70,210,30,30);
		pot.setIcon(new ImageIcon("src/pot.jpg"));
                pot.addActionListener(new EventosE());
		add(pot);


//------------------------------------------------------------------OPERCIONES COMPLEJAS		
		
		conZ1=new JButton();
		conZ1.setBounds(260,130,30,30);
		conZ1.setIcon(new ImageIcon("src/conZ1.jpg"));
                conZ1.addActionListener(new EventosE());
		add(conZ1);
		
		modZ1=new JButton();
		modZ1.setBounds(260,170,30,30);
		modZ1.setIcon(new ImageIcon("src/modZ1.jpg"));
                modZ1.addActionListener(new EventosE());
		add(modZ1);
		
		raizZ1=new JButton();
		raizZ1.setBounds(260,210,30,30);
		raizZ1.setIcon(new ImageIcon("src/raizZ1.jpg"));
                raizZ1.addActionListener(new EventosE());
		add(raizZ1);
//-----------------
		
		conZ2=new JButton();
		conZ2.setBounds(300,130,30,30);
		conZ2.setIcon(new ImageIcon("src/conZ2.jpg"));
                conZ2.addActionListener(new EventosE());
		add(conZ2);
		
		modZ2=new JButton();
		modZ2.setBounds(300,170,30,30);
		modZ2.setIcon(new ImageIcon("src/modZ2.jpg"));
                modZ2.addActionListener(new EventosE());
		add(modZ2);
		
		raizZ2=new JButton();
		raizZ2.setBounds(300,210,30,30);
		raizZ2.setIcon(new ImageIcon("src/raizZ2.jpg"));
                raizZ2.addActionListener(new EventosE());
		add(raizZ2);

//-----------------------------
		conZR=new JButton();
		conZR.setBounds(340,130,30,30);
		conZR.setIcon(new ImageIcon("src/conZR.jpg"));
                conZR.addActionListener(new EventosE());
		add(conZR);
		
		modZR=new JButton();
		modZR.setBounds(340,170,30,30);
		modZR.setIcon(new ImageIcon("src/modZR.jpg"));
                modZR.addActionListener(new EventosE());
		add(modZR);
		
		raizZR=new JButton();
		raizZR.setBounds(340,210,30,30);
		raizZR.setIcon(new ImageIcon("src/raizZR.jpg"));
                raizZR.addActionListener(new EventosE());
		add(raizZR);

//--------------------------------------
		
		geo=new JButton("Forma Algebraica");
		geo.setBounds(450,155,170,30);
                geo.addActionListener(new EventosE());
		add(geo);
		
		tri=new JButton("Forma Trigonometrica");
		tri.setBounds(450,205,170,30);
                tri.addActionListener(new EventosE());
		add(tri);
                
                bGraficar=new JButton("Graficar");
		bGraficar.setBounds(450,255,170,30);
                bGraficar.addActionListener(new EventosE());
		add(bGraficar);
           
		setVisible(true);	
	}
        
        class EventosE implements ActionListener
        {
            public void actionPerformed(ActionEvent e) 
            {
                Euler eu2=new Euler(Double.parseDouble(campo_rZ1.getText()),Double.parseDouble(campo_anZ1.getText()),Double.parseDouble(campo_rZ2.getText()),Double.parseDouble(campo_anZ2.getText()));
               
                Geometrica g2=new Geometrica(eu2.euToGeo1().re(),eu2.euToGeo1().im(),eu2.euToGeo2().re(),eu2.euToGeo2().im());
               
                if(e.getSource()==sum)
                {
                   g2.R=g2.sumar();
                    
                    eu2.rR=Euler.redondear(g2.R.abs());
                    
                    eu2.anR=Euler.redondear(eu2.valor_an(g2.R)/Math.PI);
                    
                     campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                     
                }
                
                if(e.getSource()==res)
                {
                    g2.R=g2.resta();
                    
                    eu2.rR=Euler.redondear(g2.R.abs());
                    eu2.anR=Euler.redondear(eu2.valor_an(g2.R)/Math.PI);
                     
                     campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                }
                
                if(e.getSource()==mul)
                {
                    g2.R=g2.Multiplicacion();
                    
                    eu2.rR=Euler.redondear(g2.R.abs());
                    eu2.anR=Euler.redondear(eu2.valor_an(g2.R)/Math.PI);
                     
                    campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                }
                
                if(e.getSource()==div)
                {
                   g2.R=g2.Division();
                    
                    eu2.rR=Euler.redondear(g2.R.abs());
                    eu2.anR=Euler.redondear(eu2.valor_an(g2.R)/Math.PI);
                     
                     campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                }
                
                if(e.getSource()==pot)
                {
                    
                    Complex a3=eu2.RtoGeometrica(campo_ZR.getText(), g2);
                    
                    FramePotencia p=new FramePotencia();
                    p.setgg(g2);
                    p.setAux(g2.a);
                    p.setAux2(g2.b);
                    p.setAux3(a3);
                }
                
                //-----------------------------------------------------------
                if(e.getSource()==conZ1)
                {
                    g2.a=g2.a.conj();
                  
                    eu2.rR=Euler.redondear(g2.a.abs());
                    eu2.anR=Euler.redondear(eu2.valor_an(g2.a)/Math.PI);
                     
                     campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                }
                
                if(e.getSource()==conZ2)
                {
                   g2.b=g2.b.conj();
                  
                   eu2.rR=Euler.redondear(g2.b.abs());
                   eu2.anR=Euler.redondear(eu2.valor_an(g2.b)/Math.PI);
                     
                    campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                }
                
                if(e.getSource()==conZR)
                {
                    Complex aux=eu2.RtoGeometrica(campo_ZR.getText(),g2);
                    
                    aux=aux.conj();
                      
                    eu2.rR=Euler.redondear(aux.abs());
                    eu2.anR=Euler.redondear(eu2.valor_an(aux));
                    
                     campo_ZR.setText(String.valueOf(eu2.rR)+"e^i("+String.valueOf(eu2.anR)+"pi)");
                    
                }
                //-------------------------------------------------------------
                if(e.getSource()==modZ1)
                { 
                    campo_ZR.setText(String.valueOf(eu2.r));
                }
                
                if(e.getSource()==modZ2)
                {
                   campo_ZR.setText(String.valueOf(eu2.r2));
                }
                
                if(e.getSource()==modZR)
                {
                    Complex aux=eu2.RtoGeometrica(campo_ZR.getText(),g2);
                      
                    eu2.rR=Euler.redondear(aux.abs());
                    eu2.anR=Euler.redondear(eu2.valor_an(aux)/Math.PI);
                    
                    campo_ZR.setText(String.valueOf(eu2.rR));   
                }
               
                 if(e.getSource()==raizZ1)
                {
                    eu2.euToGeo1();
                    
                    FrameRaices f=new FrameRaices();
                    f.setAux(g2.a);
                    f.setgg(g2);
  
                }
                
                if(e.getSource()==raizZ2)
                {
                   eu2.euToGeo2();
                    
                    FrameRaices f=new FrameRaices();
                    f.setAux(g2.b);
                    f.setgg(g2);
                }
                
                if(e.getSource()==raizZR)
                {
                  Complex aux=eu2.RtoGeometrica(campo_ZR.getText(),g2);
                  
                  FrameRaices f=new FrameRaices();
                    f.setAux(aux);
                    f.setgg(g2);
                }
                
                //---------------------------------
                if(e.getSource()==geo)
                {
                  Complex aux=eu2.RtoGeometrica(campo_ZR.getText(), g2);
                  
                   campo_ZR.setText(String.valueOf(aux.re()+"+i"+aux.im()));  
                }
                
                if(e.getSource()==tri)
                {
                    String c=campo_ZR.getText();
    
                    campo_ZR.setText(String.valueOf(eu2.damerR(c, g2))+"[Cos("+String.valueOf(eu2.dameanR(c, g2))+"pi)+iSen("+String.valueOf(eu2.dameanR(c, g2))+"pi)]");
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

                      Complex aux=eu2.RtoGeometrica(campo_ZR.getText(), g2);
                         
                   gComplejo.add(new Vector(0,0));
                   gComplejo.add(new Vector(aux.re(),aux.im()));     

                    grafica1.crearSerie("Eje X", datosS1);
                    grafica1.crearSerie("Eje Y", datosS2);
                    grafica1.crearSerie("ZR", gComplejo);

                    grafica1.mostrarGrafica();
                }
                
                
                
                //--------------------------------------------------------

            }  
        }
}