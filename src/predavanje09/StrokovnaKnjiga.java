package predavanje09;

/**
 * Implementacija Knjige. Posebnost: StrokovnaKnjiga ima dodaten atribut (indeks).
 * 
 * @author tomaz
 */
public class StrokovnaKnjiga extends Knjiga {
  
  private String indeks;

  StrokovnaKnjiga(String avtor, String naslov, int letoIzdaje, String indeks) {
    // klic konstruktorja od oceta (od super-razreda)
    super(avtor, naslov, letoIzdaje);
    
    this.indeks = indeks;
  }

  @Override
  String getPodrobnosti() {
    return "Indeks: " + this.indeks;
  }
    
  
  public String getIndeks() {
    return indeks;
  }

  public void setIndeks(String indeks) {
    this.indeks = indeks;
  }
  
  

}
