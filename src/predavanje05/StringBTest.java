package predavanje05;

/**
 *
 * @author tomaz
 */
public class StringBTest {
  
  public static void main(String[] args) {
    
    // Vrednost spremenljivk tipa String NE MOREMO spreminjati
    //String ime = "miha";
    // ime.setCharAt(0) = 'M'; // NE GRE!
    
    //Če namesto String uporabim StringBuilder ...
    StringBuilder ime = new StringBuilder("miha");
    // pa vrednost lahko spremenim!
    ime.setCharAt(0,'M');
    
    System.out.println(ime);
  }

}
