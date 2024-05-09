//ARRAY USING CLASSES:
// enter name,roll.no,five subject marks,total marks and percentage and division :

import javax.swing.JOptionPane;
class student
{  
   double roll,p,t;
   int i;
   double v[]=new double[5]; 
   String name,d;
   
  void setval(String n,double r,double ar[])
        { 
            name=n;
            roll=r;
            for(i=0;i<5;i++)
            {
              v[i]=ar[i];
            }
         }

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
              void display()
              {
                  System.out.println("name :"+name);
                  System.out.println("roll number : "+roll);
                  System.out.println("total marks : "+t);
                  System.out.println("percentage : "+p);
                  System.out.println("division :"+d);             
              }
}
    class c7
{
 public static void main(String args[])
      {
         double r,d;
           int  i;
         double v[]=new double[5];
         String name;
                   
     name = (JOptionPane.showInputDialog("Enter Name:"));         
     r=Double.parseDouble(JOptionPane.showInputDialog("Enter Roll Number:"));
      for(i=0;i<5;i++)
        {
          v[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
        }

       student k=new student();
       k.setval(name,r,v);
        k.marks();
        k.percentage();   
        k.division();
        k.display();             
      }
}
