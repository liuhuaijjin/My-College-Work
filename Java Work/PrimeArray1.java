public class PrimeArray1
{
  public static void main(String [] args)
  {
     int primes [] = new int [1000000];
     primes[0]=2;
     primes[1]=3;
     primes[2]=5;
     primes[3]=7;
     int i=4,number=9;
     for(;;number+=2)
    { if(isPrime(number))
     {
        primes[i]=number;
        i++;
       if(i==primes.length)
       break;
      }
}
     for(int j=0;j<primes.length;j++)
     System.out.println(primes[j]);
    }
  
   public static boolean isPrime(int n)
   {
     for(int divisor=3;divisor*divisor<=n;divisor+=2)
     if(n%divisor==0)
     return false;
     return true;
   }
}
