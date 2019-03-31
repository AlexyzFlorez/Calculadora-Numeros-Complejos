
import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Geometrica 
{
    
    JEP jep;
    
    Complex a;
    Complex b;
    Complex R;
    
    public Geometrica(double rz1, double iz1, double rz2, double iz2)
    {
        a=new Complex(rz1,iz1);
        b=new Complex(rz2,iz2);
        R=new Complex();
        jep=new JEP();
    }
    
    public String tostring(Complex a)
    {
        String st="";
        if(a.im()<0)
        {
            st=String.valueOf(a.re())+" - i"+String.valueOf(a.im()*-1);
        }
        
        if(a.im()>=0)
        {
            st=String.valueOf(a.re())+" + i"+String.valueOf(a.im());
        }
        
        return st;
    }
    
    
    public Complex sumar()
    {
        
        Complex R=new Complex(a.re()+b.re(),a.im()+b.im());
                
        return R;
    }
    
     public Complex resta()
    {
        
        Complex R=new Complex(a.re()-b.re(),a.im()-b.im());
                
        return R;
    }
     
    
    public Complex Multiplicacion()
    {
        
       return a.mul(b);
        
    }
    
    public Complex Division()
    {
        return a.div(b);
    }
    
    public Complex Conjugado(int ban)
    {
        Complex c= new Complex();
        if(ban==1)
        {
            c.setRe(a.re());
            c.setIm(a.im()*-1);
        }
        
        if(ban==2)
        {
            c.setRe(b.re());
            c.setIm(b.im()*-1);
        }
        
        if(ban==3)
        {
            c.setRe(R.re());
            c.setIm(R.im()*-1);
        }
        return c;
    }
    
    public double Modulo(int ban)
    {
        double c=0;
        if(ban==1)
        {
            c=a.abs();
        }
        
        if(ban==2)
        {
            c=b.abs();
        }
        
        if(ban==3)
        {
            c=R.abs();
        }
        return c;
    }
    
    public void toComplex (String R)
    {
        String datos[]=R.split("i");
        String x= datos[0].substring(0, datos[0].length()-1);
        String y= datos[0].charAt(datos[0].length()-1)+datos[1];
        
        if(x.charAt(x.length()-1)=='-')
        {
             x= datos[0].substring(0, datos[0].length()-2);
             this.R.setRe(Double.parseDouble(x));
            this.R.setIm(Double.parseDouble(y)*(-1));
        }
        else
        {
            x= datos[0].substring(0, datos[0].length()-2);
             this.R.setRe(Double.parseDouble(x));
             this.R.setIm(Double.parseDouble(y));
        }

    } 
    
    public ArrayList<Complex> dameRaices(Complex a,double n1)
    {
        ArrayList<Complex> raices = new ArrayList<>();
                
            Complex w=a;
            
            double n=n1;
            double pi2=2*Math.PI;
            
            double r=w.abs();
            double ang=Math.acos(w.re()/r);
                    
            double rChida=Math.pow(r,(1/n));
            double anChido;
            
            Complex aGrafica;
            
            for(double k=0;k<n;k++)
            {
                anChido=((ang+(pi2*k))/n);
                
                aGrafica=new Complex(rChida*Math.cos(anChido),rChida*Math.sin(anChido));
                raices.add(aGrafica);
                
            }
            return raices;
    }
    
      public Complex potencia(Complex p,double n)
        {
            Complex q=p.power(n);
            q.setRe(Euler.redondear(q.re()));
            q.setIm(Euler.redondear(q.im()));
            
            return q;

            //System.out.println("potencia"+q);
        }
}





