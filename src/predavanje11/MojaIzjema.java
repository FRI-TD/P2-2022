package predavanje11;

import java.io.File;
import java.util.Scanner;

// Nepreverljiva izjema
class IzjemaDZN extends ArithmeticException {
  public String getMessage() {
    return "Deljenje z nič";
  }
}

// Preverljiva izjema
class IzjemaDatotekaNeObstaja extends Exception {
  public String getMessage() {
    return "Datoteka ne obstaja";
  }  
}

/**
 *
 * @author tomaz
 */
public class MojaIzjema {

  // metoda vrže nepreverljivo izjemo
  static int deli(int a, int b) throws IzjemaDZN {
    if (b != 0)
      return a/b;
    else throw new IzjemaDZN();
  }
  
  // metoda vrže preverljivo izjemo
  static void odpriDatoteko(String imeDatoteke) throws IzjemaDatotekaNeObstaja {
    try {
     Scanner sc = new Scanner(new File(imeDatoteke));
    } catch (Exception e) {
      throw new IzjemaDatotekaNeObstaja();
    }
  }
  
  public static void main(String[] args) {
    // lahko kličem brez try-catch bloka (ker je izjema nepreverljiva)
    System.out.println(deli(10, 0));
    
    // obvezna uporaba try-catch bloka, saj metoda vrže preverljivo izjemo
    try {
      odpriDatoteko("a.txt");
    } catch (IzjemaDatotekaNeObstaja e) {
      System.out.println(e);
    }
  }
  
}
