// enter matrix and print it's colom and row

import java.io.*;
class m4
{
      public static void main(String args[]) throws IOException
      {
            int i,j;
            int row,col,sum=0;
	    int a[][]=new int[3][3];
            String k;
         DataInputStream in=new DataInputStream(System.in);     
         System.out.println("enter matrix 1:");
           for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                 {
                    k=in.readLine(); 
                    a[i][j]=Integer.parseInt(k);
                 } 
            }   
                 for(i=0;i<=2;i++)
                  {
                     for(j=0;j<=2;j++)
                      {
                       System.out.print(a[i][j]+"  ");
                      } 
                         System.out.println();
                  }  
              System.out.println("sum of each colom:\n");
               for(col=0;col<=2;col++)
                {
                       sum=0;
                    for(row=0;row<=2;row++)
                     {   
                        sum+=a[row][col];                                       
                     }
                    System.out.println(+sum);
                } 
                  System.out.println("sum of each row:\n");
                  for(row=0;row<=2;row++)
                  {
                      sum=0;
                     for(col=0;col<=2;col++)
                      {   
                        sum+=a[row][col];                                       
                      }
                     System.out.println(+sum);
                  } 
      }
}