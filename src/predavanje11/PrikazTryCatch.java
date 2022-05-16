package predavanje11;

/**
 *
 * @author tomaz
 */
public class PrikazTryCatch {
  
  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    
    int i=0;
    
    //i = 10/b;
    
    try {
      i = a/b; // celostevilsko deljenje
      return;  
    } catch (ArithmeticException izjema) {
      // ker se je zgodila izjema, v i shranim 
      // privzet rezultat (recimo: priblizek neskoncnosti) 
      i=Integer.MAX_VALUE;
      
      // izpis napake (razred + opis)
      System.out.println(izjema.toString());
      
      // lahko izpišemo natančen vir (sled) napake ...
      izjema.printStackTrace();
      
      // ... ali pa le opis napake
      System.out.println(izjema.getMessage());
    } finally {   
      // izpis rezultata se bo zgodil v vsakem primeru (kljub ukazu return; v try bloku)
      System.out.println("Rezultat: " + i);
    }
    
//    System.out.println(5.0/0);  // Infinity
//    System.out.println(-5.0/0); // -Infinity
//    System.out.println(0.0/0);  // Nan
  }

}
