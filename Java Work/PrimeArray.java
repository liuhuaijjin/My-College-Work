public class PrimeArray
{
	public static void main (String [] args)
	{
		int primes [] = new int [78498];
		primes [0] = 2;
		primes [1] = 3;
		primes [2] = 5;
		primes [3] = 7;
		int i = 4, number = 9, count = 0;
		int q2 = 0, q31 = 0, q32 = 0, q41 = 0, q43 = 0, q45 = 0, q47 = 0, q5 = 0, q6 = 0, s = 0, p = 1; 
		for (; number <= 1000000 ; number += 2)
			if (isPrime (number))
			{
				primes [i ++] = number;
				q2 += isKSquare(number);
				q31 += isFourK(number);
				q32 += isFourKThree(number);
				q41 += isEndOne(number);
				q43 += isEndThree(number);
				q45 += isEndFive(number);
				q47 += isEndSeven(number);
				s += number;
				if(isPrime(s))
					q5 ++;
				p *= number;
				if(isPrime(p))
					q6 ++;
				count++;
			}
		for (int j = 0; j < 78498/*primes.length*/; j ++)
				System.out.println (primes [j]);
		/*System.out.println("k*k+1: " + q2);
		System.out.println("4*k+1: " + q31);
		System.out.println("4*k+3: " + q32);
		System.out.println("Ending With 1: " + q41);
		System.out.println("Ending With 3: " + q43);
		System.out.println("Ending With 5: " + q45);
		System.out.println("Ending With 7: " + q47);
		System.out.println("Sum: " + q5);
		System.out.println("Product: " + q6);*/
	}
	public static boolean isPrime (int n)
	{
		for (int divisor = 3; divisor * divisor <= n ; divisor += 2)
			if (n % divisor == 0)
				return false;
		return true;
	}
	public static int isKSquare(int n)
	{
		for(int i = 2; i * i <= n; i += 2)
			if(i * i == n - 1)
				return 1;
		return 0;
	}
	public static int isFourK(int n)
	{
		if((n - 1) % 4 == 0)
			return 1;
		return 0;
	}
	public static int isFourKThree(int n)
	{
		if((n - 3) % 4 == 0)
			return 1;
		return 0;
	}
	public static int isEndOne(int n)
	{
		if(n % 10 == 1)
			return 1;
		return 0;
	}
	public static int isEndThree(int n)
	{
		if(n % 10 == 3)
			return 1;
		return 0;
	}
	public static int isEndFive(int n)
	{
		if(n % 10 == 5)
			return 1;
		return 0;
	}
	public static int isEndSeven(int n)
	{
		if(n % 10 == 7)
			return 1;
		return 0;
	}
}
