package net.passerines.math;

public class Combination {

	/*
	 * Takes integers n and r, returns nCr
	 */
	public static long get(int n, int r) {
		return Factorial.get(n) / (Factorial.get(r) * Factorial.get(n-r));
	}
}
