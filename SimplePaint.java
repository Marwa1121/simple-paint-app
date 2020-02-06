/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
 
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics.*;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import java.util.ArrayList;
import java.util.ArrayList.*; 
public class SimplePaint extends Applet implements MouseMotionListener, MouseListener,ActionListener {
public int col;
public int f =0;
public int j1=0;
public int j2=0;
public int j3=0;
public int j4=0;
public int j5=j1+j2+j3+j4;

public int i=0;
Line l =new Line (); 
Rect l2 =new Rect(); 
Oval l3 =new Oval();
Fillrect l4 = new Fillrect();


public void init() {
  this.addMouseMotionListener(this);
  addMouseListener(this);    
  
   Button b1=new Button ("Line");   
   b1.addActionListener(this);
   add(b1);

   Button b2=new Button ("Rectangle");   
   b2.addActionListener(this);
   add(b2);
   
   Button b3=new Button ("Oval");   
   b3.addActionListener(this);
   add(b3);
  
   Button b4=new Button ("Red");   
   b4.addActionListener(this);
   add(b4);
   
   
   Button b5=new Button ("Blue");   
   b5.addActionListener(this);
   add(b5);
   
    Button b6=new Button ("Fillrect");   
   b6.addActionListener(this);
   add(b6);

   
   Button b7=new Button ("ClearAll");   
   b7.addActionListener(this);
   add(b7);

}
/****************************/
public void actionPerformed(ActionEvent e)
 {   
  String str =e.getActionCommand();
  if (str.equals("Line"))
   {
         f=1;
        repaint();
        
    }
   if (str.equals("Rectangle"))
   {   
       f=2;
       repaint();
    }
   if (str.equals("Oval"))
   {   
       f=3;
       repaint();

    }
  
   if (str.equals("Fillrect"))
   {   
 f=4;
repaint();

    }
     if (str.equals("ClearAll"))
   {   
 f=5;
repaint();

    }
  if (str.equals("Red"))
   {   
 f=6;
repaint();

    }
   if (str.equals("Blue"))
   {   
 f=7;
repaint();}
 /*********************/
     
  
   }
    public void paint(Graphics g) {

       l. stratprev1[j1] = new Point(l.startPoint1.x ,l.startPoint1.y);
       l. endprev1[j1]   =new  Point (l.endPoint1.x ,l.endPoint1.y);
       l2. stratprev2[j2]= new Point(l2.startPoint2.x ,l2.startPoint2.y);
       l2. endprev2[j2]  =new  Point (l2.endPoint2.x ,l2.endPoint2.y);
       l3. stratprev3[j3] = new Point(l3.startPoint3.x ,l3.startPoint3.y);
       l3. endprev3[j3]=new  Point (l3.endPoint3.x ,l3.endPoint3.y);
       l4. stratprev4[j4] = new Point(l4.startPoint4.x ,l4.startPoint4.y);
       l4. endprev4[j4]=new  Point (l4.endPoint4.x ,l4.endPoint4.y);
        
            Color c1=Color.red;
            Color c2=Color.blue;
            Color c3=Color.green;
            Color c4=Color.white;

        for (i=0;i<=j1;i++)
        {
                     g.setColor (c1);
                  if(f==7)
                    {
                       g.setColor (c2);
  
                     }
        g.drawLine (l.stratprev1[i].x ,l.stratprev1[i] .y , l.endprev1[i].x , l.endprev1[i].y);
        }
        
        
         for (i=0;i<=j2;i++)
        {
        g.setColor (c2);
        if (f==6)
            {
              g.setColor (c1);
  
            }
        g.drawRect(l2.stratprev2[i].x ,l2.stratprev2[i] .y ,l2. endprev2[i].x-l2.stratprev2[i].x , l2.endprev2[i].y-l2.stratprev2[i].y);

        }
         
         for (i=0;i<=j3;i++)
        {
               g.setColor (c3);
              if (f==6)
            {
              g.setColor (c1);
  
            }
                if(f==7)
                    {
                       g.setColor (c2);
  
                     }
            g.drawOval(l3.stratprev3[i].x ,l3.stratprev3[i] .y ,l3. endprev3[i].x-l3.stratprev3[i].x , l3.endprev3[i].y-l3.stratprev3[i].y);

        }
           for (i=0;i<=j4;i++)
        {
             g.setColor (c3);
             if (f==6)
            {
              g.setColor (c1);
  
            }
               if(f==7)
                    {
                       g.setColor (c2);
  
                     }
            g.fillRect(l4.stratprev4[i].x ,l4.stratprev4[i] .y ,l4. endprev4[i].x-l4.stratprev4[i].x , l4.endprev4[i].y-l4.stratprev4[i].y);

        }
           
     if (f==5) { 

       Dimension d = getSize();
g.setColor(Color.WHITE);
g.fillRect(0, 0, d.width, d.height);  
         j1=j2=j3=j4=0;
     }
   
    }
  
        
       
/*###################################*/  
    
    
    
   
    public void mouseDragged(MouseEvent e) {
        if (f==1){
       l. endPoint1 = e.getPoint();
        repaint();

        }
         if (f==2){
       l2. endPoint2 = e.getPoint();
        repaint();

        } 
           if (f==3){
       l3. endPoint3 = e.getPoint();
        repaint();

        }
              if (f==4){
       l4. endPoint4 = e.getPoint();
        repaint();

        }  

    }

    public void mouseMoved(MouseEvent arg0) {

    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {

if(f==1){
      l .startPoint1 = e.getPoint();
      l. endPoint1 = e.getPoint();

        repaint();}
if(f==2){
      l2 .startPoint2 = e.getPoint();
      l2. endPoint2 = e.getPoint();

        repaint();}


if(f==3){
      l3.startPoint3 = e.getPoint();
      l3. endPoint3 = e.getPoint();
        repaint();}
if(f==4){
      l4.startPoint4 = e.getPoint();
      l4. endPoint4 = e.getPoint();
        repaint();}
    }
    

    
    public void mouseReleased(MouseEvent e) {
        if (f==1)
      {
        j1++;
       
}
      
    if (f==2)
      {
        j2++;
}   
      if (f==3)
      {
        j3++;
}   
       if (f==4)
      {
        j4++;
}   
       if(f==5)
       {
           j1=j2=j3=j4=1;
           repaint();
       }
      
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }  
    
    
   /*############################3*/
    

  public  class Line   {
  public Point startPoint1 = new Point();
  public Point  endPoint1 = new Point();  
         Point []stratprev1= new Point[100];
         Point [] endprev1   =new Point[100];
         
       
    }
   /* **********/
  public  class Rect  {
  public Point startPoint2 = new Point();
 public Point  endPoint2 = new Point();  
         Point []stratprev2= new Point[100];
         Point [] endprev2   =new Point[100];
         
       
    }
  /*******************/
   public  class Oval  {
  public Point startPoint3 = new Point();
 public Point  endPoint3 = new Point();  
         Point []stratprev3= new Point[100];
         Point [] endprev3   =new Point[100];
         
       
    }
 /**********************/  
    public  class Fillrect  {
  public Point startPoint4 = new Point();
 public Point  endPoint4 = new Point();  
         Point []stratprev4= new Point[100];
         Point [] endprev4   =new Point[100];
      
       
    }
   /*********************/
   
     
    
}
