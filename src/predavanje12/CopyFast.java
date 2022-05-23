package predavanje12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Prepis vhodne datoteke v izhodno.
 * Ker pri prepisu uporabljam medpomnilnik (buffer) na nekrat preberem blok (4096)
 * znakov, kar delovanje programa ZELO pohitri.
 * @author tomaz
 */
public class CopyFast {
  
  public static void main(String[] args) {
    args = new String[]{"viri/medo1.png", "viri/medoXX.png"};
    
    File f1 = new File(args[0]);  // vhodna datoteka
    File f2 = new File(args[1]);  // izhodna datoteka
    
    try {
      FileInputStream  fis = new FileInputStream(f1);
      FileOutputStream fos = new FileOutputStream(f2);
      
      byte[] buf = new byte[4096];
      while (fis.available() > 0) {
        int z = fis.read(buf);
        fos.write(buf, 0, z);
      }
    
      fis.close();
      fos.close();
    } catch (Exception e) {
      System.out.println("Napaka: "+ e.toString());
    }
    
    
  }

}
