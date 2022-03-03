package predavanje02;

/**
 *
 * @author tomaz
 */
public class Srecke {
  
  public static void main(String[] args) {
    double cenaSrecke = 1.25;
    
    // uporaba zanke za izpis tabele
    for(int i=1; i<=25; i++) {
      System.out.printf("%5d   |  %5.2f \n", i,  cenaSrecke * i);
    }
  }

}
