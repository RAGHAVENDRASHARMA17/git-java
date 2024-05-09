// Exception handling example 
class a101
{
   public static void main(String args[])
    {
      int d=0;
	try
	{
        int a=42/d;
        System.out.println("this will not be printed");
	}
	catch(Exception e)
	{
	System.out.println("aap number ko zero se divide kar rahe hain");
	}

    }
}