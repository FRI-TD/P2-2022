package predavanje10;

/**
 * Razred Drzava - trije atributi, konstruktor ter getterji/setterji.
 * @author tomaz
 */
public class Drzava {
   private String krtica;
   private String glavnoMesto;
   private int steviloPrebivalcev;

  public Drzava(String krtica, String glavnoMesto, int steviloPrebivalcev) {
    this.krtica = krtica;
    this.glavnoMesto = glavnoMesto;
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  public String getKratica() {
    return krtica;
  }

  public void setKrtica(String krtica) {
    this.krtica = krtica;
  }

  public String getGlavnoMesto() {
    return glavnoMesto;
  }

  public void setGlavnoMesto(String glavnoMesto) {
    this.glavnoMesto = glavnoMesto;
  }

  public int getSteviloPrebivalcev() {
    return steviloPrebivalcev;
  }

  public void setSteviloPrebivalcev(int steviloPrebivalcev) {
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  @Override
  public String toString() {
    return String.format("%s: glavno mesto: %s (%d)", this.krtica, this.glavnoMesto, this.steviloPrebivalcev);
  }
  
}
