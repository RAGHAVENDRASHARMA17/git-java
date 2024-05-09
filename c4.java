// find smallest and largest with 3 value with classes method 

import javax.swing.JOptionPane;
class value
{
       
  double v1=0,v2=0,v3=0,s,l,sum=0,avg;
	void setval(double x,double y,double z)
	{
          v1=x;
          v2=y;
          v3=z;
        }
           void smallest()
         {
            s=v1;
            if(v2<s)
             {
                s=v2;   
             }
           if(v3<s)
            {
               s=v3;
            }
         }
         void largest()
        {
            l=v1;
            if(v2>l)
            {
                l=v2;
             }
               if(v3>l)
             {
                l=v3;
             }
        }
            void getsum()
           {
              sum=v1+v2+v3;
           } 
             void getavg()
           {
              avg=v1+v2+v3/3;    
           }
      void display()
       {
        System.out.println("smallest : "+s); 
        System.out.println("largest : "+l);
        System.out.println("sum : "+sum); 
        System.out.println("average : "+avg);    
       }
}

class c4
{
      public static void main(String args[])
      {
         double v1,v2,v3;
	v1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value:"));
        v2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value:"));
        v3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter value:"));
        value k=new value();
         k.setval(v1,v2,v3);
         k.getsum();
         k.getavg();   
         k.smallest();
         k.largest();
         k.display();             
      }
}