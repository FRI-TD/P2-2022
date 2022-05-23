package predavanje12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Pretvorba datoteke iz enega v drugi kodirni sistem
 * @author tomaz
 */
public class Pretvornik {
  
  public static void main(String[] args) {
    try (
      // povežem se na vhodno iz izhodno datoteko z izbranima kodirnima sistemoma
            // opomba: ker je odpiranje datotek izvedeno po sistemu "try-with-resources"
            // zapiranje datotek na koncu ni potrebno!
      InputStreamReader isr = new InputStreamReader(new FileInputStream(args[0]),    "CP1250");
      OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(args[1]), "UTF-8");
    )
    {
      // iz voda berem znam po znaku in ga zapisujem na izhod; za "pretvorbo"
      // kodirnih sistemov k avtomatsko poskrbela java
      while (isr.ready())
        osw.write(isr.read());
      
      
    } catch (Exception e) {
      System.out.println("Napaka: "+ e);
    }
  }

}
