package predavanje12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class Vreme {
  
  /**
   * Metoda "pogleda" na internet in pridobi sveže podatke o temperaturi v mestu "mesto".
   * Metoda je statična in jo lahko kličemo iz tega razreda (metoda main()) ali 
   * iz kateraga drugega razreda (nya primer: reazred VremeGUI, metoda main()).
   * 
   * @param mesto ime mesta, za katero iščemo temperaturo
   * @return temperatura v mestu
   */
  public static String getT(String mesto) {
    // naslov internetne strani, kjer dobimo podatke o temperaturi
    String naslov = "https://meteo.arso.gov.si/uploads/probase/www/observ/surface/text/sl/observation_si_latest.html";
    
    // "tagi" v html kodi, preko katerih poiščem iskano temperaturo
    String n1 = "<td class=\"meteoSI-th\">"+mesto+"</td>";
    String n2 = "<td class=\"t\">";
    String n3 = "</td>";
    
    try {
      // povežeme se na spletno stran ...
      URL url = new URL(naslov);
      Scanner sc = new Scanner(url.openStream());
      
      // ... in berem vrstico za vrstico ...
      while (sc.hasNextLine()) {
        String v = sc.nextLine();
        // ... dokler ne najdem vrstice, ki vsebuje podatke o mestu
        if (v.startsWith(n1)) {
          int i1 = v.indexOf(n2);
          int i2 = v.indexOf(n3, i1);
          // iz podatkov "preberem" iskano temperaturo
          return v.substring(i1+n2.length(), i2);
        }
      }
      sc.close();
            
    } catch (MalformedURLException ex) {
      System.out.println("URL Napaka: " + ex.toString());
    } catch (IOException e) {
      System.out.println("IO napaka: " + e);
    }
    return "?";
  }

  public static void main(String[] args) {
    System.out.println(getT("Ljubljana"));
  }
}
