package TH_OOP;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width");
        int width = input.nextInt();
        System.out.println("Enter height");
        int height = input.nextInt();

        DemoOOP run = new DemoOOP(width, height);
        System.out.println(run.display());
        System.out.println("Area");
        System.out.println(run.getArea());
        System.out.println("Perimeter");
        System.out.println(run.getPerimeter());


    }
}
