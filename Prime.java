class Prime{
  public static void main(String[] args){
    for(int n=2;n<=1000;n++){
      int a;
      for(a=2;a*a<=n&&n%a!=0;a++);
      if(a*a>n) System.out.println(n);
    }
  }
}
