import java.util.Scanner;

class Shapes {
    public double area(int side) {
        return side * side;
    }

    public double area(int length, int breadth) {
        return length * breadth;
    }

    public double area(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Exp_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Shapes shapes = new Shapes();

        System.out.println("--- Square ---");
        System.out.print("Enter the side of the square: ");
        int side = scanner.nextInt();
        System.out.println("Area of Square: " + shapes.area(side));

        System.out.println("\n--- Rectangle ---");
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        System.out.println("Area of Rectangle: " + shapes.area(length, breadth));

        System.out.println("\n--- Triangle ---");
        System.out.print("Enter side 1 of the triangle: ");
        int a = scanner.nextInt();
        System.out.print("Enter side 2 of the triangle: ");
        int b = scanner.nextInt();
        System.out.print("Enter side 3 of the triangle: ");
        int c = scanner.nextInt();
        System.out.println("Area of Triangle: " + shapes.area(a, b, c));

        scanner.close();
    }
}
