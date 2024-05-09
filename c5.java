// enter name,roll.no,five subject marks,total marks and percentage and division :

import javax.swing.JOptionPane;
class student
{  
  double roll,v1,v2,v3,v4,v5,p,t;
   String name,d;
   
  void setval(double a,double b,double c,double d,double e,String n,double r)
        { 
            name=n;
            roll=r;
             v1=a;
             v2=b;
             v3=c;
             v4=d;
             v5=e;
         }
          void marks()
          {
                t=v1+v2+v3+v4+v5;
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
    class c5
{
 public static void main(String args[])
      {
         double r,v1,v2,v3,v4,v5,d;
         String name;
           
           
       name = (JOptionPane.showInputDialog("Enter Name:"));
       r= Double.parseDouble(JOptionPane.showInputDialog("Enter Roll Number:"));
       v1=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter MATHS:"));
       v2=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter HINDI:"));
       v3=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter ENGLISH:"));
       v4=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SCIENCE:"));
       v5=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter SOCIAL SCIENCE:"));
       student k=new student();
        k.setval(v1,v2,v3,v4,v5,name,r);
        k.marks();
        k.percentage();   
        k.division();
        k.display();             
      }
}
