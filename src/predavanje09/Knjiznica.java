package predavanje09;

/**
 *
 * @author tomaz
 */
public class Knjiznica {
  
  public static void main(String[] args) {
    // tabela knjig; v njej bodo StrokovneKnjige in Leposlovje
    int stKnjig = 0;
    Knjiga[] knjige = new Knjiga[10];

    // v tabelo dodam StrokovnoKnjigo
    knjige[stKnjig++] = new StrokovnaKnjiga("Goslig", "The Java programming language", 2010, "array:30;boolean:24;char:25;");    
   
    // ustvarim Leposlovje (definiram avtor, naslov, letoIzdaje in dve mnenji) ...
    Leposlovje k = new Leposlovje("France Bevk", "Pastirci", 2010);
    k.dodajMnenje("Super knjiga");
    k.dodajMnenje("Full brez veze. Nč ne dogaja");
    // ... in ga zapišem v tabelo
    knjige[stKnjig++] = k;
    
    // "sprehod" čez tabelo in izpis vseh knjig, ki so tipa "Leposlovje"
    for (int i = 0; i < stKnjig; i++) {
      if (knjige[i] instanceof Leposlovje)
        knjige[i].izpisi();
    }
    
    
    // če ustvarim Leposlovje in ga shranim v spremenljivko tipa Knjiga, ...
    Knjiga k1 = new  Leposlovje("France Bevk", "Pastirci", 2010);
    // ... moram pred dostopom do lastnosti, ki niso del knjige (na primer
    //     metoda dodajMnenje()) uporabiti "typecast", takole: 
    ((Leposlovje)k1).dodajMnenje("Super knjiga");   
    k1.izpisi();
  }

}
