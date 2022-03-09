import java.util.*;
public class Main
{

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter four nos. :");

    int a, b, c, d;
      a = sc.nextInt ();
      b = sc.nextInt ();
      c = sc.nextInt ();
      d = sc.nextInt ();
    if (a == b && b == c && c == d && d == a)
      System.out.println ("Equal");
    else
        System.out.println ("Not Equal");



  }
}
