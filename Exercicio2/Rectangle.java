package Exercicio2;

public class Rectangle {

    double width;
    double height;

    Double area() {

		double area = width * height;
		
        return area;
    }

    Double perimeter() {
        double perimeter = (width + height)*2;

        return perimeter;
    }

    Double diagonal() {
		double diagonal = Math.sqrt((width * width) + ( height * height));

        return diagonal;
    }
}