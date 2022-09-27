package Exercicio4;

public class Circle extends Shape {
    double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    public Double area() {
        return 3.14 * Math.pow(radius,2);
    }
}
