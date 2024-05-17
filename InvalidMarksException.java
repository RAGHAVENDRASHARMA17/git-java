// ERROR HANDLING 

class InvalidMarksException extends Exception 
{
     int marks;
     InvalidMarksException(int marks, String msg)
     {
        super(msg);
        this.marks = marks;
     }
      public String coString()
      {
           return("InvalidMarksException["+ marks +"] :"+getMessage());
      }
}
class MyExceptionDemo1
{
     static void dispGrade(int marks) throws InvalidMarksException
     {
           if(marks<0 || marks>100)
            throw new InvalidMarksException
            (marks,"marks should be in the range of 0 to 100");
             if(marks>=75)       System.out.println("S");
             else if(marks>=60)  System.out.println("A");
             else if(marks>=50)  System.out.println("B");
             else if(marks>=33)  System.out.println("C");
             else      System.out.println("F");


     }  
       public static void main(String args[])
         {
                try
                 {
                      int marks = Integer.parseInt(args[0]);
                       dispGrade(marks);
                 }
                 catch(InvalidMarksException e)
                  {
                      System.out.println(e);
                  }
         }
}