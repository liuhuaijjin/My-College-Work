import java.math.*;
import java.util.Scanner;
public class BigIntProg
{


public static void main(String[] args)
{

BigInteger bi1;

Scanner s=new Scanner(System.in);
System.out.println("\n Enter a number");
int n =s.nextInt();

 String fact = factorial(n);

 System.out.println("Factorial is " + fact);
 int zeros=trailing_zero(n);
 System.out.println("Sum is"+zeros);
   }

   public static String factorial(int n)
    {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++)
       {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }

 
   public static int trailing_zero(int num)
    {   int arr[]=new int[10];
  int j=0;
        int base=5,sum=0;
        for(int i=1;(Math.pow(base,i))<=num;i++)
        {  
            int new_base=(int)Math.pow(base,i);
           
             arr[j++]=num/new_base;
        }
        for( int k : arr)
            {
        sum += k;
            }
        return sum;


    }
           
}
