package predavanje04;

import java.io.*;
import java.util.*;

/**
 *
 * @author tomaz
 */
public class Veckratniki {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Vpiši n:");
    int n = sc.nextInt();
    System.out.print("Vpiši a:");
    int a = sc.nextInt();
    System.out.print("Vpiši b:");
    int b = sc.nextInt();
    
    // String imeDatoteke = "viri/veckratniki-" + n + "-" + a + "-" + b + ".txt";
    String imeDatoteke = String.format("viri/veckratniki-%d-%d-%d.txt",n,a,b);
    
    PrintWriter pw = new PrintWriter(new File(imeDatoteke));
    for(int i=a; i<=b; i=i+1) {
      pw.printf("%d * %d = %d\n", i, n, i*n);
    }
    pw.close();
  }
}
