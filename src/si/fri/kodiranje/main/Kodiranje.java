package si.fri.kodiranje.main;

import si.fri.kodiranje.gui.KodiranjeOkno;
import si.fri.kodiranje.io.BeriPisi;



/**
 * Program za kodiranje in dekodiranje datotek, ki uporablja tri algoritme kodiranja: 
 * XOR, NUM in BASE64. Pri klicu programa poveš smer delovanja (code / decode), kodirni 
 * algoritem (xor/num/base64) ter ime vhodne in izhodne datoteke.  V primeru kodiranja 
 * tipa XOR, je podan tudi ključ. 
 * 
 * S programom želimo prikazati, kako se napiše malo večji program, zato kodo pišemo v 
 * več razredih, ki se nahajajo v različnih paketih. Glavni del programa (metoda main) 
 * se nahaja v tem razredu, ostali razredi pa so "pomožni" - v njih so metode, ki jih kličemo 
 * pri izvrševanju celotnega dela, to je pri kodiranju / dekodiranju datotek. 

 * @author tomaz
 */
public class Kodiranje {
  
  /**
   * Metoda na podlagi podanih parametrov kliče primerno metodo za kodiranje / dekodiranje.
   * @param smer smer kodiranje (code / decode)
   * @param metoda metoda kodiranja (XOR, NUM, B64)
   * @param inFile ime vhodne datoteke
   * @param outFile ime izhodne datoteke
   * @param kljuc kljuc (ta se uporablja samo pri metodi XOR)
   */  
   public static void doKodiranje(String smer, String metoda, String inFile, String outFile, String kljuc) {
    // preberemo vsebino datoteke ...
    String vsebina = BeriPisi.preberiDatoteko(inFile);
    
    // ... jo primerno "zakodirano" (oziroma odkodiramo) ...
    String novaVsebina = "";
      // na podlagi vrednosti "vsebina" in na podlagi "smer", "metoda" ustvarim "novaVsebina"
      switch (metoda) {
          case "NUM":
              if (smer.equals("code"))
                  novaVsebina = Kodirniki.kodirajNUM(vsebina);
              else
                  novaVsebina = Kodirniki.odkodirajNUM(vsebina);
              break;
          case "XOR":
              if (smer.equals("code"))
                  novaVsebina = Kodirniki.kodirajXOR(vsebina, kljuc);
              else
                  novaVsebina = Kodirniki.odkodirajXOR(vsebina, kljuc);
              break;
          case "B64":
              if (smer.equals("code"))
                  novaVsebina = Kodirniki.kodirajB64(vsebina);
              else
                  novaVsebina = Kodirniki.odkodirajB64(vsebina);
              break;
          default:
              novaVsebina = vsebina;
              break;
      }
       
    
    // ... in rezultat zapišemo v izhodno datoteko
    BeriPisi.zapisiDatoteko(outFile, novaVsebina);
  }
  
  /**
   * Glavna metoda programa. Če program kličemo z argumenti, se takoj izvrši 
   * kodiranje, sicer se najprej odpre okno in počaka na vnos podatkov.
   * 
   * Agrumenti programa: code / decode, XOR / NUM / B64, inFile, outFile,  kljuc   
   */
  public static void main(String[] args) {
    System.out.println("Kodiranje datotek, ver 1.0");
    
    // če imam argumente, te preberem in kličem metodo doKodiranje ...
    if (args.length >= 4) {
      String smer   = args[0];
      String metoda = args[1];
      String inFile = args[2];
      String outFile = args[3];
      
      String kljuc = "";
      if (args.length == 5)
        kljuc = args[4];
      //          "code"/"decode"    "XOR", "NUM", "B64"
      doKodiranje(smer,              metoda,                 inFile, outFile, kljuc);
      
    } else {
        KodiranjeOkno.prikaziOkno();
    }
  }

}
