package net.passerines.math;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class ApproximateIntegral {
    public static void approximate(String function, double a, double b, int n) {
        Expression e = new ExpressionBuilder(function).variable("x").build();
        approximate(e, a, b, n);
    }
    public static void approximate(Expression expression, double a, double b, int n) {
        double trapezoid = 0;
        double midpoint = 0;
        double simpson = 0;
        double deltaX = (b-a)/n;
        for(int i = 0; i<=n; i++) {
            double x = a + deltaX * i;
            if(i==0 || i==n) {
                trapezoid += expression.setVariable("x", x).evaluate();
                if(i!=n) midpoint += expression.setVariable("x",x+deltaX/2).evaluate();
                simpson += expression.setVariable("x", x).evaluate();
            } else {
                trapezoid += 2*expression.setVariable("x", x).evaluate();
                midpoint += expression.setVariable("x",x+deltaX/2).evaluate();
                if(i%2==0) {
                    simpson += 2*expression.setVariable("x", x).evaluate();
                } else {
                    simpson += 4*expression.setVariable("x", x).evaluate();
                }
            }
        }
        trapezoid *= deltaX/2;
        midpoint *= deltaX;
        simpson	 *= deltaX/3;
        System.out.println("Trapezoid " + trapezoid);
        System.out.println("Midpoint " + midpoint);
        System.out.println("Simpson " + simpson);
    }
}
