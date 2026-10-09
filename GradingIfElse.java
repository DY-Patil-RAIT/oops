import java.util.*;
class GradingIfElse{
  public static void main(String[] args){
    int a=new Scanner(System.in).nextInt();
    if(a<0|a<100) System.out.println("Invalid");
    else if(a<40) System.out.println("Fail");
    else if(a<50) System.out.println("Pass");
    else if(a<60) System.out.println("Second Class");
    else if(a<70) System.out.println("First Class");
    else System.out.println("Distinction");
  }
}
