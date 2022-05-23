package predavanje12;

import java.io.File;
import java.io.FileInputStream;

/**
 * Izpis vhodne datoteke v "hexdump" formatu.
 * 
 * @author tomaz
 */
public class HexDump {
  
  public static void main(String[] args) {
    String imeDatoteke = args[0];    
    
    File f = new File(imeDatoteke);
    int i=0;
    String desna = "";
    try {
      FileInputStream fis = new FileInputStream(f);
      // ... dokler je v datoteki še vsebina ...
      while (fis.available() > 0) {
        i++;
        // berem znak po znaku ...
        int z = fis.read(); 
        desna += (z < 32 || z > 127) ? "." : (char) z;
        // ... in izpisujem v "hex" formatu. 
        System.out.printf("%02x ", z);
        if (i==16) {
          System.out.println("  " + desna);
          i=0;
          desna = "";
        }
      }
      if (!desna.isEmpty()) {
        System.out.println("   ".repeat(16-i) + "  " + desna);
        System.out.println(desna);
      }
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }

}
