// enter 2 matrix and print it's multiplication 

import java.io.*;
class m3
{
       public static void main(String args[]) throws IOException
      {
            int i,j,d;
	    int a[][]=new int[3][3];
            int b[][]=new int[3][3];
            int m[][]=new int[3][3];
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
            
                for(i=0;i<=2;i++)
                 {
                     for(j=0;j<=2;j++)
                      {  
                             m[i][j]=0;
                          for(d=0;d<=2;d++)
                            {
                              m[i][j]=m[i][j]+a[i][d]*b[d][j];
                            }                      
                      }
                }
                   System.out.print("the multiplication:\n");
                   for(i=0;i<=2;i++)
                 {
                    for(j=0;j<=2;j++)
                     {
                       System.out.print(m[i][j]+"  ");
                     } 
                       System.out.println();
                 } 
      }
}