package QuadraticEquation;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A");
        double a = input.nextDouble();
        System.out.println("Enter B");
        double b = input.nextDouble();
        System.out.println("Enter C");
        double c = input.nextDouble();

        QuadraticEquation Quadratic = new QuadraticEquation(a, b, c);
        System.out.println("a = " + Quadratic.getA());
        System.out.println("b = " + Quadratic.getB());
        System.out.println("c = " + Quadratic.getC());
        System.out.println("Delta = " + Quadratic.getDiscriminant());
        System.out.println("Equation " + Quadratic.getRoot());
    }
}
