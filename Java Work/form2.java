public class form2
{
  
  public static void main(String [] args)
  {

    int count=2;int k;
    for(k=3;((4*k)+3)<1000000;k++)
    {
     if(isPrime((4*k)+3));
     {
      count++;
     }
    }
     System.out.println(count);
    
     
  }
  
   public static boolean isPrime(int n)
   {
     for(int divisor=3;divisor*divisor<=n;divisor+=2)
     if(n%divisor==0)
     return false;
     return true;
   }
  
 } 
