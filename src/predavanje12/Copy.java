package predavanje12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Prepis vhodne datoteke v izhodno.
 * 
 * @author tomaz
 */
public class Copy {
  
  public static void main(String[] args) {
    args = new String[]{"viri/medo.png", "viri/medoXX.png"};
    
    File f1 = new File(args[0]);  // vhodna datoteka
    File f2 = new File(args[1]);  // izhodna datoteka
    
    try {
      FileInputStream  fis = new FileInputStream(f1);
      FileOutputStream fos = new FileOutputStream(f2);
      
      while (fis.available() > 0) {
        int z = fis.read();
        fos.write(z);
      }
    
      fis.close();
      fos.close();
    } catch (Exception e) {
      System.out.println("Napaka: "+ e.toString());
    }
    
    
  }

}
