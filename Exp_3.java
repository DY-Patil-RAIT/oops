import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    public void getDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Exp_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter the length of the rectangle: ");
        double l = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double b = scanner.nextDouble();

        rect.getDim(l, b);
        System.out.println("Area of the Rectangle: " + rect.area());
        System.out.println("Perimeter of the Rectangle: " + rect.perimeter());
    }
}