package predavanje10.podatki;

enum TipIger {
  POLETNE, ZIMSKE;
}

enum Spol {
  M, Z;
}
/**
 *
 * @author tomaz
 */
public class Sportnik {
  private String  ime;
  private Spol    spol;
  private String  drzava;
  private String  sport;
  private TipIger tipIger;
  private int     steviloMedalj;

  public Sportnik(String ime, Spol spol, String drzava, String sport, TipIger tipIger, int steviloMedalj) {
    this.ime = ime;
    this.spol = spol;
    this.drzava = drzava;
    this.sport = sport;
    this.tipIger = tipIger;
    this.steviloMedalj = steviloMedalj;
  }

  public String getIme() {
    return ime;
  }

  public void setIme(String sportnik) {
    this.ime = sportnik;
  }

  public Spol getSpol() {
    return spol;
  }

  public void setSpol(Spol spol) {
    this.spol = spol;
  }

  public String getDrzava() {
    return drzava;
  }

  public void setDrzava(String drzava) {
    this.drzava = drzava;
  }

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public TipIger getTipIger() {
    return tipIger;
  }

  public void setTipIger(TipIger tipIger) {
    this.tipIger = tipIger;
  }

  public int getSteviloMedalj() {
    return steviloMedalj;
  }

  public void setSteviloMedalj(int steviloMedalj) {
    this.steviloMedalj = steviloMedalj;
  }

  
}

