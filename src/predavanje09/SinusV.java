package predavanje09;

/**
 * SinusV je implementacija vmesnika FunkcijaV; v njem sta definirani obe 
 * metodi, vrednost() in odvod(), tako, da SinusV predstavljata 
 * funkcijo f(x) = sin(x)
 * 
 * Opomba: za razliko od razreda Sinus, v katerem smo z "extends Funkcija"
 * "razširili" razred Funkcija, tu z "implements FunkcijaV" implementiramo
 * vmensik FunkcijaV.
 * 
 * @author tomaz
 */
public class SinusV implements  FunkcijaV {
  public double vrednost(double x) {
    return Math.sin(x);
  }
  
  public double odvod(double x) {
    return Math.cos(x);
  }
}
