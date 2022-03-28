package predavanje04;

import java.util.*;
import java.io.*;

/**
 * Prebere datoteko s podatki o tečaju bitcoina in izpiše minimalni in maksimalni tečaj.
 * @author tomaz
 */
public class Bitkojn {
  
  public static void main(String[] args) throws Exception {
    // od tu naprej bo program deloval v "angleškem načinu"
    // (na primer: decimalna pika namesto vejice)
    Locale.setDefault(Locale.ENGLISH); 
    // za ponoven preklop v "slovenski način" uporabi:
    // Locale.setDefault(new Locale("sl","SI")); 
    
    double min=Double.MAX_VALUE;
    double max=Double.MIN_VALUE;
    String minD="", maxD="";
    
    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));
    while (sc.hasNext()) {
      String datum = sc.next();
      double vrednost = sc.nextDouble();
      
      if (vrednost < min) {
        min = vrednost;
        minD = datum;
      }
      if (vrednost > max) {
        max = vrednost;
        maxD = datum;
      }      
      System.out.println(vrednost);
    }
    sc.close();
    
    System.out.printf("Najmanjša vrednost: %.2f (%s)\n", min, minD);
    System.out.printf("Največja  vrednost: %.2f (%s)\n", max, maxD);
  }

}
