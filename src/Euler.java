import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;
import org.nfunk.jep.JEP;

public class Euler
{
     JEP jep;
     double r;
     double an;
     
     double r2;
     double an2;
     
     double rR;
     double anR;
     
    public Euler(double r1, double an1,double r2, double an2)
    {
          this.r=r1;
          this.an=an1;
          this.r2=r2;
          this.an2=an2;
          
          this.rR=0;
          this.anR=0;
    }
    
    public Euler()
    {
          this.r=0;
          this.an=0;
          this.r2=0;
          this.an2=0;
          this.rR=0;
          this.anR=0;
    }

    public Complex euToGeo1()
    {
        Complex num=new Complex();
      
        num.setRe(r*(Math.cos(an*Math.PI)));
        num.setIm(r*(Math.sin(an*Math.PI)));
     
        return num;
    }
    
     public Complex euToGeo2()
    {
        Complex num2=new Complex();
        
        num2.setRe(r2*(Math.cos(an2*Math.PI)));
        num2.setIm(r2*(Math.sin(an2*Math.PI)));
       
        return num2;
    }
    //------------------------------------------------------
    public double valor_r(Complex n)
    {
        r=n.abs();
        
        return r;
        
    }
    
    public double valor_an(Complex n)
    {
        double v=0;
        
        if(valor_r(n)==0)
        {
            v=0;
        }
        else
        {    
        v=Math.acos(n.re()/valor_r(n));
    
        }
        return v;
    }    
    
    public static double redondear(double numero)
    {
        double pE;
        double res;
        pE= Math.floor(numero);
        res=(numero-pE)*Math.pow(10,3);
        res=Math.round(res);
        res=(res/Math.pow(10,3))+pE;
        return res;
    }
    
    public double damerR(String R,Geometrica g)
    {
        String datos[]=R.split("e");
        String x= datos[0].substring(0, datos[0].length());
        
        return Double.parseDouble(x);
    }
    
     public double dameanR(String R,Geometrica g)
    {
        String datos2[]=R.split("i");
        String y= datos2[1].substring(1, datos2[1].length()-1);
        
        return Double.parseDouble(y);
    }
    
    public Complex RtoGeometrica (String R,Geometrica g)
    {
        Complex nR=new Complex();
        
        String datos[]=R.split("e");
        String x= datos[0].substring(0, datos[0].length()); //r
        
        String datos2[]=R.split("i");
        String y= datos2[1].substring(1, datos2[1].length()-1);

         nR.setRe(Double.parseDouble(x)*(Math.cos(Math.PI*Double.parseDouble(y))));
         nR.setIm(Double.parseDouble(x)*(Math.sin(Math.PI*Double.parseDouble(y))));
 
        return nR;
    } 
    
    public Complex RTtoGeometrica (String R,Geometrica g)
    {
        Complex nRr=new Complex();
        
        String datos[]=R.split("C");
        String x= datos[0].substring(0, datos[0].length()-1); //r
 
        String datos2[]=R.split("n");
        String y= datos2[1].substring(1, datos2[1].length()-4);
       
         nRr.setRe(Double.parseDouble(x)*(Math.cos(Math.PI*Double.parseDouble(y))));
         nRr.setIm(Double.parseDouble(x)*(Math.sin(Math.PI*Double.parseDouble(y))));
 
        return nRr;
    } 

    
}
