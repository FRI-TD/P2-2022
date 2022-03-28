package si.fri.kodiranje.io;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Razred, ki vsebuje metode za delo z datotekami - branje vsebine datoteke in
 * zapisovanje vsebine v datoteko. Metode uporabljamo v razredu 
 * si.fri.kodiranje.main.Kodiranje. Ker razreda BeriPisi in Kodiranje nista
 * v istem paketu, morajo biti metode deklarirane kot "public".
 * 
 * @author tomaz
 */
public class BeriPisi {
  
  /**
   * Prebere in vrne vsebino datoteke. 
   * @param imeDatoteke ime datoteke
   * @return vsebina datoteke
   */
  public static String preberiDatoteko(String imeDatoteke) {
    String vsebina="";  
    
    // Koncept try-catch (uporabljamo namesto dodatka "throws Exception" v glavi metode)
    // V try {} blok zapremo kodo, v kateri lahko pride do izjeme.
    // Blok catch {} se bo izvršil le v primeru, da bo do izjeme zares prišlo.
    try {
      Scanner sc = new Scanner(new File(imeDatoteke));
      
      while (sc.hasNextLine())
        vsebina += (vsebina.isEmpty() ? "" : "\n") + sc.nextLine();
      
      sc.close();
    } catch (Exception e) {
      // catch blok se izvri samo v primeru, da je v try bloku prišlo do napake
      System.out.println("Napaka pri branju datoteke!");
    } 
    
    return vsebina;
  }
  
  /**
   * Vsebino zapise v datoteko.
   * @param imeDatoteke ime datoteke
   */
  public static void zapisiDatoteko(String imeDatoteke, String vsebina) {
    try {
      PrintWriter pw = new PrintWriter(imeDatoteke);
      pw.print(vsebina); 
      pw.close();
    } catch (Exception e) {
      System.out.println("Napaka pri pisanju!");
    }
  }
  
}
