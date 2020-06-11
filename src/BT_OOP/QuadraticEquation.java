package BT_OOP;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant (){
        return (this.b * this.b) - (4 * this.a * c);
    }

    public String getRoot (){
        if (this.getDiscriminant() > 0){
            return "r1 = " + (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a)
                    + ", r2 = " + (-this.b - Math.sqrt( this.getDiscriminant())) / (2 * this.a);
        } else if (this.getDiscriminant() == 0){
            return "r1 = r2 = " + (-this.b) / (2 * this.a);
        } else {
            return "Vô nghiệm";
        }
    }
}
