// OBJECT AS RETURING FUNCTION 
// Find average of 3 value :
import javax.swing.JOptionPane;
class value
{  
    int v1,v2,v3,a;  
  void setval(int x,int y,int z)
        { 
            v1=x;
            v2=y;
            v3=z;
        }
            void display()
              {  
                 System.out.println("1st VALUE:"+v1); 
                 System.out.println("2nd VALUE:"+v2);
                 System.out.println("3rd VALUE:"+v3);                
              }
       void displayavg()
        {
            System.out.println("average : "+a); 
        }
 };
         
 class o4
{
       static  value getavg(value m)
                {
                   int a;
                   m.a=(m.v1+m.v2+m.v3)/3;
                   return(m);
                }
 public static void main(String args[])
      {
          int v1,v2,v3;
         value k=new value();
         value r=new value();
           v1= Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
           v2= Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
           v3= Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
                          
          k.setval(v1,v2,v3);
          k.display();
          r=getavg(k);
          r.displayavg();
     
      }
}
