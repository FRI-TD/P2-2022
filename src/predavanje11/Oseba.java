package predavanje11;

/**
 * @author tomaz
 */
public class Oseba implements Comparable<Oseba> {
  String ime;
  int visina;

  public Oseba(String ime, int visina) {
    this.ime = ime;
    this.visina = visina;
  }

  @Override
  // primerjava dveh oseb po imenu
  public int compareTo(Oseba o) {
    return this.ime.compareTo(o.ime);
  }
  
  
  
  public String toString() {
    return this.ime + " - " + this.visina;
  }  
}
