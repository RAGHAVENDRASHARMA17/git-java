// enter name,roll,five subject marks and percentage and division:
import java.io.*;
class a15
{
       public static void main(String args[]) throws IOException
       { 
          int n,v1,v2,v3,v4,v5,p,d,t,r;
          String k;
          DataInputStream in=new DataInputStream(System.in);
          System.out.println("enter name:");   
          k=in.readLine(); 
          System.out.println("enter roll number:");   
          k=in.readLine(); 
          System.out.println("english:");   
          k=in.readLine();
          v1=Integer.parseInt(k); 
          System.out.println("hindi:");   
          k=in.readLine();
          v2=Integer.parseInt(k); 
          System.out.println("maths:");   
          k=in.readLine();
          v3=Integer.parseInt(k);
          System.out.println("science:");   
          k=in.readLine();
          v4=Integer.parseInt(k);
          System.out.println("social science:");   
          k=in.readLine();
          v5=Integer.parseInt(k);   
          t=v1+v2+v3+v4+v5;
          System.out.println("total marks:"+t);
          p=t/5;
          System.out.println("percentage:"+p);
          if(p>=60)
          {
             System.out.println("first");            
          }   
            else if(p>=45)
            {
               System.out.println("second");
            }
            else if(p>=30)
            {
               System.out.println("third");   
            }
             else
            {
                 System.out.println("fail");   
            }
       }
}



/* while loop
1 to 10
15 to 1
table of 9
factorial of x
enter 10 values and print theoir sum */
