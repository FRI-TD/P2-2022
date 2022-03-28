package predavanje05;

/**
 * Primerjava hitrosti pri uporabi tipov String, StringBuffer in StringBuilder
 * @author tomaz
 */
public class DodajanjeNiza {
  
  // v String n-krat dodaj en znak in vrne velikost dobljenega niza
  static int dodajajVString(int n) {
    String a = "";
    for (int i = 0; i < n; i++) {
      a = a + "a";
    }
    return a.length();
  }
 // v StringBuffer n-krat dodaj en znak in vrne velikost dobljenega niza
  static int dodajajVStringBuffer(int n) {
    StringBuffer a = new StringBuffer("");
    for (int i = 0; i < n; i++) {
      a.append("a");
    }
    return a.length();
  }  
 // v StringBuilder n-krat dodaj en znak in vrne velikost dobljenega niza
  static int dodajajVStringBuilder(int n) {
    StringBuilder a = new StringBuilder("");
    for (int i = 0; i < n; i++) {
      a.append("a");
    }
    return a.length();
  }  
  
  public static void main(String[] args) {
    long zacetek = System.currentTimeMillis();
    //int v = dodajajVString(300000);
    //int v = dodajajVStringBuilder(300000);
    int v = dodajajVStringBuffer(300000);
    long konec = System.currentTimeMillis();
    System.out.println("Trajanje: " + (konec-zacetek) + "ms");    
  }

}
