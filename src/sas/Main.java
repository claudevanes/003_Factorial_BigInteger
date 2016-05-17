/*
 * Thought: Compute factorial, but you must use class BigInteger.
 * **/
package sas;

import java.util.logging.Logger;
import ses.*;

public class Main {

	public Main() {
	}

	public final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		LOGGER.info("");
		System.out.println("003: Print factorial. ");

		PrintFactorial.printFactorial();
	}

}
