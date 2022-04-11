package predavanje08;

/**
 * Preprost razred z enim atributom (ime), konstruktorjem, 
 * getterjem/setterjem ter metodo izpisi().
 * @author tomaz
 */
public class Oseba {
  private String ime;

  Oseba() {}
  
  public Oseba(String ime) {
    this.ime = ime;
  }

  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }
  
  public void izpisi() {
    System.out.println("Moje ime: " + this.ime);
  }

}
