//enter 10 values and print their sum 
import java.io.*;
class a20
{
       public static void main(String args[]) throws IOException
       {
              int v=1,x,sum=0;
              String k;
          DataInputStream in=new DataInputStream(System.in);     
          for(;v<=10;v++)
           {             
               k=in.readLine(); 
               x=Integer.parseInt(k);
                sum=sum+x;
            }    
             System.out.println("sum:\n"+sum);
       }
}