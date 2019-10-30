package net.passerines.math;

public class Permutation {

	public static long get(int n, int r) {
		return Factorial.get(n) * Factorial.get(n-r);
	}
}
