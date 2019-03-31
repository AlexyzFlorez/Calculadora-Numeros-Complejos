
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.nfunk.jep.*;
import org.nfunk.jep.type.Complex;
import javax.swing.*;
import org.nfunk.jep.JEP;

import javax.swing.*;
import org.nfunk.jep.JEP;

public class FramePrincipal extends JFrame
{
    JEP jep;
    
    JLabel elejir;
    JButton geo;
    JButton tri;
    JButton eu;
    
    public FramePrincipal()
    {
        setTitle("Elejir Forma");
	setLayout(null);
        setSize(250,350);
        setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
        
        elejir=new JLabel("  Elije La Forma En La Que Trabajaras");
        elejir.setBounds(10,20,500,20);
        add(elejir);
        
        geo=new JButton("Forma Algebraica");
        geo.setBounds(10,80,220,40);
        geo.addActionListener(new EventosP());
        add(geo);
        
        tri=new JButton("Forma Trigonometrica");
        tri.setBounds(10,130,220,40);
        tri.addActionListener(new EventosP());
        add(tri);
        
        eu=new JButton("Forma Euler");
        eu.setBounds(10,180,220,40);
        eu.addActionListener(new EventosP());
        add(eu);
        
        
        
        setVisible(true);
    }
    
    class EventosP implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
            {
                if(e.getSource()==geo)
                {
                     FrameGeometrica f=new FrameGeometrica();
                }
                
                if(e.getSource()==eu)
                {
                    FrameEuler f=new FrameEuler();
                }
                
                if(e.getSource()==tri)
                {
                    FrameTrigonometrica f=new FrameTrigonometrica();
                }
                
                
            }
    }
    
}
