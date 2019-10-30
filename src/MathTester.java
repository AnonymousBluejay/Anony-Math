import java.util.Random;

import net.passerines.gui.SimpleInterface;
import net.passerines.math.*;

public class MathTester {
	
	public static void main(String[] args) {
		//System.out.println(Factorial.get(20));
		//System.out.println(Combination.get(20, 10));
		/*long[] coefficients = BinomialExpander.getCoefficients(2, 1, 5);
		for(int i=0; i<coefficients.length; i++) {
			System.out.print(coefficients[i] + " ");
		}*/
		for(int i=1; i<20; i++) {
			System.out.println("(x+y)^" + i + " is " + BinomialExpander.getSimpleExpansion(1, 1, i));
		}
		System.out.println();
		System.out.println("A few random problems");
		System.out.println(BinomialExpander.getSimpleExpansion(1, 9, 2));
		System.out.println(BinomialExpander.getSimpleExpansion(2, 3, 9));
		System.out.println(BinomialExpander.getSimpleExpansion(5, 3, 4));
		System.out.println(BinomialExpander.getSimpleExpansion(5, 7, 5));
		System.out.println(BinomialExpander.getSimpleExpansion(6, 2, 8));
	}
}
