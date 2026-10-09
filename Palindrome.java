import java.util.*;
class Palindrome{
  public static void main(String[] args){
    String s=new Scanner(System.in).next();
    StringBuffer sb=new StringBuffer(s);
    System.out.println(s.equals(sb.reverse().toString())?"Palindrome":"NotPalindrome");
  }
}
