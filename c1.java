// area of rectangel  with classes method 

import javax.swing.JOptionPane;
class rect
{
       
  double l,b,a;
	void setval(double x,double y)
	{
          l=x;
          b=y;
	}
           void area()
         {
             a=l*b;
         }
      void display()
       {
        System.out.println("area of circle : "+a); 
       }
}

class c1
{
      public static void main(String args[])
      {
         double x,y;
       	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length:"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth:"));
         rect k=new rect();
         k.setval(x,y);  
         k.area();
         k.display();             
      }
}