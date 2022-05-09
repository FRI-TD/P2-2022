package predavanje10;

import java.util.Arrays;

/**
 *
 * @author tomaz
 */
public class TabelaCelihStevil {
  
  public static void main(String[] args) {
    int[] tab = {1,6,3,9,2,7,0,5};
    
    // pri izpisu tabele lahko uporabim metodo Arrays.toString()
    System.out.println(Arrays.toString(tab));
    
    // java zna urediti tabelo celih števil (in vseh ostalih primitivnih tipov)
    // Urejanje je preprosto - uporabim le metodo Arrays.sort()
    Arrays.sort(tab);
    System.out.println(Arrays.toString(tab));
  }

}
