//TOPIC : CONSTRUCTOR PARAMETERLESS AND PARAMETRIZED 
// ENTER A PROGRAM TO FIND SIMPEL INTREST WITH PARAMETERIZED

import javax.swing.JOptionPane;
class intrest
{  
   int year,amount,rate,si;  
    
    intrest(int x,int y,int z)
        { 
           year=x;
           amount=y;
           rate=z;
        }
            void getintrest()
           {  
             si=(amount*year*rate)/100;
           }
              void display()
              {  
                  System.out.println("SIMPEL INTREST : "+si);
              }

 };
         
 class o8
{
     public static void main(String args[])
      {
          int amount,year,rate;
        
           amount= Integer.parseInt(JOptionPane.showInputDialog("Enter Amount:")); 
           rate= Integer.parseInt(JOptionPane.showInputDialog("Enter Rate:"));
           year= Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));              

          intrest k=new intrest(amount,rate,year);
          k.getintrest();           
          k.display();
        
      }
}
