// area of rectangel  with classes method 

import javax.swing.JOptionPane;
class tri
{
       
  double l,b,a;
	void setval(double x,double y)
	{
          l=x;
          b=y;
	}
           void area()
         {
             a=0.5*l*b;
         }
      void display()
       {
        System.out.println("area of circle : "+a); 
       }
}

class c2
{
      public static void main(String args[])
      {
         double x,y;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter length:"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter breadth:"));
         tri k=new tri();
         k.setval(x,y);  
         k.area();
         k.display();             
      }
}