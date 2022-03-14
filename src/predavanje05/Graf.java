package predavanje05;

/**
 *
 * @author tomaz
 */
public class Graf {
  public static void main(String[] args) {
    // dvodimenzionalna tabela, vrstice so različno dolge
    int[][] povezave = new int[4][];
    povezave[0] = new int[] {1};
    povezave[1] = new int[] {0,2,3};
    povezave[2] = new int[] {1,3};
    povezave[3] = new int[] {1,2};
    
    // izpis celotne strukture
    for(int i=0; i<povezave.length; i++) {
      System.out.print(i + ": ");
      for(int j=0; j<povezave[i].length; j++)
        System.out.print(povezave[i][j] + " ");
      System.out.println();
      
      // posamezno takelo lahko izpišemo tudi z metodo Arrays.toString()
      //System.out.println(Arrays.toString(povezave[i]));
    }
  }

}
