// print 10 value in array and sort it in asscending order 
import java.io.*;
class a27
{
       public static void main(String args[]) throws IOException
      {
            int i,x,t=0;
	    int a[]=new int[10];
            String k;
         DataInputStream in=new DataInputStream(System.in);     
         System.out.println("enter 10 value:");
          for(i=0;i<10;i++)
            {
               k=in.readLine(); 
               a[i]=Integer.parseInt(k);
            } 
              
             for(i=0;i<10;i++)
             {
                  for(x=i+1;x<10;x++)
                  {
                      if(a[i]>a[x])
                      {
                         t=a[i];
                         a[i]=a[x];
                         a[x]=t;  
                      }            
                  }
             }
               System.out.println("sorted array\n:");
                 for(i=0;i<10;i++)
                 {
                    System.out.println(+a[i]);
                 }
      }
}