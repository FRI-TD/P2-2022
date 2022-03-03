package predavanje03;

import java.util.Scanner;
import java.io.File;

/**
 * Branje podatkov iz datoteke.
 * 
 * @author tomaz
 */
public class Osebe {
  
  public static void main(String[] args) throws Exception {
    // "bralnik" povežem z datoteko ...
    Scanner sc = new Scanner(new File("viri/osebe.txt"));
          
    // ... nato se "sprehodim" po datoteki, dokler so v njej še podatki (sc.hasNextLine())
    while(sc.hasNextLine()) {
      // vrstico preberem ...
      String vrstica = sc.nextLine();
      // ... in jo izpišem
      System.out.println(vrstica);
    }
    
    sc.close();
  }

}
