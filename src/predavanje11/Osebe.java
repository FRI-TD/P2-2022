package predavanje11;

import java.util.*;

// primerjalnik (primerjava oseb po visini)
class PrimejalnikOseb implements Comparator<Oseba> {
  @Override
  public int compare(Oseba o1, Oseba o2) {
    return o1.visina - o2.visina;
  }
}

/**
 *
 * @author tomaz
 */
public class Osebe {
  
  public static void main(String[] args) {
    Set<Oseba> osebe = new HashSet<>();
    
    // ustvarim nekaj oseb in jih dam v seznam ...
    osebe.add(new Oseba("Bolek", 180));
    osebe.add(new Oseba("Micka", 175));
    osebe.add(new Oseba("Lolek", 205));
    osebe.add(new Oseba("Bolek", 160));
    osebe.add(new Oseba("Anica", 175));
    
    ArrayList<Oseba> seznamOseb = new ArrayList(osebe);
    System.out.println("Izpis po abecedi");
    Collections.sort(seznamOseb); 
    for (Oseba oseba : seznamOseb) {
      System.out.println(oseba);
    }
    
    System.out.println("-".repeat(32));
    
    // urejanje s podanim primerjalnikom
    Collections.sort(seznamOseb, new PrimejalnikOseb()); 
    System.out.println("Izpis po visini");
    for (Oseba oseba : seznamOseb) {
      System.out.println(oseba);
    }
    
    System.out.println("Izpis po imenu in visini");
    // urejanje s primerjalnikom, ki je podan kot anonimni notranji razred
    Collections.sort(seznamOseb,  new Comparator<Oseba>(){
      public int compare(Oseba o1, Oseba o2) {
        if (!o1.ime.equals(o2.ime)) // ce imata osebi razlicna imena, primerjam po imenu ...
          return o1.ime.compareTo(o2.ime);
        else // ... sicer po visini
         return o1.visina - o2.visina;     
      }      
    });
    for (Oseba oseba : seznamOseb) {
      System.out.println(oseba);
    }
  }
}
