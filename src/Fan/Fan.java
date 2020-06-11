package Fan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan (int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (this.on == true){
            return "Speed = " + this.speed + ", Radius = " + this.radius + ", Color = " + this.color + " fan is on";
        } else {
            return "Color = " + this.color + ", Radius = " + this.radius + " fan is off";
        }
    }

    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan fan1 = new Fan(1, true, 10, "yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(1, false, 5, "blue");
        System.out.println(fan2.toString());
        fan2.setOn(true);
        fan2.setSpeed(FAST);
        fan2.setRadius(20);
        System.out.println(fan2.toString());
    }
}

