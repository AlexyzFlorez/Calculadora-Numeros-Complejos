import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;

import org.nfunk.jep.JEP;

public class FrameRaices extends JFrame
{
    Geometrica gg;
    
    Complex aux;
    
    JLabel en;
    JTextField campo_n;
    JTextArea area;
    JScrollPane areaB;
    JButton calcular;
    JButton graficar;
    
    public void setAux(Complex a)
    {
        this.aux=a;
    }
    public void setgg(Geometrica h)
    {
        this.gg=h;
    }
    
    public FrameRaices()
    {
        
                setTitle("Raices");
		setLayout(null);
                setSize(600,400);
                setLocationRelativeTo(null);
		setResizable(false);
                
                en=new JLabel("n");
		en.setBounds(15, 20, 60, 20);
		add(en);
                
                campo_n=new JTextField(20);
		campo_n.setBounds(25, 20, 60, 20);
		add(campo_n);
                
                calcular=new JButton("Calcular");
                calcular.setBounds(15,70,120,30);
                calcular.addActionListener(new EventosR());
                add(calcular);
                
                area=new JTextArea(8,20);
                areaB=new JScrollPane(area);
		areaB.setBounds(170, 20, 350, 250);
		add(areaB);
                
                graficar=new JButton("Graficar");
                graficar.setBounds(250,300,120,30);
                graficar.addActionListener(new EventosR());
                add(graficar);

                setVisible(true);
    }
        
   class EventosR implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            
            if(e.getSource()==calcular)
            {
                ArrayList<Complex>rParaGraficar=gg.dameRaices(aux,Double.parseDouble(campo_n.getText()));
                int n=0;
                
                area.setText("");
                
                 for(Complex a:rParaGraficar)
                    {
                        
                        area.append("W"+n+"="+Euler.redondear(a.re())+"+i("+Euler.redondear(a.im())+")"+"\n");
                        //------Euler
                        
                          Euler eu11=new Euler();

                        eu11.rR=Euler.redondear(a.abs());
           
                        eu11.anR=Euler.redondear(eu11.valor_an(a)/Math.PI);
 
                        area.append("W"+n+"="+String.valueOf(eu11.rR)+"e^i("+String.valueOf(eu11.anR)+"pi)"+"\n");

                        area.append("W"+n+"="+String.valueOf(eu11.rR)+"[Cos("+String.valueOf(eu11.anR)+"pi)+iSen("+String.valueOf(eu11.anR)+"pi)]"+"\n"+"\n");
                  
// campo_ZR.setText(String.valueOf(eu3.rR)+"e^i("+String.valueOf(eu3.anR)+"pi)");
                        
                        //----------
                        
                        n++;
                    }
            }
            
            if(e.getSource()==graficar)
            {
                    Grafica grafica1 = new Grafica("Grafica","Re", "Im");
                    ArrayList<Vector> datosS1 = new ArrayList<>();
                    ArrayList<Vector> datosS2 = new ArrayList<>();
                    ArrayList<Complex>rParaGraficar=gg.dameRaices(aux,Double.parseDouble(campo_n.getText()));
 
                    //x
                    datosS1.add(new Vector(-1, 0));
                    datosS1.add(new Vector(1, 0));

                    //y
                    datosS2.add(new Vector(0, -1));
                    datosS2.add(new Vector(0, 1));
                    
                    
                    int n=0;
                    
                    for(Complex a:rParaGraficar)
                    {
                        ArrayList<Vector> datos = new ArrayList<>();
                        
                        datos.add(new Vector(0, 0));
                        datos.add(new Vector(a.re(), a.im()));
                       
                    
                        grafica1.crearSerie("W"+n, datos);
                         n++;
                    }

                        grafica1.crearSerie("Eje X", datosS1);
                        grafica1.crearSerie("Eje Y", datosS2);

                        grafica1.mostrarGrafica();
            }
        }    
    }

    
}
