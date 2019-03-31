import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;

import org.nfunk.jep.JEP;

public class FramePotencia extends JFrame
{
    Geometrica gg;
    
    Complex aux;
    Complex aux2;
    Complex aux3;
    
    JLabel z;
    JTextField campo_z;
    
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
    
    public void setAux2(Complex b)
    {
        this.aux2=b;
    }
    
    public void setAux3(Complex c)
    {
        this.aux3=c;
    }
    
        
    
    public void setgg(Geometrica h)
    {
        this.gg=h;
    }
    
    public FramePotencia()
    {
        
                setTitle("Potencia");
		setLayout(null);
                setSize(600,200);
                setLocationRelativeTo(null);
		setResizable(false);
                
                
                z=new JLabel("z");
		z.setBounds(25, 20, 60, 20);
		add(z);
                
                campo_z=new JTextField(20);
		campo_z.setBounds(35, 20, 60, 20);
		add(campo_z);
                
                en=new JLabel("n");
		en.setBounds(25, 50, 60, 20);
		add(en);
                
                campo_n=new JTextField(20);
		campo_n.setBounds(35, 50, 60, 20);
		add(campo_n);
                
                calcular=new JButton("Calcular");
                calcular.setBounds(15,90,120,30);
                calcular.addActionListener(new EventosP());
                add(calcular);
                
                area=new JTextArea(8,20);
                areaB=new JScrollPane(area);
		areaB.setBounds(170, 20, 350, 110);
		add(areaB);
                
                graficar=new JButton("Graficar");
                graficar.setBounds(15,130,120,30);
                graficar.addActionListener(new EventosP());
                add(graficar);

                setVisible(true);
    }
        
   class EventosP implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            
            if(e.getSource()==calcular)
            {
                area.setText("");
                
                if(campo_z.getText().equals("1"))
                {
                    Complex po=gg.potencia(aux, Double.parseDouble(campo_n.getText()));
                    
                    area.append(Euler.redondear(po.re())+"+i("+Euler.redondear(po.im())+")"+"\n");
                    
                      Euler eu11=new Euler();

                        eu11.rR=Euler.redondear(po.abs());
           
                        eu11.anR=Euler.redondear(eu11.valor_an(po)/Math.PI);
 
                        area.append(String.valueOf(eu11.rR)+"e^i("+String.valueOf(eu11.anR)+"pi)"+"\n");
                         area.append(String.valueOf(eu11.rR)+"[Cos("+String.valueOf(eu11.anR)+"pi)+iSen("+String.valueOf(eu11.anR)+"pi)]"+"\n"+"\n");
                }
                
                if(campo_z.getText().equals("2"))
                {
                    Complex po=gg.potencia(aux2, Double.parseDouble(campo_n.getText()));
                    
                    area.append(Euler.redondear(po.re())+"+i("+Euler.redondear(po.im())+")"+"\n");
                    
                      Euler eu11=new Euler();

                        eu11.rR=Euler.redondear(po.abs());
           
                        eu11.anR=Euler.redondear(eu11.valor_an(po)/Math.PI);
 
                        area.append(String.valueOf(eu11.rR)+"e^i("+String.valueOf(eu11.anR)+"pi)"+"\n");
                         area.append(String.valueOf(eu11.rR)+"[Cos("+String.valueOf(eu11.anR)+"pi)+iSen("+String.valueOf(eu11.anR)+"pi)]"+"\n"+"\n");
                }
                
                if(campo_z.getText().equals("3"))
                {
                    System.out.println("111111111111111111111");
                    Complex po=gg.potencia(aux3, Double.parseDouble(campo_n.getText()));
                    System.out.println("2222222222222222222222222");
                    area.append(Euler.redondear(po.re())+"+i("+Euler.redondear(po.im())+")"+"\n");
                    
                      Euler eu11=new Euler();

                        eu11.rR=Euler.redondear(po.abs());
           
                        eu11.anR=Euler.redondear(eu11.valor_an(po)/Math.PI);
 
                        area.append(String.valueOf(eu11.rR)+"e^i("+String.valueOf(eu11.anR)+"pi)"+"\n");
                         area.append(String.valueOf(eu11.rR)+"[Cos("+String.valueOf(eu11.anR)+"pi)+iSen("+String.valueOf(eu11.anR)+"pi)]"+"\n"+"\n");
                    System.out.println("33333333333333333333333333333333333");
                }
                   
            }
            
            if(e.getSource()==graficar)
            {
                    Grafica grafica1 = new Grafica("Grafica","Re", "Im");
                    ArrayList<Vector> datosS1 = new ArrayList<>();
                    ArrayList<Vector> datosS2 = new ArrayList<>();
                    ArrayList<Vector> datos = new ArrayList<>();
                    
 
                    //x
                    datosS1.add(new Vector(-1, 0));
                    datosS1.add(new Vector(1, 0));

                    //y
                    datosS2.add(new Vector(0, -1));
                    datosS2.add(new Vector(0, 1));
                    
                     if(campo_z.getText().equals("1"))
                {
                    Complex po=gg.potencia(aux, Double.parseDouble(campo_n.getText()));
                    
                    datos.add(new Vector(0,0));
                    datos.add(new Vector(po.re(), po.im()));
                    
                }
                     
                         if(campo_z.getText().equals("3"))
                {
                    Complex po=gg.potencia(aux3, Double.parseDouble(campo_n.getText()));
                    
                    datos.add(new Vector(0,0));
                    datos.add(new Vector(po.re(), po.im()));
                    
                }
                         
                             if(campo_z.getText().equals("3"))
                {
                    Complex po=gg.potencia(aux3, Double.parseDouble(campo_n.getText()));
                    
                    datos.add(new Vector(0,0));
                    datos.add(new Vector(po.re(), po.im()));
                    
                }
                     
                     
                    

                        grafica1.crearSerie("Eje X", datosS1);
                        grafica1.crearSerie("Eje Y", datosS2);
                        grafica1.crearSerie("Z", datos);

                        grafica1.mostrarGrafica();
            }
        }    
    }

    
}
