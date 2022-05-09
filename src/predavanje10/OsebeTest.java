package predavanje10;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tomaz
 */
public class OsebeTest {
  
  public static void main(String[] args) {
    ArrayList<Oseba> osebe = new ArrayList<>();
    
    // ustvarim nekaj oseb in jih dam v seznam ...
    osebe.add(new Oseba("Micka", 175));
    osebe.add(new Oseba("Lolek", 205));
    osebe.add(new Oseba("Ana", 180));
    
    // ... seznam uredim (glede na kriterij compareTo(), ki je definiran v razredu Oseba) ...
    Collections.sort(osebe);
    
    // ... in osebe izpišem
    for (Oseba oseba : osebe) {
      System.out.println(oseba);
    }
  }

}
