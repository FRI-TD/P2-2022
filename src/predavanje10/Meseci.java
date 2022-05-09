package predavanje10;

import java.util.Set;
import java.util.TreeMap;

/**
 * Slovar mesecev. Prikaz delovanja metod put(), get(), size(), keySet(), ....
 * @author tomaz
 */
public class Meseci {
  
  public static void main(String[] args) {
    TreeMap<String, Integer> meseci = new TreeMap<>();
    
    meseci.put("JAN", 31);
    meseci.put("FEB", 28);
    meseci.put("MAC", 31);
    meseci.put("APR", 30);
    meseci.put("MAJ", 31);
    meseci.put("JUN", 30);
    meseci.put("JUL", 31);
    //meseci.put("AVG", "Janez");
    //meseci.put(31,"DEC");
    
    System.out.println(meseci.get("AVG")); 
    
    System.out.println("Stevilo elementov: " + meseci.size());
    
    meseci.remove("JAN");
    meseci.remove("JAN");    
    System.out.println("Stevilo elementov: " + meseci.size());
    
    meseci.remove("NOV"); 
    System.out.println("Stevilo elementov: " + meseci.size());

    System.out.println("Vsi meseci:");
    Set<String> kljuci = meseci.keySet();
    for(String kljuc : kljuci) {
      System.out.println(kljuc + ":" + meseci.get(kljuc)); 
    }
  }

}
