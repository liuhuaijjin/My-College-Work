//program to find prime numbers less than 1000

public class PrimeNumbers
{
public static void main(String [] args)
{
int prime []=new int [100000];
prime[0]=2;
prime[1]=3;
prime[2]=5;
prime[3]=7;
int i=4, number=9, count=4;
for(;number<1000000;number+=2)
if (isPrime(number))
{
prime [i++]=number;
 count++;
}

for (int j=0;j<count;j++)
System.out.println(prime[j]);
System.out.println(count);
}
public static boolean isPrime(int n)
{
for (int diviser=3;diviser*diviser<n;diviser+=2)
if (n%diviser==0)
return false;
return true;
}


}
