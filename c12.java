//CLASSES WITH OBJECT:   of 5 employee
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
                  System.out.print(""+name);
                  System.out.print("\t"+code);
                  System.out.print("\t"+salary);
                  System.out.print("\t"+hra);
                  System.out.print("\t"+da);
                  System.out.print("\t"+ta);                  
                  System.out.print("\t"+gs);
                  System.out.print("\t"+pf);
                  System.out.println("\t"+ns);   
              }
}
    class c12
{
 public static void main(String args[])
      {
         double code,salary;
         String name;
          int i,j;
          employee t;
        employee k[]=new employee[5];
         for(i=0;i<5;i++)
         {
           name = (JOptionPane.showInputDialog("Enter Name:"));
           code= Double.parseDouble(JOptionPane.showInputDialog("Enter code:"));
           salary= Double.parseDouble(JOptionPane.showInputDialog("Enter salary:"));

        k[i]=new employee();
        k[i].setval(name,code,salary);
        k[i].v1();
        k[i].v2();   
        k[i].v3();
        k[i].v4(); 
        k[i].v5();  
        k[i].v6(); 
      }          
               System.out.println("BEFORE SORTING");
               System.out.println("=====================Tabel Form====================================");
               System.out.println("NAME  |  CODE  |  SALARY  |  HRA  |  DA  |  TA  |  GS  |  PF  |  NS");
               System.out.println("-------------------------------------------------------------------");

        for(i=0;i<5;i++)
         {
            k[i].display();
         }             

            for (i=0;i<5-1; i++) 
              {
                 for (j = 0;j<(5-i) - 1;j++) 
                   {
                      if (k[j].salary<k[j+1].salary) 
                         {
                            t= k[j];
                            k[j]=k[j+1];
                            k[j+1] = t;
                          }
            
                   }
             }
                 
               System.out.println("AFTER SORTING");
               System.out.println("=====================Tabel Form====================================");
               System.out.println("NAME  |  CODE  |  SALARY  |  HRA  |  DA  |  TA  |  GS  |  PF  |  NS");
               System.out.println("-------------------------------------------------------------------");

        for(i=0;i<5;i++)
         {
            k[i].display();
         }             
      }
}
