package predavanje05;

/**
 *
 * @author tomaz
 */
public class Tabela {
  public static void main(String[] args) {
    int[] tabela = {4,5,6,7,8};
    System.out.println(tabela[4]);
            
    // pri dostopu do elementa "izven" tabele, se sproži 
    // izjema ArrayIndexOutOfBountsException
    System.out.println(tabela[5]);
  }
}
