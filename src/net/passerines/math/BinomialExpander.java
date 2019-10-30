package net.passerines.math;

import net.passerines.math.Combination;
import net.passerines.util.Formatter;

public class BinomialExpander {

	/*
	 * Takes in a binomial in the form of (ax+by)^n
	 * and returns an array of size n+1 with the coefficients
	 * of the expanded binomial in order from a^n to b^n
	 */
	public static long[] getCoefficients(int a, int b, int n) {
		long[] coefficients = new long[n+1];
		for(int k=0; k<=n; k++) {
			coefficients[k] = (long) (Combination.get(n, k) * Math.pow(a, n-k) * Math.pow(b, k));
		}
		return coefficients;
	}
	
	public static String getSimpleExpansion(int a, int b, int n) {
		long[] coefficients = getCoefficients(a, b, n);
		String expansion = "";
		for(int i=0; i<coefficients.length; i++) {
			if(coefficients[i]>0 && i>0) {
				expansion += "+";
			}
			if(coefficients[i]!=1) {
				expansion += coefficients[i];
			}
			if(i==0) {
				expansion += "x^" + (n-i) + "";
			} else if(i==coefficients.length-1) {
				expansion += "y^" + i + "";
			} else {
				expansion += "x^" + (n-i) + "y^" + i + "";
			}
		}
		//expansion = Formatter.superscript(expansion); //Some superscript just don't display right in the console
		return expansion;
	}
	
}
