// FINAL METHOD : FINAL OVERWRITE METHOD 
import javax.swing.JOptionPane;
class one
{
     int a=15;
       
     final void display()
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

class x19
{
    public static void main(String args [])
     {
             two k=new two();
             k.display();      
     }
}
