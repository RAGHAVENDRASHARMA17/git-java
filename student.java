import javax.swing.JOptionPane;

class InvalidNameException extends Exception
{
   public InvalidNameException(String message)
  {
    super(message); 
  }
}
 class student
  {
      public static void main(String args[])
       {
            String name;
             name=(JOptionPane.showInputDialog("ENTER NAME : "));
             System.out.println(name);
             try
             {
                 if(name.length()<=5)
                 throw new InvalidNameException("Name galat hAI");
                  
              }
                 catch(InvalidNameException e)
                  {
                         System.out.println(e);
                  }
        }
               
    }