package predavanje10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Uporaba ArrayList za shranjevanje imen
 * @author tomaz
 */
public class ArrayListTest1 {
  
  public static void main(String[] args) {
    // če povem, kakšnega tipa bodo podatki v seznamu (<String>), potem 
    // lahko v seznam dodajam le podatke tega tipa ...
    ArrayList<String> imena = new ArrayList();
    
    imena.add("Micka");
    imena.add("Polde");
    imena.add("Lolek");
    imena.add("Bolek");
    
    // ... ob dodajanju podatkov drugačnega tipa Java javi napako
    //imena.add(42);

    // ker so podatki tipa String, lahko uporabim iterator, ki vrača String-e
    Iterator<String> it = imena.iterator();
    while(it.hasNext()) {
      String ime = it.next();
      System.out.println(ime);
    }    
  }

}
