package basics;

abstract class Shape {
    String colour;
    int area;

    String setShape(String newColour) {
        this.colour = newColour;
        return this.colour;
    }

    abstract void calcArea();
}

class Rectangle extends Shape {
    int length;
    int breadth;
    int height;

    Rectangle(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    
    void calcArea() {
        this.area = length * breadth * height;
        System.out.println("Rectangle area: " + area + " (Color: " + colour + ")");
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    
    void calcArea() {
        this.area = (int) (Math.PI * radius * radius);
        System.out.println("Circle area: " + area + " (Color: " + colour + ")");
    }
}

public class Transportation {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(10, 3, 14);
        rectangle.setShape("Pink");
        rectangle.calcArea();

        Circle circle = new Circle(8);
        circle.setShape("Red");
        circle.calcArea(); 
    }
}
