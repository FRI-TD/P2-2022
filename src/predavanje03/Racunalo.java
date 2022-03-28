package predavanje03;

/**
 * Program sesteje prva dva argumenta in izpise vsoto.
 * 
 * @author tomaz
 */
public class Racunalo {
  
  static int vsota(int a, int b) {
    return a+b;
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Napačno število argumentov!");
      System.exit(0);
    }
    
    // pretvorba argumentov iz String v int obliko
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
   
    System.out.printf("%d + %d = %d \n", x, y, vsota(x,y));
  }
}
