package predavanje10;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class Drzave {
  
  /**
   * Metoda prebere datoteko z opisi držav in vrne slovar objektov tipa Drzava
   * @param imeDatoteke
   * @return
   * @throws Exception 
   */
  public static HashMap<String, Drzava> preberiDrzave(String imeDatoteke) throws Exception {
    HashMap<String, Drzava> result = new HashMap<>();
    
    Scanner sc = new Scanner(new File(imeDatoteke));
    while(sc.hasNextLine()) {
      String vrstica = sc.nextLine();
      String[] deli = vrstica.split(":");
      String kratica = deli[0];
      String glMesto = deli[1];
      int prebivalci = Integer.parseInt(deli[2]);
      Drzava d = new Drzava(kratica, glMesto, prebivalci);
      result.put(kratica, d);
    }
    sc.close();
    
    return result;
  }
  
  public static void main(String[] args) throws Exception {
    HashMap<String, Drzava> drzave = preberiDrzave("viri/drzave.txt");
    
    for(String kratica : drzave.keySet()) {
      System.out.println(drzave.get(kratica)); 
    }
    
    // klicanje metod direktno na rezultatu metode get() je nevarno, saj je rezultat lahko null!
    System.out.println(drzave.get("SLO").getSteviloPrebivalcev());
    
    Drzava x = drzave.get("USA");
    if (x!=null)
      System.out.println(x.getSteviloPrebivalcev());
    else
      System.out.println("Drzave ne poznam");

  }

}
