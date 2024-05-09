//CLASSES WITH OBJECT:   of 5 student
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
                  System.out.print(""+name);
                  System.out.print("\t"+roll);
                  System.out.print("\t"+t);
                  System.out.print("\t\t"+p);
                  System.out.println("\t\t"+d);               
              }
}
    class c11
{
 public static void main(String args[])
      {
         double r,d;
           int  i,j;
           double v[]=new double[5];
           student k[] =new student[5];
        for(i=0;i<5;i++)
       {  
                    
          String name = (JOptionPane.showInputDialog("Enter Name:"));         
          r=Double.parseDouble(JOptionPane.showInputDialog("Enter Roll Number:"));
           for(j=0;j<5;j++)
             {   
               v[j]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
             }    
           k[i]=new student();
           k[i].setval(name,r,v);
           k[i].marks();
           k[i].percentage();   
           k[i].division();
     }  
                  System.out.println("===========Tabel Form====================================");
                  System.out.println("NAME  | ROLL NUMBER | TOTAL MARKS | PERCENTAGE | DIVISION");
                  System.out.println("---------------------------------------------------------");
        for(i=0;i<5;i++)
          { 
            k[i].display(); 
          }            
      }
}
