// FINAL METHOD : FINAL CLASS METHOD

import javax.swing.JOptionPane;
final class one
{
     int a=15;
       
      void display()
     {
         System.out.println("value of a is "+a);
     }
};

class two extends one
{
      void display()
       {
            System.out.println("value of a is "+a);
       }
};

class x20
{
    public static void main(String args [])
     {
             two k=new two();
             k.display();      
     }
}
