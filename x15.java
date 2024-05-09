//SUPER METHOD:

import javax.swing.JOptionPane;
class one 
 {
        int x;
         
           one()
           {
                x=10;
           }
       void display()
	{
	System.out.println("value of x is "+x);
	} 
     
  };


class two extends one 
{
int x;
    two()
    {
	x=20;
	
       
    }

	void display()
	{
         super.display();
	System.out.println("value of x is "+x);
        //System.out.println("value of x is "+super.x);
	}  
};   

class x15
{
    public static void main(String args [])
     {
          two b=new two();
          b.display();
     }
}
