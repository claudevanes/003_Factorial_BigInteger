package ses;

import java.math.BigInteger;

public class PrintFactorial {

	public PrintFactorial() {
	}

	public static void printFactorial() {

		for (int i = 2; i <= 80; i++) {
			System.out.println(i + "!: " + factorial(i) + ", ");
		}

	}

	private static BigInteger factorial(int l) {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 2; i <= l; i++)
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}

}