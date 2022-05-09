package predavanje10;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tomaz
 */
public class Delitelji {
  
  // metoda vrne množico deliteljev danega stevila
  static Set<Integer> delitelji(int n) {
    TreeSet<Integer> result = new TreeSet();
    
    for(int i=1; i<=n/2; i++)
      if (n % i == 0) result.add(i);
    
    return result;
  }
  
  public static void main(String[] args) {
    int a = 45;
    int b = 100;
    
    Set<Integer> delA = delitelji(a);
    Set<Integer> delB = delitelji(b);
    
    System.out.printf("Delitelji %d:       %s\n", a, delA.toString());
    System.out.printf("Delitelji %d:       %s\n", b, delB.toString());
    
    Set<Integer> unija = new TreeSet(delA);
    unija.addAll(delB);
    
    System.out.println("Delitelji a ALI b: " + unija);
    
    Set<Integer> presek = new TreeSet(delA);
    presek.retainAll(delB);
    System.out.println("Delitelji a IN b:  " + presek);
    
  }

}
