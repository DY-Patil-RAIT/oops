import java.util.*;
class Multithreading{
  static int a;
  public static void main(String[] args) throws Exception{
    Thread t1=new Thread(()->a=new Scanner(System.in).nextInt());
    t1.start();t1.join();
    Thread t2=new Thread(()->System.out.println(a*a*a));
    t2.start();
  }
}
