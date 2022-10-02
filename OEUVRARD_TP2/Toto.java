public class Toto{
  public static void main(String[] args){

    var s1 = "toto";
    var s2 = s1;
    var s3 = new String(s1);
    
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);

    var s6 = "toto";
    var s7 = "toto";
    
    System.out.println(s6 == s7);

    var s8 = "hello";
    s8 = s8.toUpperCase();
    System.out.println(s8);
  }
}