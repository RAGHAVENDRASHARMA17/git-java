// interface method

interface Callback
 {
     void callback(int x);
 }
 
class Client1 implements Callback
{
         public void callback(int x)
           {
                System.out.println("client1 : "+x);
           }
}

class Client2 implements Callback
{
         public void callback(int x)
          {
                System.out.println("client2 : "+ 2*x);
          }
 
          public void m1()
           {
                  System.out.println("m1 of client2 : ");
           } 
}

class Demo1 // accessing implementation through interface
{
      public static void main(String args[])
       {
            Callback c = new Client1();
            c.callback(10);
            Callback c1 = new Client2();
            c1.callback(10); // c1.m1()
            Client2 cl2 = (Client2)c1;
            cl2.m1(); 
       }
}