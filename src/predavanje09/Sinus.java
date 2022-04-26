package predavanje09;

/**
 * Sinus je naslednik razreda Funkcija; v njem sta definirani obe 
 * abstraktni metodi, vrednost() in odvod(), tako, da predstavljata 
 * funkcijo f(x) = sin(x)

 * @author tomaz
 */
public class Sinus extends Funkcija {
  double vrednost(double x) {
    return Math.sin(x);
  }
  
  double odvod(double x) {
    return Math.cos(x);
  }
}
