package predavanje03;

import java.util.Scanner;

/**
 *
 * @author tomaz
 */
public class BranjeTipkovnica {
  
  public static void main(String[] args) {
    // za branje podatkov iz tipkovnice potrebujem "Scanner", ki ga ustvarim tako:
    Scanner tipkovnica = new Scanner(System.in);
    
    System.out.print("Vpisi ime: "); 
    String ime = tipkovnica.nextLine();  // preberem ime (niz) ...
    System.out.println("Pozdravljen, " + ime); // ... in ga izpišem
    
    System.out.print("Koliko si star? ");
    int starost = tipkovnica.nextInt();  // preberem starost (število) ...
    System.out.println("Star si " + starost + " let."); // ... in ga izpišem
    
  }

}
