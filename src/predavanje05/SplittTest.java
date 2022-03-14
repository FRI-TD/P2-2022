package predavanje05;

/**
 *
 * @author tomaz
 */
public class SplittTest {
  
  public static void main(String[] args) {
    // niz, ki vsebuje več podatkov, ločenih z nekim ločilom (v tem primeru z ":") ...
    String t = "tomaz:x:1000:1000:,,,:/mnt/d/Users/tomaz/linux:/bin/bash";
    // ... lahko "razbijemo" na posamezne dele z metodo split();  kot parameter podamo ločilo
    String[] deli = t.split(":");
    
    // izpis vseh "delov" razbitev niza:
    for(int i=0; i<deli.length; i++)
      System.out.println(deli[i]);
    
  }

}
