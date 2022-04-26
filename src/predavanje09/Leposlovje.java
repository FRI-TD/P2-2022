package predavanje09;

/**
 * Implementacija Knjige. Posebnost: Leposlovje ima dodaten atribut (tabela 
 * mnenjaBralcev)  in metodo za dodajanje mnenj (dodajMnenje()).
 * 
 * @author tomaz
 */
public class Leposlovje extends Knjiga {
  static final int MAX_MNENJ = 100;
  
  int      stMnenj;
  String[] mnenjaBralcev;

  public Leposlovje(String avtor, String naslov, int letoIzdaje) {
    super(avtor, naslov, letoIzdaje);
    
    this.stMnenj = 0;
    this.mnenjaBralcev = new String[MAX_MNENJ];
  }
  
  void dodajMnenje(String mnenje) {
    if (stMnenj < MAX_MNENJ)
      mnenjaBralcev[stMnenj++] = mnenje;
  }

  @Override
  String getPodrobnosti() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < stMnenj; i++) {
      sb.append(mnenjaBralcev[i]).append("\n");
    }
    return sb.toString();
  }

  
  
}
