package predavanje03;

/**
 * Program je razdeljen na tri metode: 
 *   - metoda sestej(), ki sesteje dani stevili in vrne vstot
 *   - metoda izpisi(), ki izpiše dano število (in nič ne vrne) in
 *   - glavna metoda (main), ki kliče ti dve metodi.
 */
public class TestMetode {
  
  static int sestej(int a, int b) {
    return a+b;
  }
  
  static void izpisi(int i) {
    System.out.println(i);
  }
  
  public static void main(String[] args) {
    int vsota = sestej(4,7);
    izpisi(vsota);
  }

}
