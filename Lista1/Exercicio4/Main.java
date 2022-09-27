package Exercicio4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int nShapes = sc.nextInt();
        ArrayList<Shape> shapes = new ArrayList<>();
        int i = 1;

        while(i <= nShapes){

            System.out.printf("**Shape #%d data:**\n", i );
            System.out.print("Rectangle or Circle (r/c)? ");
            sc.nextLine(); 
            String shape = sc.nextLine();
            System.out.print("Color (RED/BLACK/BLUE)? ");
            String nColor = sc.nextLine();
            Color color = Color.valueOf(nColor);

            if(shape.equals("r")) {
                
                System.out.println("Width: ");
                double width = sc.nextDouble();
                
                System.out.println("Height: ");
                double height = sc.nextDouble();

                Rectangle rect = new Rectangle(color, width, height);

                shapes.add(rect);
            } 

            else if (shape.equals("c")){
                

                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                
                Circle circ = new Circle(color, radius);

                shapes.add(circ);
            } 

            i = i + 1;

        }

        System.out.println("SHAPE AREAS:\n");
        for(Shape sh : shapes) {
            System.out.println(sh.area());
        }
        
        sc.close(); 
    }
}
