package predavanje03;

import java.util.Scanner;

/**
 * Program prebere ocene in izpiše njihovo povprečje. Ocene bere 
 * toliko časa, dokler uporabnik ne vpiše 0. 
 *  
 * @author tomaz
 */
public class Povprecje {
  public static void main(String[] args) {
    int n = 0;     // stevilo vpisanih ocen
    int vsota = 0; // vsota do sedaj vpisanih ocen
    
    // trenutna ocena, ki je vpiše uporabnik
    int vpisanaOcena=-1; // na zacetku nastavim na karkoli, kar je različno od 0
    
    // "bralnik" tipkovnice
    Scanner sc = new Scanner(System.in);
    
    // izvajam zanko, dokler uporabnik ne bo vpisal 0
    while (vpisanaOcena != 0) {  
      System.out.print("Vpisi ocen: ");
      vpisanaOcena = sc.nextInt();
      
      // ce je vpisana ocena != 0, jo prištejem vsoti in povečam števec
      if (vpisanaOcena != 0) {
        vsota = vsota + vpisanaOcena;   // vsota += vpisanaOcena;
        n     = n + 1;                  // n++;
      }
    }
    
    // če je uporabnik takoj na začetku vpisal 0 (torej ni 
    // vpisal nobene ocene), izpišem le spodnje besedilo...
    if (n==0) {
      System.out.println("Nisi vpisal nobene ocene. Tudi prav!");
    } else { // ... sicer pa izpisem povprecje
      
      // double povprecje = vsota / n;  // celostevilsko deljenje ... NOK
      //double povprecje = 1.0*vsota / n;  // realno deljenje ... OK
      double povprecje = (double) vsota / n;  // realno deljenje ... OK

    
      System.out.printf("Povprecje ocen: %.2f\n", povprecje);
    }
  }

}
