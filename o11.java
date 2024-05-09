// Enter 2 matrix and print its multiplication in 3rd array:
// USING CONSTRUCTOR parameterized  AND OBJECT AS RETURN FUNCTION and function argument:

import javax.swing.JOptionPane;
class matrix
{
   int i,j;
   int m[][]=new int [3][3]; 
        matrix(int mr[][])
        {  
           for(i=0;i<3;i++)
           {
              for(j=0;j<3;j++)
               {
                  m[i][j]=mr[i][j];
               } 
           }
        }
        
           void display()
         {
             for(i=0;i<3;i++)
              {
                 for(j=0;j<3;j++)
                  {
                     System.out.print(m[i][j]+"");
                  }
                     System.out.println();
              }
         }

};

class o11
{
      static matrix getmulti(matrix m1,matrix m2)
         {
              matrix c=new matrix(new int[3][3]);
              int i,j,k;
              for(i=0;i<3;i++)
               {
                  for(j=0;j<3;j++)
                    {
                       c.m[i][j]=0;
                        for(k=0;k<3;k++)  
                        {
                           c.m[i][j]=c.m[i][j]+m1.m[i][k]*m2.m[k][j];
                        }  
                    }
                }
                      return(c);
         }
       
    public static void main(String args[])
       {
          int i,j;
          int m[][]=new int[3][3];				
           matrix l,f,r;

           System.out.println("matrix 1: ");
         
         for(i=0;i<3;i++)
         {
            for(j=0;j<3;j++)
             {    
               m[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
             }
         } 
            l=new matrix(m);
            l.display();                       
            System.out.println("matrix 2: ");

            for(i=0;i<3;i++)
         {   
             for(j=0;j<3;j++)
             {
                m[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
             }
         } 
                          
          f=new matrix(m);              
          f.display();
          r=getmulti(l,f);
          System.out.println("multiply matrix : ");
          r.display();  
      }
}
 
