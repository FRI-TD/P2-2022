package predavanje04;

/**
 * Pretvorba iz desetiškega v dvojiški številski sistem:
 *
 * 42 --vDvojisko---> "101010" "101010" --vDesetisko--> 42
 *
 * @author tomaz
 */
public class DesetiskoDvojisko {

  static String vDvojisko(int x) {
    String rezultat = "";

    // dokler so biti še prisotni, pogledam zadnji bit in 
    // število "po bitih premaknem" v desno
    while (x > 0) {
//      if ((x & 1) == 1) 
//        rezultat = "1" + rezultat;
//      else
//        rezultat = "0" + rezultat;
      // krajši zapis (namesto zgornjih 4 vrstic)
      rezultat = ((x & 1) == 1 ? "1" : "0") + rezultat;

      x = x >> 1;
    }
    return rezultat;
  }

  // v tej metodi grem od leve proti desni in "prištevam" enke,
  // ker se na vsakem koraku "vrednost enke poveča", rezultat
  // sproti (na vsakem koraku) množim z 2
  static int vDesetisko(String x) {
    int rezultat = 0;
    for (int i = 0; i < x.length(); i++) {
      rezultat = rezultat << 1;

      if (x.charAt(i) == '1') {
        rezultat += 1;
      }
    }
    return rezultat;
  }

  // podobno kot prejšnja metoda, le da grem v tem primeru
  // po bitih od desne (najmanj pomemben bit) proti levi
  // (najbolj pomemben bit) in sproti prištevam vrednost bita;
  // ta se na vsakem koraku podvoji
  static int vDesetisko2(String x) {
    int rezultat = 0;
    int vrednostBita = 1;
    for (int i = x.length() - 1; i >= 0; i--) {
      if (x.charAt(i) == '1') {
        rezultat += vrednostBita;
      }
      vrednostBita = vrednostBita << 1;
    }
    return rezultat;
  }

  public static void main(String[] args) {
    int x = 42;
    String dvojisko = vDvojisko(x);
    int y = vDesetisko2(dvojisko);

    Integer.toString(42, 2);
    Integer.parseInt("101010", 2);

    System.out.println(y);

    System.out.println(x == y ? "OK" : "NOK");
  }

}
