package predavanje03;

/**
 * Program predavanje02/StatistikaNiza.java sem preoblikoval tako, da sem
 * glavni del kode pisal v metodo statistika(). Nato sem to metodo večkrat klical.
 * @author tomaz
 */
public class StatistikaNiza {
  
  static void statistika(String niz) {
    System.out.println("Niz: " + niz);
    System.out.println("Prva črka: " + niz.charAt(0));
    System.out.println("Zadnja črka: " + niz.charAt(niz.length()-1));
    
    String brezPresledkov = niz.replaceAll(" ", "");
    
    System.out.println("Brez presledkov: " + brezPresledkov);
    
    // iz niza spredaj in zadaj odstranim presledke ...
    String ociscenNiz = niz.trim(); 
    // ... nato odstranim se podvojene presledke vmes; za to uporabim 
    // regularni izraz " +" , ki opisuje nize, ki so sestavljeni
    // iz enega ali več presledkov (" ", "  ", "   ", "    ",...)
    ociscenNiz = ociscenNiz.replaceAll(" +", " ");
    
    int steviloBesed = ociscenNiz.length() - brezPresledkov.length() + 1;
    System.out.println("Število besed: " + steviloBesed);

    System.out.print("Obrnjen niz: ");
    for(int i=niz.length()-1;  i >= 0; i=i-1) { // i--
      System.out.print(niz.charAt(i));
    }
    System.out.println();
        
  }
  
  public static void main(String[] args) {
    String niz = "Danes   je   lep  počitniški dan!";
    statistika(niz);
    
    niz = "Bla bla bla";
    statistika(niz);
    
    statistika("Izpis statistike niza");
  }

}
