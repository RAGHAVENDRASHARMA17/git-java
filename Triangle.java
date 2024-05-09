// INTERFACE Example 
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