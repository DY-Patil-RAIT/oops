import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void show() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    public Complex sum(Complex c1, Complex c2) {
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;
        return this;
    }

    public static Complex parseComplex(String input) {
        String s = input.replaceAll("\\s+", "");
        boolean hasI = s.endsWith("i") || s.endsWith("I");
        if (hasI) {
            s = s.substring(0, s.length() - 1);
        }
        int splitIndex = Math.max(s.lastIndexOf('+'), s.lastIndexOf('-'));
        if (splitIndex <= 0) {
            if (hasI) {
                return new Complex(0, Double.parseDouble(s));
            } else {
                return new Complex(Double.parseDouble(s), 0);
            }
        }
        double real = Double.parseDouble(s.substring(0, splitIndex));
        double imaginary = Double.parseDouble(s.substring(splitIndex));
        return new Complex(real, imaginary);
    }
}

public class Exp_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Complex Number A (e.g., 20+17i): ");
        String inputA = scanner.nextLine();
        Complex A = Complex.parseComplex(inputA);
        System.out.print("Enter Complex Number B (e.g., 20+17i): ");
        String inputB = scanner.nextLine();
        Complex B = Complex.parseComplex(inputB);
        Complex C = new Complex();
        System.out.print("\nComplex Number A: ");
        A.show();
        System.out.print("Complex Number B: ");
        B.show();
        C.sum(A, B);
        System.out.print("Sum of A and B (C): ");
        C.show();
        scanner.close();
    }
}
