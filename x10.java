// find area of rectangle and triangle using constructor with parametrized in multilevel //inheritance method:

import javax.swing.JOptionPane;
class square
{
      double l,b,a;
       
       square(double x,double y)
        {
           l=x;
           b=y;
        }
              
        void gets()
        {
           a=l*l;
        }    
           void display() 
           {
               System.out.println("area = "+a);
           }
};

class rectangle extends square
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

 class triangle extends rectangle
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
  
   class x10
  {
     public static void main(String args[])
       {
         double l,b;
         
         l=Double.parseDouble(JOptionPane.showInputDialog("Enter Length:"));  
         b=Double.parseDouble(JOptionPane.showInputDialog("Enter Breadth:"));
        
         triangle j=new triangle(l,b); 
        
         j.gets();
         System.out.println("square :");
         j.display();
    
          j.getr();
          System.out.println("rectangle :");
          j.display();
       
          j.gett();
          System.out.println("triangle :");
          j.display(); 
       }
 }