package predavanje10.podatki;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import predavanje10.Drzava;
import predavanje10.Drzave;

/**
 *
 * @author tomaz
 */
public class Medalje {
  
  static ArrayList<Sportnik> preberiSportnike(String imeDatoteke) {
    ArrayList<Sportnik> sportniki = new ArrayList<>();
    try (Scanner sc = new Scanner(new File(imeDatoteke))) {
      String prvaVrstica = sc.nextLine();
      while(sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        String[] deli  = vrstica.split(";");
        if (deli.length < 11) {System.out.println(vrstica);continue;}
        // No.;Athlete;Nation;Sport;Years;Games;Gender;Gold;Silver;Bronze;Total
        Spol spol   = deli[6].equals("F") ? Spol.Z : Spol.M;
        TipIger tip = deli[5].equals("winter") ? TipIger.ZIMSKE : TipIger.POLETNE;
        
        sportniki.add(new Sportnik(deli[1],spol, deli[2], deli[3], tip,Integer.parseInt(deli[10])));
      }
    } catch (Exception e) {
      System.out.println("Napaka pri branju: "+e.toString());      
    }   
    return sportniki;      
  }
  
  /**
   * Metoda medaljo vstavi na pravo mesto v seznam medalje. Če je po tem 
   * v seznamu več kot {@code koliko} medalj, vse odvečne pobriše.
   */
  static void dodajInObdrziNajboljse(ArrayList<Sportnik> sportniki, Sportnik sportnik, int koliko) {
    int kje = 0;
    while (kje < sportniki.size() &&  sportnik.getSteviloMedalj() < sportniki.get(kje).getSteviloMedalj()) 
        kje++;
    sportniki.add(kje, sportnik);  
    
    // Pobrišem še "odvečne". Vendar pozor: lahko imam več sportnikov z enakim številom medalj. 
    int stRazlicnih=1; //koliko različnih medalj že imam
    int doKje=1;  // indeks v tabeli
    while (doKje < sportniki.size() && stRazlicnih <= koliko) { // enacaj mora biti, sicer obdržim le enega iz zadnje skupine!
      if (sportniki.get(doKje).getSteviloMedalj() != sportniki.get(doKje-1).getSteviloMedalj()) stRazlicnih++;
      doKje++;
    }
    
    // zbral sem koliko skupin + enega sportnika, ki ga je treba odstraniti
    if (stRazlicnih>koliko) doKje--;
    
    while(sportniki.size() > doKje) sportniki.remove(sportniki.size()-1);
  }

  static void izpisNajboljsi() {
    ArrayList<Sportnik> sportniki = preberiSportnike("viri/medals.txt");

    
    ArrayList<Sportnik> najboljsi = new ArrayList<Sportnik>();
    for (Sportnik sportnik : sportniki) {
      if (sportnik.getSpol().equals(Spol.M))
        dodajInObdrziNajboljse(najboljsi, sportnik, 3);
    }
    for (Sportnik sportnik : najboljsi) {
      System.out.println(sportnik.getIme() + " - " + sportnik.getSteviloMedalj());
    }
    System.out.println("");      
  }   
  
  static void izpisSkupaj() {
    ArrayList<Sportnik> sportniki = preberiSportnike("viri/medals.txt");
    
    HashMap<String, Integer> medalje = new HashMap<>();
    for (Sportnik sportnik : sportniki) {
      String drzava = sportnik.getDrzava();
      if (medalje.containsKey(drzava))
        medalje.put(drzava, medalje.get(drzava)+sportnik.getSteviloMedalj());
      else 
        medalje.put(drzava, sportnik.getSteviloMedalj());
    }
    ArrayList<String> drzave = new ArrayList(medalje.keySet());
    drzave.sort(new Comparator<String>() {
      public int compare(String o1, String o2) {
        Integer m1 = medalje.get(o1);
        Integer m2 = medalje.get(o2);
        return m1-m2;
      }
    });
    for (String d : drzave) {
      System.out.printf("%5d %s\n", medalje.get(d), d);
    }    
  }
  
  static void izpisiNormirano() throws Exception {
    HashMap<String,Drzava> drzave = Drzave.preberiDrzave("viri/drzave.txt");    
    ArrayList<Sportnik> sportniki = preberiSportnike("viri/medals.txt");

    HashMap<String, DrzavaZMedaljami> drzaveZ = new HashMap<>();
    for (Sportnik sportnik : sportniki) {
      String kraticaDrzave = sportnik.getDrzava();
      Drzava drzava = drzave.get(kraticaDrzave);
      if (drzava == null) {
        System.out.println("Neznana drzava: " + kraticaDrzave);
      } else {
        DrzavaZMedaljami dz = drzaveZ.get(sportnik.getDrzava());
        if (dz==null) {
          dz = new DrzavaZMedaljami(drzava);
          drzaveZ.put(kraticaDrzave, dz);
        }
        dz.addMedalje(sportnik.getSteviloMedalj());
      }
    }
    
    ArrayList<DrzavaZMedaljami> dzsorted = new ArrayList(drzaveZ.values());
    Collections.sort(dzsorted);
    for (DrzavaZMedaljami dz : dzsorted) {
        System.out.println(dz);
    }
  }
  
  public static void main(String[] args) throws Exception {
    izpisiNormirano();
    izpisSkupaj();
  }
}
