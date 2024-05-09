// INTERFACE STACK EXAMPLE 

interface StackInterface
{
   void push(int x);
   int pop();
}
 
class Stack implements StackInterface
{
   int top = -1;
   int a[]=new int[10];
    
    public void push(int x)
     {
        if(top==9)
        {
          System.out.println("STACK FULL");
           return;
        }
         top=top+1;
         a[top]=x;
      }
      
      public int pop()
      {
         if(top==-1)
          {
            System.out.println("STACK EMPTY");
              return -1; // assuming that -1 is not a valid data
          }
            int x=a[top];
            top=top-1;
            return x;
      }
}

class Demo4
{
      public static void main(String args[])
       {
             Stack st1=new Stack();
             Stack st2=new Stack();
 
             for(int i=1;i<5;i++)
              {
                   st1.push(i);
              }
             
              for(int i=1;i<5;i++)
               {
                   st2.push(i+10);
               }
 
               for(int i=1;i<5;i++)
                 {
                    System.out.println(st1.pop());
                 }
 
                for(int i=1;i<5;i++)
                 {
                    System.out.println(st2.pop());
                 }
       }
}
