public class Rectangle {

private double width;
private double length;

private static int numberOfObjects = 0;

// no-arg constructor

public Rectangle (){
    this.width = 0.0;
    this.length = 0.0;
}

public double getWidth(){
    return width;
}

public double getLength(){
    return length;
}

//Constructor with parameter

    public Rectangle(double width, double length) {
        if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;
            numberOfObjects++;
        } else {
            System.out.println("Width and length must be positive values.");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be a positive value.");
        }
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be a positive value.");
        }
    }

    public double getArea(){

    return length * width;
    }

    public double getPerimeter(){

    return (2 * length) + (2 * width);
    }

    public static int getNumberOfObjects(){

    return numberOfObjects;
    }

    public String toString(){

    return "The width is: " + width + ", the length is: " + length + ", the area is: " +getArea() + ", and the perimeter is: " + getPerimeter();
    }


}
