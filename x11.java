// find area of rectangle and triangle using constructor with parametrized in hiearchial //inheritance method:

import javax.swing.JOptionPane;
class shape
{
     double l,b,a;
       
       shape(double x,double y)
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
     square(double x,double y)
       {
         super(x,y);
       }
        void gets()
        {
           a=l*l;
        }              
};

 class circle extends shape
 {
       circle(double x, double y)
       {
         super(x,y);
       }
       
       void getc()
        {
          a=3.14*l*l;
        }
 };

class rectangle extends shape
{
      rectangle(double x, double y)
       {
         super(x,y);
       }

          void getr()
            {
                a=l*b;
            } 
};

 class triangle extends shape
  {
       triangle(double x, double y)
       {
         super(x,y);
       }

      void gett()
       {
          a=0.5*l*b;
       }     
  };   
  
   class x11
  {
     public static void main(String args[])
       {
         double l,b;
         
         l=Double.parseDouble(JOptionPane.showInputDialog("Enter Length:"));  
               
         circle a=new circle(l,l);          
         a.getc();
         System.out.println("circle :");
         a.display();
        
         square d=new square(l,l); 
         d.gets();
         System.out.println("square :");
         d.display();

         l=Double.parseDouble(JOptionPane.showInputDialog("Enter Length:"));  
         b=Double.parseDouble(JOptionPane.showInputDialog("Enter Breadth:"));
       
         rectangle e=new rectangle(l,b); 
         e.getr();
         System.out.println("rectangle :");
         e.display();

         l=Double.parseDouble(JOptionPane.showInputDialog("Enter Length:"));  
         b=Double.parseDouble(JOptionPane.showInputDialog("Enter Breadth:"));

          triangle f=new triangle(l,b); 
          f.gett();
          System.out.println("rectangle :");
          f.display();
       
       }
 }