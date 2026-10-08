import  java.util.Scanner;
public class Exp_1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        marks = marks/10;
        switch(marks){
            case 0, 1, 2, 3:
                System.out.println("Fail");
                break;
            case 4:
                System.out.println("Pass");
                break;
            case 5:
                System.out.println("2nd Class");
                break;
            case 6:
                System.out.println("1st Class");
                break;
            case 7, 8, 9, 10:
                System.out.println("Distinction");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}