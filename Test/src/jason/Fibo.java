package jason;

public class Fibo {
	public static void main(String arg[]) {
		long n = 100;
		System.out.println(fibc(n));
		
	}

	public static long fibonacci(long n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;

		long n1 = 1;
		long m = 1;
		long result = 0;
		for (long i = 0; i < n - 2; i++) {
			result = n1 + m;
			n1 = m;
			m = result;
		}
		return result;
	}

	private static long fibc(long n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		return fibc(n - 1) + fibc(n - 2);
	}
	
	 
}
