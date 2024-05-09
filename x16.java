//ABSTRACT CLASS : class where we can not make any object 
//it is data abstraction to reoresent the class 
//it use to inherit the class because it does not have any class
/*  ENTER NAME ,CODE,CITY,OF 1.WORKER,2.OFFICER, 3.MANAGER,4.SWEEPER
  for worker:                 
HRA=10 % OF SALARY            
DA=12 % OF SALARY                            
TA=5 % OF SALARY                
GS=SALARY+HRA+DA+TA 
PF=11 % OF SALARY
NS=GS-PF 

for officer
HRA=16 % OF SALARY 
DA=13 % OF SALARY        
TA=4 % OF SALARY                
GS=SALARY+HRA+DA+TA 
PF=10 % OF SALARY
NS=GS-PF 

for manager
HRA=17 % OF SALARY 
DA=11 % OF SALARY        
TA=7 % OF SALARY                
GS=SALARY+HRA+DA+TA 
PF=12 % OF SALARY
NS=GS-PF 

for sweeper
HRA=12 % OF SALARY 
DA=10 % OF SALARY        
TA=4 % OF SALARY                
GS=SALARY+HRA+DA+TA 
PF=9 % OF SALARY
NS=GS-PF     */

import javax.swing.JOptionPane;
abstract class employee
{
       String name;
       String city;
       double code;
       double salary;
       double hra,da,ta,gs,pf,ns;

        void setval(String x, double y, String z, double l)
          {
                 name=x;
                 code=y;
                 city=z;
                 salary=l;
          }  
            void display()
             {
                 System.out.println("NAME = "+name);
                 System.out.println("CODE = "+code);
                 System.out.println("CITY = "+city);
                 System.out.println("SALARY = "+salary);
                 System.out.println("HRA = "+hra);
                 System.out.println("DA = "+da);
                 System.out.println("TA = "+ta);
                 System.out.println("GS = "+gs);
                 System.out.println("PF = "+pf);
                 System.out.println("NS = "+ns);

             }
};

class worker extends employee
{
    void hraw()
    {
        hra=0.10*salary;
    }
    void daw()
     {
        da=0.12*salary;
     }
     void taw()
      {
        ta=0.5*salary;
      }
      void gsw()
       {
          gs=salary+hra+da+ta;
       }
       void pfw()
        {
            pf=0.11*salary;
        }
       void nsw()
        {
              ns=gs-pf;
        }
};

   class officer extends employee
 { 
         void hrao()
          {
           hra= 0.16*salary;  
          }        
         void dao()
          {
           da=0.13*salary;
          }
         void tao()
          {
           ta=0.4*salary;
          }
          void gso()
         {
           gs=salary+hra+da+ta;
         }
       void pfo()
        {
         pf=0.10*salary;
        }
       void nso()
        {
         ns=gs-pf;
        }
 };

  class manager extends employee
  {
       void hram()
        {
            hra=0.17*salary;
        }
       void dam()
        {
          da=0.11*salary;
        }
       void tam()
        {
          ta=0.7*salary;
        }
       void gsm()
         {
           gs=salary+hra+da+ta;
         }
        void pfm()
         {
           pf=0.12*salary;
         }
        void nsm()
         {
           ns=gs-pf;
         }
  };

  class sweeper extends employee
  {
         void hras()
          {
            hra=0.12*salary;
          } 
         void das()
          {
            da=0.10*salary;
          }
         void tas()
          {
             ta=0.4*salary;
          }
         void gss()
          {
            gs=salary+hra+da+ta;
          }
         void pfs()
          {
             pf=0.9*salary;
          } 
         void nss()
          {
            ns=gs-pf;
          }
  };

class x16
{
   public static void main(String args[])
    {  
           String name;
           String city;
           double code,salary;
    
          worker i=new worker();
          officer j=new officer();
          manager k=new manager();
          sweeper m=new sweeper();

              
       name=(JOptionPane.showInputDialog("Enter NAME:"));                  
       code=Integer.parseInt(JOptionPane.showInputDialog("Enter CODE:"));  
       city=(JOptionPane.showInputDialog("Enter CITY:")); 
       salary=Integer.parseInt(JOptionPane.showInputDialog("Enter SALARY:"));              
         i.setval(name,code,city,salary);
         i.hraw();
         i.daw();
         i.taw();
         i.gsw();
         i.pfw();
         i.nsw();
         System.out.println("WORKER:");
         i.display();

       name=(JOptionPane.showInputDialog("Enter NAME:"));                  
       code=Integer.parseInt(JOptionPane.showInputDialog("Enter CODE:"));  
       city=(JOptionPane.showInputDialog("Enter CITY:")); 
       salary=Integer.parseInt(JOptionPane.showInputDialog("Enter SALARY:"));      
         j.setval(name,code,city,salary);
         j.hrao();
         j.dao();
         j.tao();
         j.gso();
         j.pfo();
         j.nso();
         System.out.println("OFFICER:");
         j.display();
               
       name=(JOptionPane.showInputDialog("Enter NAME:"));                  
       code=Integer.parseInt(JOptionPane.showInputDialog("Enter CODE:"));  
       city=(JOptionPane.showInputDialog("Enter CITY:")); 
       salary=Integer.parseInt(JOptionPane.showInputDialog("Enter SALARY:"));      
         k.setval(name,code,city,salary);
         k.hram();
         k.dam();
         k.tam();
         k.gsm();
         k.pfm();
         k.nsm();
         System.out.println("MANAGER:");
         k.display();
        
         name=(JOptionPane.showInputDialog("Enter NAME:"));                  
        code=Integer.parseInt(JOptionPane.showInputDialog("Enter CODE:"));  
        city=(JOptionPane.showInputDialog("Enter CITY:")); 
        salary=Integer.parseInt(JOptionPane.showInputDialog("Enter SALARY:"));      
         m.setval(name,code,city,salary);
         m.hras();
         m.das();
         m.tas();
         m.gss();
         m.pfs();
         m.nss();
         System.out.println("SWEEPER:");
         m.display();

     }
}