public class PrimeArrays1
{
  
  public static void main(String [] args)
  {

    int count=2;int k;int d=0;
    for(k=3;k<1000;k++)
    { double x=k*k+1;
     if(isPrime(x))
     {
      count++;
      d=k;
     }
    }
     System.out.println(count);
 System.out.println(d);
    
     
  }
  
   public static boolean isPrime(double n)
   {
     for(int divisor=3;divisor*divisor<=n;divisor+=2)
     if(n%divisor==0)
     return false;
     return true;
   }
  
 } 
