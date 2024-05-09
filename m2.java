// enter 2 matrix of 3 by 3 matrix and print it's sum in third

import java.io.*;
class m2
{
       public static void main(String args[]) throws IOException
      {
            int i,j;
	    int a[][]=new int[3][3];
            int b[][]=new int[3][3];
            int sum[][]=new int[3][3];
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
                System.out.println("enter matrix 2:");
                 for(i=0;i<=2;i++)
                 {
                    for(j=0;j<=2;j++)
                    {
                     k=in.readLine(); 
                     b[i][j]=Integer.parseInt(k);
                    } 
                 }   
               System.out.println("The sumed matrix:\n");

                for(i=0;i<=2;i++)
                 {
                     for(j=0;j<=2;j++)
                      {
                          for(i=0;i<=2;i++)
                            {
                              sum[i][j]=a[i][j]+b[i][j];
                            }                      
                      }
                }
                   System.out.print("the sum:\n");
                   for(i=0;i<=2;i++)
                 {
                    for(j=0;j<=2;j++)
                     {
                       System.out.print(sum[i][j]+"  ");
                     } 
                       System.out.println();
                 } 
      }
}