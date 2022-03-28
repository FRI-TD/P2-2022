package predavanje03;

import java.util.Random;

/**
 * Program ustvari in izpise 7 števil med 1 in 39.
 * 
 * @author tomaz
 */
public class Loto {
  
  public static void main(String[] args) {
    Random rnd = new Random();
    
    for(int i=1; i<=7; i++) {
      // ustvarim naključno število iz intervala [1..39]...
      int x = 1 + rnd.nextInt(39); 
      
      // ... in ga izpišem
      System.out.print(x + " ");
    }
    System.out.println();
  }
}
