package predavanje12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Pretvornik med valutami; podatke dobim na spletu na strani min-api.cryptocompare.com
 * @author tomaz
 */
public class Valute {
  public static void main(String[] args) {
    // "vhodna" in "izhodna" valuta
    String v1 = "BTC";
    String v2 = "EUR";
    
    // zahteva za spletno posredovanje podatkov o manjalnem tećaju
    String naslov = String.format("https://min-api.cryptocompare.com/data/price?fsym=%s&tsyms=%s", v1, v2);
    
    try {
      // povezem se na stran ...
      URL url = new URL(naslov);
      Scanner sc = new Scanner(url.openStream());
      // .. in preberem podatke
      String rezulat = sc.nextLine();
      sc.close();
      
      System.out.println(rezulat.replaceAll("[{}]", ""));
      
    } catch (MalformedURLException ex) {
      System.out.println("URL Napaka: " + ex.toString());
    } catch (IOException e) {
      System.out.println("IO napaka: " + e);
    }
  }

}
