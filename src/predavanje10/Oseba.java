package predavanje10;

/**
 * Razred Oseba. Poleg dveg atrubutov in metode toString() razred implementira 
 * vmesnik Comparable (da bomo lahko primerjali dva objekta tipa Oseba).
 * 
 * @author tomaz
 */
public class Oseba implements Comparable<Oseba> {
  String ime;
  int visina;

  public Oseba(String ime, int visina) {
    this.ime = ime;
    this.visina = visina;
  }
  
  public String toString() {
    return this.ime + " - " + this.visina;
  }  

  @Override
  // Metoda vrne 0, <0, >0
  public int compareTo(Oseba o) {
    // primerjam sebe (this) in osebo o glede na izbran kriterij  in vrnem 
    // 0  ... če sta osebi enaki
    // 1  ... če je this < o
    // -1 ... če je this > o
    
    // primerjava glede na priimek
    //return this.ime.compareTo(o.ime);
    
    // primerjava oseb po velikosti
    return this.visina - o.visina;
  }
  
  
}
