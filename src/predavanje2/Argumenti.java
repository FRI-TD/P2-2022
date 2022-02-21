package predavanje2;

/**
 * Izpis vseh argumentov programa.
 * 
 * @author tomaz
 */
public class Argumenti {
  
  public static void main(String[] args) {
    System.out.println("Število argumentov: " + args.length);
    for(int i=0; i<args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
