import java.util.*;
class AddComplex{
  int r,i;
  AddComplex (int r,int i){this.r=r;this.i=i;}
  AddComplex (int r){this(r,0);}
  AddComplex add(AddComplex c){return new AddComplex(r+c.r,i+c.i);}
  public static void main(String[] args){
    int a=new Scanner(System.in).nextInt();
    int b=new Scanner(System.in).nextInt();
    int c=new Scanner(System.in).nextInt();
    int d=new Scanner(System.in).nextInt();
    AddComplex e=new AddComplex(a,b), f=new AddComplex(c,d);
    AddComplex g=e.add(f);
    System.out.println(g.r+"+"+g.i+"i");
  }
}
