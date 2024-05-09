import java.io.*;
class a11
{
       public static void main(String args[]) throws IOException
       {
             double r,a;
             String k;
             DataInputStream in=new DataInputStream(System.in);
             System.out.println("enter radius:");   
             k=in.readLine();
             r=Integer.parseInt(k); 
             a=3.14*r*r;
             System.out.println("area of circle: "+a);

         }
}















