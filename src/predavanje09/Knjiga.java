package predavanje09;

/**
 * Knjiga z lastnostmi avtor, naslov in letoIzdaje 
 * ter metodami izpisi() in getPodrobnosti()
 * @author tomaz
 */
abstract public class Knjiga extends Object {
  static int steviloKnjig = 0;
  
  private String avtor;
  private String naslov;
  private int letoIzdaje;
  
  private int id; // identifikacijska stevilka knjige

  public Knjiga(String avtor, String naslov, int letoIzdaje) {
    // ko naredim novo knjigo, povečam (statični) števec za ena ...
    steviloKnjig++;
    // ... in v atribut id shranim vrednost tega števca 
    this.id = steviloKnjig;
    
    this.avtor = avtor;
    this.naslov = naslov;
    this.letoIzdaje = letoIzdaje;
  }

  
  
  public String getAvtor() {
    return avtor;
  }

  public void setAvtor(String avtor) {
    this.avtor = avtor;
  }

  public String getNaslov() {
    return naslov;
  }

  public void setNaslov(String naslov) {
    this.naslov = naslov;
  }

  public int getLetoIzdaje() {
    return letoIzdaje;
  }

  public void setLetoIzdaje(int letoIzdaje) {
    this.letoIzdaje = letoIzdaje;
  }
  
  // metoda bo dafinirana v podrazredih
  abstract String getPodrobnosti();
  
  
  void izpisi() {
    System.out.println("Knjiga številka " + this.id);
    System.out.println("Avtor:  " + this.avtor);
    System.out.println("Naslov: " + this.naslov);
    System.out.println("Leto:   " + this.letoIzdaje);
    System.out.println(getPodrobnosti());
    System.out.println("----------------------------------------------");
  }

  @Override
  public String toString() {
    return "Zaporedna stevilka: " + id;
  }
  
  
}
