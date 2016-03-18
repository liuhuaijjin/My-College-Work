public class KSqPlus1
{
  
  public static void main(String [] args)
  { int d=0;
     int k = 2;
    for (int n = 11; n < 1000000; n += 2)
       if (isPrime (n))
         if (isPerfectSquare (n - 1))
         {   k ++; 
            d=n;
       }
        
     System.out.println (k);  
 System.out.println (d);  
  }
  
   public static boolean isPrime(int n)
   {
     for(int divisor=3;divisor*divisor<=n;divisor+=2)
         if(n%divisor==0)
           return false;
        return true;
   }
  public static boolean isPerfectSquare (int n)
     {
          for(int divisor=2;divisor*divisor<=n;divisor+=2)
         if(divisor * divisor < n) continue;
          else if (divisor * divisor == n ) return true;
          return false;
        
     }
 } 
