package Exercicio4;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(Color color, double width, double height) {
        super(color); 
        this.width = width;
        this.height = height;
    }
    
    public Double area() {
        return width * height;
        
    }


}
