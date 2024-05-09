// enter name,roll.no,five subject marks,total marks and percentage and division using single inheritance //with constructor parameterized :

import javax.swing.JOptionPane;
class student
{  
   double roll;
   String fname;
    int i; 
   String name;
   
       student(String n,double r,String s)
        { 
            name=n;
            roll=r;
            fname=s;
         }
};

        
  class result extends student
    {
             double t,p;
           double v[]=new double[5];
            String d;

          result(String n,double r,String s)
         { 
            super(n,r,s);
         }
          
           void marks(double ar[])
            {
               for(i=0;i<5;i++)
               {
                 v[i]=ar[i];
               }
            }
 
             void totalmarks()
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
               System.out.println("Name :"+name);
               System.out.println("Roll Number : "+roll);
               System.out.println("Father Name : "+fname);
               System.out.println("Total Marks : "+t);
               System.out.println("Percentage : "+p);
               System.out.println("Division :"+d);             
            }
};

  class x12  
{    
 public static void main(String args[])
      {
         double r;
           int  i;
         double v[]=new double[5];
         String name;
         String fname;                  
   
      name = (JOptionPane.showInputDialog("Enter Name:"));         
      r=Double.parseDouble(JOptionPane.showInputDialog("Enter Roll Number:"));
      fname = (JOptionPane.showInputDialog("Enter Father Name:"));
       for(i=0;i<5;i++)
        {
          v[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
        }

       result k=new result(name,r,fname);
        k.marks(v);
        k.totalmarks();
        k.percentage();   
        k.division();
        k.display();             
      }
}
