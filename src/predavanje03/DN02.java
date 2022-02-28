package predavanje03;

/**
 * "Popravljena" domača naloga: originalen program 
 * (glej https://ucilnica.fri.uni-lj.si/pluginfile.php/171534/mod_resource/content/5/DN02.java)
 * sem preoblikoval tako, da sem kodo za izpis prve in zadnje vrstice 
 * napisal v metodo izpisiObrobo(), ki sem jo nato dvakrat klical. 
 * 
 * @author tomaz
 */
public class DN02 {

  static void izpisiObrobo(String [] args, String[] obroba) {
    // izpis obrobe v prvi vrstici
    for (int i = 0; i < args.length; i++) {
      /// izpis 
      for (int j = 0; j < args[i].length() + 4; j++) {
        System.out.print(obroba[i % 2]);
      }
      System.out.print(" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    //args = new String[]{"pomlad", "poletje", "jesen", "zima"};

    String obroba[] = {"*", "+"};

    if (args.length == 0) {
      System.out.println("Uporaba: java DN02 besede...");
      System.exit(0);
    } else {
      izpisiObrobo(args, obroba);
      
      // izpis besed
      for (int i = 0; i < args.length; i++) {
        System.out.printf("%s %s %s ", obroba[i % 2], args[i], obroba[i % 2]);
      }
      System.out.println();
      
      izpisiObrobo(args, obroba);
    }
  }

}
