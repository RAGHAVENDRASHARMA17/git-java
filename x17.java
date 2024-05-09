// FIND AREA OF CIRLE , TRIANGEL , RECTANGEL AND SQUARE  USE ABSTRACT CLASS:-

import javax.swing.JOptionPane;
abstract class shape
{
     double l,b,a;
         
          void setval(double x,double y)
           {
                l=x;
                b=y; 
           }
          void display()
            {
               System.out.println("area = "+a);
            }

};
 
class square extends shape 
{
       void gets()
        {
           a=l*l;
        } 
};

class circle extends shape
{
           void getc()
            {
                a=3.14*l*l;
            }
};

class rectangle extends shape 
{
           void getr()
            {
                a=l*b;
            }
};

class triangel extends shape
{
    void gett()
    {
        a=0.5*l*b;
    }
      
};
 
class x17
{
    public static void main(String args [])
     {
         double l,b;
    
          square j=new square();
          circle k=new circle();
          rectangle m=new rectangle();
          triangel n=new triangel();
 
         l=Integer.parseInt(JOptionPane.showInputDialog("Enter length:"));                  
         j.setval(l,l);
         j.gets();
         System.out.println("square");
         j.display();


         l=Integer.parseInt(JOptionPane.showInputDialog("Enter length:"));                  
         k.setval(l,l);
         k.getc();
         System.out.println("circle");
         k.display();

         l=Integer.parseInt(JOptionPane.showInputDialog("Enter length:")); 
         b=Integer.parseInt(JOptionPane.showInputDialog("Enter breadth:"));                
         m.setval(l,b);
         m.getr();
         System.out.println("rectangle");
         m.display();

         l=Integer.parseInt(JOptionPane.showInputDialog("Enter length:")); 
         b=Integer.parseInt(JOptionPane.showInputDialog("Enter breadth:")); 
         n.setval(l,b);
         n.gett();
         System.out.println("triangle");
         n.display();
     }
}