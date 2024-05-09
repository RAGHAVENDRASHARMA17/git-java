// enter name,roll.no,five subject marks,total marks and percentage and division using hiearchial //inheritance with constructor parametrized :

import javax.swing.JOptionPane;
class student
{  
   double roll;
   String fname;
   String name;
    String c;
   int i; 
   double v[]=new double[5];
   double t,p;
   String d;
    
        student(String n,double r,String s, String city)
        { 
            name=n;
            roll=r;
            fname=s;
            c=city;
        }
             void marks(double ar[])
            { 
               for(i=0;i<5;i++)
               {
                 v[i]=ar[i];
               }
            }

           void display()
            {
               System.out.println("Name :"+name);
               System.out.println("Roll Number : "+roll);
               System.out.println("Father Name : "+fname);
               System.out.println("City Name : "+c);
               System.out.println("Total Marks : "+t);
               System.out.println("Percentage : "+p);
               System.out.println("Division :"+d);             
            }
   };

class quaterly extends student
{
       quaterly(String n,double r,String s, String city)
        { 
            super(n,r,s,city);
        } 
            void marksq(double ar[])
            { 
               for(i=0;i<5;i++)
               {
                 v[i]=ar[i];
               }
            }

              void totalmarksq()
             {   
		for(i=0;i<=4;i++)
		  {   
                    t=t+v[i];
	          }
 	     }
 
              void percentageq()
               { 
                    p=t/5;
	       }

            void divisionq()
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


class half extends student
{
 
        half(String n,double r,String s, String city)
         { 
            super(n,r,s,city);
         } 

           void marksh(double ar[])
            { 
               for(i=0;i<5;i++)
               {
                 v[i]=ar[i];
               }
            }

              void totalmarksh()
             {   
		for(i=0;i<=4;i++)
		  {   
                    t=t+v[i];
	          }
 	     }
 
              void percentageh()
               { 
                    p=t/5;
	       }

            void divisionh()
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
        
  class yearly extends student
   {
     
         yearly(String n,double r,String s, String city)
         { 
            super(n,r,s,city);
         } 
     
            void marksy(double ar[])
             {
               for(i=0;i<5;i++)
               {
                 v[i]=ar[i];
               }
            }
        
            void totalmarksy()
             {   
		for(i=0;i<5;i++)
		  {   
                    t=t+v[i];
	          }
                     
 	     }

              void percentagey()
               { 
                    p=t/5;
	       }

            void divisiony()
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

  class x14
{    
 public static void main(String args[])
      {
         double roll;
           int  i;
         double v[]=new double[5];
         String name; 
         String fname; 
         String c;                 
   
      name = (JOptionPane.showInputDialog("Enter Name:"));         
      roll=Double.parseDouble(JOptionPane.showInputDialog("Enter Roll Number:"));
      fname = (JOptionPane.showInputDialog("Enter Father Name:"));
      c = (JOptionPane.showInputDialog("Enter City Name:"));

       System.out.println("FOR QUATERLY :");
       for(i=0;i<5;i++)
        {
          v[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
        }
                             
        quaterly a=new quaterly(name,roll,fname,c); 
        a.marksq(v);
        a.totalmarksq();
        a.percentageq();   
        a.divisionq();
        a.display();
       
       System.out.println("FOR HALF YEARLY :");
       for(i=0;i<5;i++)
        {
          v[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
        }
                             
        half b=new half(name,roll,fname,c); 
        b.marksh(v);
        b.totalmarksh();
        b.percentageh();   
        b.divisionh();
        b.display();
               
         System.out.println("FOR YEARLY :");
            for(i=0;i<5;i++)
        {
          v[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SUBJECT:"));
        }
        
        yearly d=new yearly(name,roll,fname,c);
        d.marksy(v);
        d.totalmarksy();
        d.percentagey();   
        d.divisiony();
        d.display();             
      }
}
