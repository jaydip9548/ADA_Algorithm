import java.util.*;

public class Factorial {
	static long factorial(long n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		long i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);

		long end = System.currentTimeMillis();
		System.out.println("Total Time :" + (end - start)/1000 + " Sec");

	}

}




//public class Factorial {
//	// Returns Factorial of N
//	static BigInteger factorial(int N) {
//
//		BigInteger f = new BigInteger("1");
//
//		// Multiply f with 2, 3, ...N
//		for (int i = 2; i <= N; i++)
//			f = f.multiply(BigInteger.valueOf(i));
//
//		return f;
//	}
//
//	public static void main(String args[]) throws Exception {
//		long start = System.currentTimeMillis();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number :");
//		int n = sc.nextInt();
//		System.out.println("The Factorial is : " + factorial(n));
//
//		long end = System.currentTimeMillis();
//
//		System.out.println("Total time " + (end - start)/1000 + " Sec");
//
//	}
//}
