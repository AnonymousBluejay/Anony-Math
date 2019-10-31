package net.passerines.util;

public class Variable {

	private String var;
	private double pow;
	
	/*
	 * Constructors
	 */
	public Variable() {
		var = "x";
		pow = 1;
	}
	public Variable(String var) {
		this.var = var;
		pow = 1;
	}
	public Variable(String var, double pow) {
		this.var = var;
		this.pow = pow;
	}
	
	public void setName(String var) {
		this.var = var;
	}
	public void setPower(double pow) {
		this.pow = pow;
	}
	
	public String getName() {
		return var;
	}
	public double getPower() {
		return pow;
	}
	
	public void pow(int n) {
		pow *= n;
	}
	
	@Override
	public String toString() {
		if(pow>1 || pow<0) {
			return var + "^" + pow;
		} else if(pow==0) {
			return "1";
		} else if(pow==1) {
			return var;
		}
		
		return var + "^" + pow;
	}
}
