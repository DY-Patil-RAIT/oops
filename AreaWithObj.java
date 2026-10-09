import java.util.*;
class AreaWithObj{
  int a(int l,int b){return l*b;}
  int a(int s){return s*s;}
  public static void main(String[] args){
    AreaWithObj b=new AreaWithObj();
    int cl=new Scanner(System.in).nextInt();
    int cb=new Scanner(System.in).nextInt();
    int cs=new Scanner(System.in).nextInt();
    System.out.println(b.a(cl,cb));
    System.out.println(b.a(cs));
  }
}
