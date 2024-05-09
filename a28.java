// enter 10 value in  array and insert the value in certain position
import java.io.*;
class a28
{
       public static void main(String args[]) throws IOException
      {
            int i,p=0,v=0;
	    int a[]=new int[11];
            String k;
         DataInputStream in=new DataInputStream(System.in);     
         System.out.println("enter 10 value:");
          for(i=0;i<10;i++)
            {
               k=in.readLine(); 
               a[i]=Integer.parseInt(k);
            } 
               System.out.println("\n array position:");
               k=in.readLine(); 
               p=Integer.parseInt(k);
               p--;   

               System.out.println("\n array value:");
               k=in.readLine(); 
               v=Integer.parseInt(k);
               
              for(i=9;i>=p;i--)
               {
                 a[i+1]=a[i];
               }   
                a[p]=v;             
               for(i=0;i<=10;i++)
                {
                   System.out.println(+a[i]);           
                } 
      }
}