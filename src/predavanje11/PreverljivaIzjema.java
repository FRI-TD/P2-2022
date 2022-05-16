package predavanje11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class PreverljivaIzjema {
  
  
  // Pravilno obravnavanje izjeme med branjem datoteke - uporaba try-catch bloka
  static String preberiDatotekoPravilno(String imeDatoteke) {
    String vsebina="";
    try (Scanner sc = new Scanner(new File(imeDatoteke));
         PrintWriter pw = new PrintWriter("b.txt");) {
      
      while (sc.hasNextLine())
        vsebina += sc.nextLine() + "\n";
      //sc.close();
    } catch (FileNotFoundException e) {
      vsebina = "?";
    }
    return vsebina;
  }
  
  // "nepriporočeno" odmetavanje izjeme (throws v glavi metode) - tega naj načeloma ne bi počneli! 
  static void preberiDatoteko(String imeDatoteke) throws Exception {
    Scanner sc = new Scanner(new File(imeDatoteke));
  }
  
  public static void main(String[] args) {
    // ker metoda preberiDatoteko() odvrze izjemo, jo moramo obravnavati tu
    // (lahko bi jo vrgli naprej, a to ni v skladu s priporočenim načinom programiranja)
    try {
      preberiDatoteko("a.txt");
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
    
    // metodo preberiDatotekoPravilno() pa lahko kličem brez bloka try-catch, saj 
    // so bile vse morebitne izjeme že obravnavane znotrj metode!
    System.out.println(preberiDatotekoPravilno("viri/drzave.txt")); 
  }

}

        
// JVM
//try {
//  main(...);
//} catch (Exception e) {
//  e.printStackTrace();
//  System.exit(1);
//}
