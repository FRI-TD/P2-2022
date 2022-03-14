package predavanje05;

/**
 *
 * @author tomaz
 */
public class OvojniTipi {
  
  static void izpisi(int a) {
    System.out.println(a);
  }
  
  public static void main(String[] args) {
    // za "pretvorbo" med tipom (int) in njegovim ovojnim ekvivalentom (Integer)
    // v ozadju ves čas skrbi java preko mehanizma boxing / unboxing
    
    Integer a = 5;    // boxing    (isto kot Integer a = new Integer(5);)
    //izpisi(a);      // unboxing  (isto kot izpis(a.intValue());)
  }

}
