// EXTENDING AN INTERFACE

interface A
{
     void m1();
     void m2();
}

  interface B extends A // interface can be extended
  {
      void m3();
  }
 
class MyClass implements B
{
     public void m1()
     {
         System.out.println("m1");
     }

     public void m2()
     {
         System.out.println("m2");          
     }
  
     public void m3()
     {
         System.out.println("m3");          
     }    
}

class Demo2
{
   public static void main(String args[])
   {
           MyClass ob=new MyClass();
           ob.m1();
           ob.m2();
           ob.m3();
   }
}