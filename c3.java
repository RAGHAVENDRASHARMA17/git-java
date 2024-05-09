// area of circle and it's circumfrence with classes method 

import javax.swing.JOptionPane;
class circle
{
       
  double r,c,a;
	void setval(double x)
	{
          r=x;
        }
           void area()
         {
             a=3.14*r*r;
         }
         void circum()
        {
            c=2*3.14*r;
        }
      void display()
       {
        System.out.println("area of circle : "+a); 
         System.out.println("circumfrence of circle : "+c); 
       }
}

class c3
{
      public static void main(String args[])
      {
         double x;
	x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter radius:"));
        circle k=new circle();
         k.setval(x);  
         k.area();
         k.circum();
         k.display();             
      }
}