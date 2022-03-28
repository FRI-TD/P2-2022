package si.fri.kodiranje.main;

import org.apache.commons.codec.binary.Base64;

/**
 * Razred, v katerem so napisane metode za kodiranje / dekodiranje. Metode 
 * uporabljamo v razredu Kodirnik v metodi doKodiranje(). Ker je razred 
 * Kodirnik v istem paketu kot ta razred, metode ne potrebujejo določila "public".
 * @author tomaz
 */
public class Kodirniki {
  
  /**
   * Metoda <b>zakodira</b> prejeto vsebino po metodi (NUM) in vrne zakodirano vsebino. 
   * Primer: "ABC" - "65 66 67"
   * @param vsebina vsebina, ki jo metoda kodira
   * @return vrne zakodirano vsebino
   */
  public static String kodirajNUM(String vsebina) { 
    String novaVsebina = ""; 
    for (int i = 0; i < vsebina.length(); i++) {  
      novaVsebina += (novaVsebina.isEmpty() ? "": " ") + 
                         String.format("%d", (int) vsebina.charAt(i));
    }
    return novaVsebina;
  }

  /**
   * Metoda <b>zakodira</b> prejeto vsebino (XOR) in vrne zakodirano vsebino. 
   * @param vsebina vsebina, ki jo metoda kodira
   * @return vrne zakodirano vsebino
   */
  static String kodirajXOR(String vsebina, String kljuc) { 
  /*
     vsebina = "To je testna datoteka. ..."
     kljuc   = "xyz"
    
     'T' ^ 'x'
     'o' ^ 'y'
     ' ' ^ 'z'
     'j' ^ 'x'
     'e' ^ 'y'
     ...
   */
    
    // ker je rezultat "spreminjajoči niz", jebolj smiselno uporabiti
    // StringBuilder (na ta način bo program mnogo hitrejši!)
    StringBuilder rezultat = new StringBuilder();
    // String rezultat = "";
    
    for (int i = 0; i < vsebina.length(); i++) {
      // crke zakodiramo eno za drugo, za vsako uporabimo drug znak kljuca; 
      char zV = vsebina.charAt(i);
      
      // ker je kljuc (skoraj gotovo) krajsi od vsebine, ne morem vzeti 
      // i-tega znaka, pač pa jemljem (i%kljuc.length())-ti znak
      char zK = kljuc.charAt(i % kljuc.length()); 
      char kodirano = (char) (zV ^ zK); // "zakodiram" z operacijo XOR                                         
      rezultat.append(kodirano);
      //rezultat += kodirano;
    }
    
    return rezultat.toString();
  }

  /**
   * Metoda <b>zakodira</b> prejeto vsebino (Base64) in vrne zakodirano vsebino. 
   * @param vsebina vsebina, ki jo metoda kodira
   * @return vrne zakodirano vsebino
   */
  static String kodirajB64(String vsebina) {    
    // uporabim metodo encodeBase64 iz razreda org.apache.commons.codec.binary.Base64
    return new String(Base64.encodeBase64(vsebina.getBytes()));
  }
    
  /**
   * Metoda odkodira vsebino (metoda NUM) in vrne originalno vsebino.
   * Primer: "65 66 67" -> "ABC"
   * @param vsebina zakodirana vsebina
   * @return odkodirana vsebina
   */
  static String odkodirajNUM(String vsebina) {
    String novaVsebina = "";
    String [] deli = vsebina.split(" ");//  "65 66 67" -> {"65", "66", "67"}
    for (int i = 0; i < deli.length; i++) {
      int s = Integer.parseInt(deli[i]); // "65" -> 65
      novaVsebina += String.format("%c", (char) s);
    }    
    return novaVsebina;
  }

  /**
   * Metoda odkodira vsebino (metoda XOR) in vrne originalno vsebino.
   * @param vsebina zakodirana vsebina
   * @param kljuc kljuc, ki se uporabi pri odkodiranju z metodo XOR
   * @return odkodirana vsebina
   */  
  static String odkodirajXOR(String vsebina, String kljuc) {
    // ker je operacije XOR sama sebi inverzna, odkodiram tako, da še
    // enkrat kličem isto operacijo (code(code(vsebine))==vsebina!)
    return kodirajXOR(vsebina,kljuc);
  }

  /**
   * Metoda odkodira vsebino (metoda Base64) in vrne originalno vsebino.
   * @param vsebina zakodirana vsebina
   * @return odkodirana vsebina
   */    
  static String odkodirajB64(String vsebina) {
    // uporabim metodo decodeBase64 iz razreda org.apache.commons.codec.binary.Base64
    return new String(Base64.decodeBase64(vsebina));
  }

  
}
