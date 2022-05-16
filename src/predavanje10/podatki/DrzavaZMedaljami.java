package predavanje10.podatki;
import predavanje10.Drzava;

/**
 *
 * @author tomaz
 */
public class DrzavaZMedaljami extends Drzava implements Comparable<DrzavaZMedaljami>{
  
  private int medalje;

  public DrzavaZMedaljami(Drzava d) {
    super(d.getKratica(), d.getGlavnoMesto(), d.getSteviloPrebivalcev());
    this.medalje = 0;
  }
  
  public void addMedalje(int medalje) {
    this.medalje += medalje;
  }
  
  public double getNormiranoSteviloMedalj() {
    if (getSteviloPrebivalcev() == 0) return 0;
    return 1.0 * this.medalje / (getSteviloPrebivalcev()/1000000);
  }  

  @Override
  public String toString() {
    return String.format("%7.2f %s", getNormiranoSteviloMedalj(), getKratica());
  }

  
  
  @Override
  public int compareTo(DrzavaZMedaljami o) {
    return Double.compare(this.getNormiranoSteviloMedalj(), o.getNormiranoSteviloMedalj());
  }
}
