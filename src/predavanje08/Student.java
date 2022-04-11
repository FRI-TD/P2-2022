package predavanje08;

/**
  Razred Student hrani podatke o studentu (ime, id, status in tabela ocen).
 * @author tomaz
 */
public class Student {
  // ker smo atrubute skrili (private), bomo do njih dostopali 
  // le preko  getterjev / setterjev
  private String ime;
  private String id;
  private String status;
    
  private int[] ocene;
  private int   stOcen;   // dejansko stevilo ocen v tabeli ocene
  
  // privzek konstruketor brez parametrov
  Student() {
    this.ime    = "";
    this.id     = "";
    this.status = "?";
    
    ocene  = new int[10];
    stOcen = 0;
  }
  
  Student(String ime, String id) {   
    // klic konstruktorja brez parametrov
    this();
    
    this.ime = ime;
    this.id  = id;
  }
  
  
  //************** getterji / setterji **********************
  public void setIme(String ime) {
    this.ime = ime;
  } 
  public String getIme() {
    return ime;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }
  //^^^^^^^^^^^^^^^^ getterji / setterji ^^^^^^^^^^^^^^^^

 
  /**
   * Metoda za dodajanje ocene. Ob klicu te metode se avtomatsko 
   * ažurira tudi vrednost atributa status.
   */
  public void dodajOceno(int ocena) {
    ocene[stOcen++] = ocena;
    
    if (povprecje() > 9)
      status = "Odličen";
    else
      status = "Dober";
  }
  
  double povprecje() {
    if (stOcen == 0) return 0;
    
    double vsota = 0;
    for (int i = 0; i < stOcen; i++) {
      vsota += ocene[i];
    }
    
    return vsota / stOcen;
  }
  
  // podatki o študentu v znakovni obliki (primerno za izpis na zaslon)
  public String toString() {
    return String.format("%s, povprecje: %.2f, status: %s\n", ime, povprecje(), status);
  }
  
}
