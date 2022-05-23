package predavanje12;

import java.io.*;

/**
 * Iz razredne zbirke (class datoteka) preberem podatek o verziji jave, 
 * s katero je bila zbirka ustvarjeva. Za podatke o razredni zbirke glej 
 * https://en.wikipedia.org/wiki/Java_class_file
 * 
 * @author tomaz
 */
public class JavaVersion {
  
  public static void main(String[] args) {
    // args = new String[]{"build/classes/Liki.class"};
   
    File f = new File(args[0]);
    try (
      FileInputStream fis = new FileInputStream(f);
      BufferedInputStream bis = new BufferedInputStream(fis);
      DataInputStream dis = new DataInputStream(bis);
    ) {
    
      // preskočim prvih 6 bajtov (ker teh informacij ne potrebujem) ...
      dis.skipBytes(6);
      // .. in preberem naslednji podatek (ki je v datoteki zapisan v 4
      //    obliki števila tipa short (dva bajta).
      short v = dis.readShort();
      System.out.println("Verzija: " + v);
            
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }

}
