package predavanje08;

/**
 *
 * @author tomaz
 */
public class TestOsebe {
  
  public static void main(String[] args) {
    Oseba a = new Oseba("Polde");
    a.izpisi();
    
    // Ker je Clovek "nadgradnja" osebe, lahko na objektu
    // razreda Clovek kličem vse metode, ki so bile
    // definirane v razredu Oseba
    Clovek b = new Clovek();
    b.setIme("Micka");
    b.izpisi();
  }

}
