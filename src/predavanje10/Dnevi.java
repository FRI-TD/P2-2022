package predavanje10;

import java.util.*;

/**
 * Prikaz uporabe metod add(), remove(), size(), contains(), ... v množici.
 * @author tomaz
 */
public class Dnevi {

  public static void main(String[] args) {
    Set<String> dnevi = new TreeSet();
    
    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("ČET");
    dnevi.add("PET");
    dnevi.add("A");
    dnevi.add("C");

    dnevi.add("PON");
    
    dnevi.remove("PON");

    
    System.out.println(dnevi.size());
    System.out.println(dnevi.isEmpty());
    System.out.println(dnevi.contains("SOB"));
    
    System.out.println("PON:" + dnevi.contains("PON"));
    
    System.out.println("Elementi mnozice:");

    Iterator it = dnevi.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    
    for(String d : dnevi) {
      System.out.println(d);
    }
    
    int[] tab = {3,6,8,0};
    for(int x : tab) {
      System.out.println(x);
    }
  }
}
