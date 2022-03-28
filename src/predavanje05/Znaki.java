package predavanje05;

/**
 *
 * @author tomaz
 */
public class Znaki {
  
  public static void main(String[] args) {
    int \u0160=15; // tudi ime spremenljivke lahko vsebuje UNICODE znake
    System.out.println(Š);      // spremenjlivko uporabim preko unicode zapisa ...  
    System.out.println(\u0160); // ... ali na "običajen" način - javi je vseeno!
    
    // v spremenljivko tipa char lahko shranim poljuben unicode znak&
    char pi = '\u03c0';
    System.out.println(pi);
    
  }

}
