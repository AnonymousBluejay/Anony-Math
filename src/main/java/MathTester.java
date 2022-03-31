
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.passerines.math.*;
import net.passerines.tests.FeedCalculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MathTester {
	
	public static void main(String[] args) {
		//System.out.println(Factorial.get(20));
		//System.out.println(Combination.get(20, 10));
		/*long[] coefficients = BinomialExpander.getCoefficients(2, 1, 5);
		for(int i=0; i<coefficients.length; i++) {
			System.out.print(coefficients[i] + " ");
		}*/
		/*for(int i=1; i<20; i++) {
			System.out.println("(x+y)^" + i + " is " + BinomialExpander.getSimpleExpansion(1, 1, i));
		}*/
		
		/*Variable x3 = new Variable("x", 3);
		Variable y2 = new Variable("y", 2.5);
		Variable z0 = new Variable("z", 0);
		Variable yeeet = new Variable("Yeeet", 1);
		System.out.println(x3);
		System.out.println(y2);
		System.out.println(z0);
		System.out.println(yeeet);*/
		
		//Find the constant terms
		//Exercise 7C a) Answer: 96096
		/*
		Binomial a = new Binomial(1.0, "x", 1.0, 2.0, "x", -2.0, 15);
		System.out.println("Expanding: " + a);
		System.out.println(BinomialExpander.expand(a));
		
		//Exercise 7C b) Answer: -2268
		Binomial b = new Binomial(1.0, "x", 1.0, -3.0, "x", -2.0, 9);
		System.out.println("Expanding: " + b);
		System.out.println(BinomialExpander.expand(b));
		*/
		
		/*Binomial c = new Binomial(3.0, "x", 1, -3.0, "", 1, 3);
		System.out.println("Expanding: " + c);
		System.out.println(BinomialExpander.expand(c));*/

		System.out.println("n = 6");
		ApproximateIntegral.approximate("x^4", 0, 2, 6);
		System.out.println("n = 12");
		ApproximateIntegral.approximate("x^4", 0, 2, 12);
	}
}
