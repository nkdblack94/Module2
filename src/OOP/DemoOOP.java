package OOP;

import java.awt.*;

public class DemoOOP {
    private int width;
    private int height;

    public DemoOOP () {
    }

    public DemoOOP (int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea (){
        return this.width * this.height;
    }

    public int getPerimeter (){
        return (this.width + this.height) * 2;
    }

    public String display (){
        return "Rectangle{" + "width = " + width + " height = " + height + "}";
    }
}
