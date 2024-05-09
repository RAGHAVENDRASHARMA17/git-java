//TOPIC : CONSTRUCTOR OVERLOADING
// ENTER A PROGRAM TO FIND SIMPEL INTREST WITH CONSTRUCTOR OVERLOADING

import javax.swing.JOptionPane;
class intrest
{  
   int year,amount,rate,si;
         
    intrest(int x,int y,int z)
        { 
           amount=x;
           rate=y;
           year=z;
        }
          intrest(int x,int y)
        { 
           amount=x;
           rate=y;
          year= Integer.parseInt(JOptionPane.showInputDialog("Enter Year:")); 
        }
         
        intrest(int x)
        { 
           amount=x;
          rate= Integer.parseInt(JOptionPane.showInputDialog("Enter rate:"));
          year= Integer.parseInt(JOptionPane.showInputDialog("Enter Year:")); 
        }

         intrest()
        { 
           amount=0;
           rate=0;
           year=0;
          amount= Integer.parseInt(JOptionPane.showInputDialog("Enter amount:"));
          rate= Integer.parseInt(JOptionPane.showInputDialog("Enter rate:"));
          year= Integer.parseInt(JOptionPane.showInputDialog("Enter Year:")); 
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
         
 class o9
{
     public static void main(String args[])
      {
          int amount,year,rate;
        
           amount= Integer.parseInt(JOptionPane.showInputDialog("Enter Amount:")); 
           rate= Integer.parseInt(JOptionPane.showInputDialog("Enter Rate:"));
           year= Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));              

          intrest k1=new intrest(amount,rate,year);
          k1.getintrest();           
          k1.display();
 
          System.out.println("");
 
          amount= Integer.parseInt(JOptionPane.showInputDialog("Enter Amount:"));   
          rate= Integer.parseInt(JOptionPane.showInputDialog("Enter Rate:"));
         
          intrest k2=new intrest(amount,rate);
          k2.getintrest();           
          k2.display();

          System.out.println("");
         
          amount= Integer.parseInt(JOptionPane.showInputDialog("Enter Amount:")); 
            
          intrest k3=new intrest(amount);
          k3.getintrest();           
          k3.display();
          
          System.out.println("");
 
         intrest k4=new intrest();
          k4.getintrest();           
          k4.display();
 
                        
      }
}
