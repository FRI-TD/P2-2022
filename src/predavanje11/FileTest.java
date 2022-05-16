package predavanje11;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author tomaz
 */
public class FileTest {
  
  // izpis vsebine direktorija in vseh poddirektorijev
  // presledki ... število presledkov za izpis; ob vsakem naslednjem (rekurzivnem) klicu
  //               se število presledkov poveča (na ta način dobim "drevesno" strukturo)
  static void izpisiDirektorij(String imeDirektorija, String presledki) {
    File f = new File(imeDirektorija);
    // vsebina trenutnega direktorija ...
    String[] vsebina = f.list();
    for (String datoteka : vsebina) {
      File f2 = new File(f, datoteka);   // za vsako datoteko preverim, ali gre za direktorij ...   
      System.out.println(presledki + datoteka);
      if (f2.isDirectory()) // .. in ce gre, jo rekurzivno izpisem
        izpisiDirektorij(f2.toString(), presledki + "  ");
    }
  }
  
  public static void main(String[] args) {
    // ustvarim "verigo" folderjev in podfolderjev
    File f = new File("abc/def/xyz");
    // ali direktoriji obstajajo? (false)
    System.out.println(f.exists());
    f.mkdirs();
    // ali direktoriji obstajajo? (true)
    System.out.println(f.exists());
    


    // ali je f direktorij?  (true)
    System.out.println(f.isDirectory());

    // izpis vsebine trenutnega direktorija
    File f2 = new File(".");
    String[] vsebina = f2.list();
    System.out.println(Arrays.toString(vsebina));

    // rekurzivni izpis direktorijev in poddirektorijev
    izpisiDirektorij(".", "");

  }

}
