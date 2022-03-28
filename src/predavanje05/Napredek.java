package predavanje05;

/**
 * Program 10x izpiše piko ("."), vsakič počaka 1 sekundo, 
 * na koncu izpisano "pobriše" in izpiše obvestilo o koncu. 
 * @author tomaz
 */
public class Napredek {
  public static void main(String[] args) throws Exception {   
    System.out.print("Napredek: ");
    // izpis pik ...
    for (int i = 0; i < 10; i++) {
      System.out.print(".");
      
      
      // premor - čakaj 1 sekundo; ker pri tem lahko pride do izjeme, 
      // v glavo metode main dodamo "throws Exception"
      Thread.sleep(1000);      
    }
    System.out.println("\rKončano!");
  }

}
