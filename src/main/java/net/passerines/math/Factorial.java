package net.passerines.math;

public final class Factorial {
	
	/*
	 * Takes integer n, returns n!
	 * Cannot handle n > 20, overflow error will occur
	 */
	//TODO: handle negative and imaginary numbers, consider BigInteger
 	public static long get(int n) {
		long result = 1;
		while(n>0) {
			result*=n;
			n--;
		}
		return result;
	}
 	
}
