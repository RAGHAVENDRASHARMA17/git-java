/* enter name,code salary of employe:
HRA=10% of salary
DA=12% of salary
TA=5% of salarry 
GS=SALARY+HRA+DA+TA
PF=11% of salary
NS=GS-PF*/

import javax.swing.JOptionPane;
class employee
{  
  double code,hra,da,ta,gs,pf,ns,salary;
   String name;
   
  void setval(String n,double c,double s)
        { 
            name=n;
            code=c;
            salary=s; 
        }
 
      void v1()
      {
        hra=0.10*salary;
      } 
       void v2()
       {
          da=0.12*salary;
       } 
       void v3()
       {
          ta=0.5*salary;         
       }
        void v4()
       {
         gs=salary+hra+da+ta;  
       }
       void v5()
       {
         pf=0.11*salary;  
       }
       void v6()
       {
         ns=gs-pf;  
       }
              void display()
              {
                  System.out.println("name :"+name);
                  System.out.println("code : "+code);
                  System.out.println("salary : "+salary);
                  System.out.println("HRA : "+hra);
                  System.out.println("DA :"+da);
                  System.out.println("TA :"+ta);                  
                  System.out.println("GS :"+gs);
                  System.out.println("PF :"+pf);
                  System.out.println("NS :"+ns);   
              }
}
    class c6
{
 public static void main(String args[])
      {
         double code,salary;
         String name;
        
       name = (JOptionPane.showInputDialog("Enter Name:"));
       code= Double.parseDouble(JOptionPane.showInputDialog("Enter code:"));
       salary= Double.parseDouble(JOptionPane.showInputDialog("Enter salary:"));

       employee k=new employee();
        k.setval(name,code,salary);
        k.v1();
        k.v2();   
        k.v3();
        k.v4(); 
        k.v5();  
        k.v6(); 
        k.display();             
      }
}
