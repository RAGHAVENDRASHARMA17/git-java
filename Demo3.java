// INTERFACE EXAMPLE

interface Shape
{
   double puCost=100;
   double area();
   double calCost(); 
}
 
class Triangle implements  Shape
{
      double s1,s2,s3;
    
     Triangle (double a, double b, double c)
      {
          s1=a;
          s2=b;
          s3=c;
      }
      
      public double calCost()
        {
           return puCost*area();
        }
 
        public double area()
         {
            double s = (s1+s2+s3)/2;
            return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
         }
}

class Rectangle implements Shape
{
    double s1,s2;
 
     Rectangle(double a, double b)
      {
             s1=a;
             s2=b;
      }
       
      public double calCost()
       {
          return puCost*area(); 
       }
 
       public double area()
        {
            return s1*s2;
        }
}

class Square implements Shape
{
       double s;

       Square(double a)
       {
             s=a;
       }

       public double calCost()
        {
             return puCost*area();
        }

        public double area()
         {
             return s*s;
         }
}

class Demo3 
{
       public static void main(String args[])
        {
             Shape s1=new Triangle(3,4,5);
             Shape s2=new Rectangle(3,4);
             Shape s3=new Square(3);

             System.out.println(s1.area());
             System.out.println(s2.area());
             System.out.println(s3.area());
             System.out.println(s1.calCost());
             System.out.println(s2.calCost());
             System.out.println(s3.calCost());
        }
}