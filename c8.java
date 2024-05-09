// ARRAY USING CLASSES
// Enter 10 value in array and count : NEGATIVE,POSITIVE,EVEN,ODD and ZERO

 import javax.swing.JOptionPane;
class value
{  
   double p,n,e,o,z;
   int i;
   double a[]=new double[10]; 
      
  void setval(double ar[])
        { 
          for(i=0;i<10;i++)
            {
              a[i]=ar[i];
            }
         }

          void getpositive()
          {  
	      for(i=0;i<10;i++)
	      {   
                  if(a[i]>0)
                  {
                     p++;
                  }
	      }
 	  } 

           void getnegative()
           {
              for(i=0;i<10;i++)
              {     
                 if(a[i]<0)
		  {
                    n++;
		  }	
              }	
	   } 
	         
            void geteven()
            {
		for(i=0;i<10;i++)
	        {
 		    if(a[i]%2==0)
                    {
                        e++;
                    }
	        }      
	    }
              
               void getodd()
              {
		 for(i=0;i<10;i++)
		 {
 		     if(a[i]%2!=0)
                      {
                          o++;
                      }
		 }      
	      }   
                 void getzero()
              {
		 for(i=0;i<10;i++)
		 {
 		     if(a[i]==0)
                      {
                          z++;
                      }
		 }      
	      } 

              void display()
              {
                  System.out.println("positive :"+p);
                  System.out.println("negative : "+n);
                  System.out.println("even : "+e);
                  System.out.println("odd : "+o);
                  System.out.println("zero:"+z);             
              }
}
    class c8
{
 public static void main(String args[])
      {
          int  i;
         double a[]=new double[10];
                       
        for(i=0;i<10;i++)
        {
          a[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter value:"));
        }

       value k=new value();
       k.setval(a);
        k.getpositive();
        k.getnegative();   
        k.geteven();
        k.getodd();
        k.getzero();
        k.display();             
      }
}
