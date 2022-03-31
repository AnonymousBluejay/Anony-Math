package net.passerines.math;

import net.passerines.util.Formatter;
import net.passerines.util.Variable;

public class Binomial {

	private double a;
	private double b;
	private int n;
	private Variable var1;
	private Variable var2;
	
	public Binomial(double a, String char1, double pow1, double b, String char2, double pow2, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
		var1 = new Variable(char1, pow1);
		var2 = new Variable(char2, pow2);
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public int getN() {
		return n;
	}
	public Variable getVar1() {
		return var1;
	}
	public Variable getVar2() {
		return var2;
	}
	
	@Override
	public String toString() {
		String result = "(";
		if(a!=1) result += a;
		result += var1;
		if(b>=0) result += "+";
		if(b!=1) result += b;
		result += var2 + ")^" + n;
		result = Formatter.removePointZero(result);
		result = Formatter.superscript(result);
		return result;
	}
}
