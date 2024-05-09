// EXCEPTION HANDLING 
class ex1
{
  public static void main(String args[])
   {
         int d,a;
         
         try
         {
              d=0;
              a=42/d;
              System.out.println("this will not be printed");
         }
           catch(Exception e)
            {
               //System.out.println("my error message");  // user defined msg
		e.printStackTrace();   // full details
               //System.out.println(e);   // error message with error
               //System.out.println(e.getMessage());  // only the message
            }
              System.out.println("After Catch Statement");
   }
}