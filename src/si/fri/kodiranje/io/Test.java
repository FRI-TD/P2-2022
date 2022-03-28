package si.fri.kodiranje.io;

/**
 * Test delovanja metod preberiDatoteko() in zapisiDatoteko().
 * @author tomaz
 */
public class Test {
  public static void main(String[] args) {
     String imeDatoteke = "viri/a.txt";
     
     String vsebina = BeriPisi.preberiDatoteko(imeDatoteke);
     BeriPisi.zapisiDatoteko("viri/anew.txt", vsebina);
  }
}
