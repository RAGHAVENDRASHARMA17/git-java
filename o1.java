// Enter 10 Value in ARRAY and Print it's sum:
// OBJECT AS FUNCTION ARGUEMENT

import javax.swing.JOptionPane;
class array
{  
  int a[]=new int[10];
   int sum,i;  
  void setval(int ar[])
        { 
            for(i=0;i<10;i++)
             {
                  a[i]=ar[i];
             }
        }
            void display()
              {  
                  for(i=0;i<10;i++)
                   {
                     System.out.println(""+a[i]);
                   }
                  
              }
 };
         
 class o1
{
       static  void getsum(array m)
                {
                 int  sum=0;
                  int a[]=new int[10];
                  for(int i=0;i<10;i++)
                   {
                    sum=sum+m.a[i];
                   } 
                  System.out.println("sum = "+sum);
                }
 public static void main(String args[])
      {
          int i,sum;
          int a[]=new int[10];
           array k=new array();
         for(i=0;i<10;i++)
         {
           a[i]= Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
         } 
                          
          k.setval(a);
          k.display();
          o1.getsum(k);  
     
      }
}
