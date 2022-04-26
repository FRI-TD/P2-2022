package predavanje09;


/**
 *
 * @author tomaz
 */
public class Newton {
  
  // računanje nicle dane funkcije po Newtnovi iteracijski metodi
  static double nicla(Funkcija f, double x0, int n) {
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    }
    return x0;
  }

  public static void main(String[] args) {
    double x = nicla(new Kvadratna(), 4, 5);
    System.out.println(x);
    
    Funkcija s = new Sinus();
    System.out.println(nicla(s, 3, 2));
    System.out.println(Math.PI);
    
    // definicija funkcije Cosinus s pomočjo
    // anonimnega notranjega razreda
    Funkcija f1 = new Funkcija() {
      double vrednost(double x) {
        return Math.cos(x);
      }
  
      double odvod(double x) {
        return -Math.sin(x);
      }
    };
  }
}
