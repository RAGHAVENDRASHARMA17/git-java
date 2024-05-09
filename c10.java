import javax.swing.JOptionPane;
class count
{  
  
  int sum=0,x,perfect=0,i,v=0,prime=0,y=0,o=0,z=0,pallendrom=0,t=0,m=0,j=0,armstrong=0;
     double arm=0;
   int a[]=new int [10]; 
      
  void setval(int ar[])
        { 
          for(x=0;x<10;x++)
            {
              a[x]=ar[x];
            }
         }
          void getprime()
          {  
	     for(i=0;i<10;i++)
	       {  
                  prime=0;
                 for(j=1;j<=a[i];j++)
                   {
                     if(a[i]%j==0)
		      {
                        prime++;
		      }  
                   } 
                     if(j==2)
		      {
                         y++;     
	              }
		}
 	  } 
           void getperfect()
          {     
               for(i=0;i<10;i++)
               {    
                 sum=0;
                  for(j=1;j<a[i];j++)
                   {
                     if(a[i]%j==0)
                      {
                       sum=sum+j;
                      }      
                   }
                    if(sum==a[i])
                    {
                    perfect++;
                    }
                } 
	  }           
           void getpallendrom()
           { 
                for(i=0;i<10;i++)
                 {    
                     o = a[i];
                     z=0;          
                     while(o>0)
                      {
                         v=o%10;
                         z=z*10+v;
                         o=o/10;
                      }   
                        if(a[i]==z)
                         { 
                            pallendrom++;
                         }
                            
                  } 
          } 
              void getarmstrong()
             { 
               
                for (i=0;i<10;i++) 
                 { 
                     m=0;
                     m = a[i];
                     while (m > 0) 
                      {
                          m=m/10;
                          j++;
                      }
                         m = a[i];
                         while (m > 0) 
                          {
                            t=m%10;
                            m=m/10;
                            arm=arm+(Math.pow(t,j));
                          }
                             if (a[i]==arm) 
                              {
                                armstrong++;
                              }
                                j=0;
                               arm=0;
                  }
              
          }  
              void display()
              {
                  System.out.println("prime :"+prime);
                  System.out.println("perfect : "+perfect);
                  System.out.println("pallendrom : "+pallendrom);
                  System.out.println("armstrong : "+armstrong); 
              }
}
    class c10
{
 public static void main(String args[])
    {
          int  i;
         int a[]=new int[10];
                       
      for(i=0;i<10;i++)
      {
        a[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value:"));
      }

       count k=new count();
       k.setval(a);
        k.getprime();
        k.getperfect();  
        k.getpallendrom(); 
        k.getarmstrong();
        k.display();             
    }
}
