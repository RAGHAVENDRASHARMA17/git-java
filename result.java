// enter name,roll.no,five subject marks,total marks and percentage and division using single inheritance :

import javax.swing.JOptionPane;
class studentdata
{  
   double roll;
   double v[]=new double[5];
    int i; 
   String name;
   
   void setval(String n,double r,double ar[])
        { 
            name=n;
            roll=r;
            for(i=0;i<5;i++)
            {
              v[i]=ar[i];
            }
         }
};
        
  class calculate extends studentdata
    {
           double t,p;
            String d;
 
             void marks()
             {   
		for(i=0;i<=4;i++)
		  {   
                    t=t+v[i];
	          }
 	     } 
              void percentage()
               {
                  p=t/5;
	       }
          void division()
	   {
	      if(p>=60)
              { 
                 d=("first");  
              }		
               else if(p>=45)
               {
                  d=("second");
               }
                else if(p>=30)
                 {
                    d=("third");
                 }
                 else
                  {
                    d=("fail");
                  }
	    }
      }; 
           
     class displayresult extends calculate
      {
           void display()
            {
               System.out.println("name :"+name);
               System.out.println("roll number : "+roll);
               System.out.println("total marks : "+t);
               System.out.println("percentage : "+p);
               System.out.println("division :"+d);             
            }
      };

  class x6  
{    
 public static void main(String args[])
      {
         double r;
           int  i;
         double v[]=new double[5];
         String name;
                   
      name = (JOptionPane.showInputDialog("Enter Name:"));         
      r=Double.parseDouble(JOptionPane.showInputDialog("Enter Roll Number:"));
      for(i=0;i<5;i++)
        {
          v[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
        }

       displayresult k=new displayresult();
       k.setval(name,r,v);
        k.marks();
        k.percentage();   
        k.division();
        k.display();             
      }
}
