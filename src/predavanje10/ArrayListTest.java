package predavanje10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Uporaba ArrayList za shranjevanje imen
 * @author tomaz
 */
public class ArrayListTest {
  
  public static void main(String[] args) {
    // Uporabim ArrayList brez eksplicitno podanega tipa podatkov, ki jih bomo hranili ...
    ArrayList imena = new ArrayList();
    
    imena.add("Micka");
    imena.add("Polde");
    imena.add("Lolek");
    imena.add("Bolek");
    
    // ... zato lahko v seznam dodam tudi števila (saj je privzeti tip enak Object)
    imena.add(42);
    
    // se pa v nadaljevanju pojavi težava, saj ne vem, kakšnega tipa so podatki v seznamu
    // Iterator je "splošnega" tipa (torej vrača elemente tipa Object)
    Iterator it = imena.iterator();
    while(it.hasNext()) {
      // če podatke želim uporabiti kot String, moram preveriti, če so res tega tipa
      Object o = it.next();
      if (o instanceof String) {
        String ime = (String) o;
        System.out.println(ime);
      }
    }
  }

}
