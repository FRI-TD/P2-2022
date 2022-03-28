package predavanje05;

/**
 * Izpis položaja vseh presledkov v danem nizu.
 * @author tomaz
 */
public class Niz {
  public static void main(String[] args) {
    String niz = "To je dolg niz."; // presledki so na položajih 2, 5 in 10
    
    // Zapomnili si bomo mesto zadnjega najdenega presledka, da 
    // bomo z metodo indexOf lahko nadaljevali od tu naprej.
    // Začnemo na začetku (polozaj=0).
    int polozaj = 0;
    
    do {
      // poiscemo naslednji presledek; iskanje začnemo od prejšnjega presledka naprej
      polozaj = niz.indexOf(" ", polozaj);
      
      // rezultat -1 pomeni, da presledka nismo našli; sicer pa:
      if (polozaj != -1)
        System.out.println(polozaj);// izpišemo položaj najdenega presledka ...
      
      // ... in se pomaknemo za eno mesto naprej (sicer bi za vedno obtičali na prvem najdenem presledku)
      polozaj++;
    } while(polozaj != 0);
  }

}
