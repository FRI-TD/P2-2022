package predavanje02;

/**
 * Program posteje, koliko besed iz tabele "besede" 
 * se začne na posamezno črko angleške abecede.
 * @author tomaz
 */
public class Stetje {
  
  static String[] besede = new String[] {
    "pomlad", "jabolko", "jesen", "zima", "lopar", "bor"
  };

  public static void main(String[] args) {
    // število besed na posamezno crko vodim v tabeli "stevci",
    // pri čemer stevci[i] pove, koliko besed se začne na
    // i-to črko abecede ('a'=0, 'b'=1, ...)
    int[] stevci = new int[26]; // privzeto so v tabeli samo ničle!        
    
    // "sprehodim" se po tabeli besed ...
    for(int i=0; i<besede.length; i++) {
      char c = besede[i].charAt(0);
      // ... in v tabeli na prevem mestu povečam vrednost za 1
      stevci[c-'a'] = stevci[c-'a'] + 1;
      // stevci[c-'a'] += 1;
      // stevci[c-'a']++;
    }
    
    // izpis rezultata (tabele stevci)
    for(int i=0;i<26; i++) {
      System.out.printf("Število besed na črko '%c': %d\n", 
           (i+'a'), stevci[i]);
    }
  }
}
