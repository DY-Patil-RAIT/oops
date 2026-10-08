import java.util.Scanner;

class Student {
    protected int rollNo;

    void getnumber(Scanner input) {
        System.out.print("Enter roll number: ");
        rollNo = input.nextInt();
    }

    void putnumber() {
        System.out.println("Roll number: " + rollNo);
    }
}

class Test extends Student {
    protected float sem1;
    protected float sem2;

    void getmarks(Scanner input) {
        System.out.print("Enter semester 1 marks: ");
        sem1 = input.nextFloat();
        System.out.print("Enter semester 2 marks: ");
        sem2 = input.nextFloat();
    }

    void putmarks() {
        System.out.println("Semester 1 marks: " + sem1);
        System.out.println("Semester 2 marks: " + sem2);
    }
}
interface Sports {
    float GRACE_MARKS = 55.0f;

    void putscore();
}

class Result extends Test implements Sports {
    private float total;

    @Override
    public void putscore() {
        System.out.println("Sports grace marks: " + GRACE_MARKS);
    }

    void display() {
        total = sem1 + sem2 + GRACE_MARKS;

        Student studentReference = this;
        Sports sportsReference = this;

        studentReference.putnumber();
        putmarks();
        sportsReference.putscore();
        System.out.println("Total: " + total);
    }
}

class Hybrid {
    static void run() {
        try (Scanner input = new Scanner(System.in)) {
            Result result = new Result();
            result.getnumber(input);
            result.getmarks(input);
            result.display();
        }
    }
}

public class Exp_9 {
    public static void main(String[] args) {
        Hybrid.run();
    }
}
