package predavanje09;

/**
 * Kvadratna funkcija je naslednik razreda Funkcija; v njem sta definirani obe 
 * abstraktni metodi, vrednost() in odvod(), tako, da predstavljata funkcijo 
 * f(x) = x^2 - 2x + 6
 * 
 * @author tomaz
 */
public class Kvadratna extends Funkcija {

  @Override
  double vrednost(double x) {
    return x*x - 5*x + 6; 
  }

  @Override
  double odvod(double x) {
    return 2*x -5;
  }

  
}
