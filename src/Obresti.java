public class Obresti {
  
  public static void main(String[] args) {
  	double glavnica;      // deklaracija spremenljivke
  	glavnica = 1000;      // inicializacija spremenljivke

  	double obrestnaMera = 4.5;  // deklaracija + inicializacija

  	int n = 10; // stevilo let

  	double gN; // glavnica po n letih

  	// za izracun potence uporabim metodo Math.pow
  	gN = glavnica * Math.pow(1+obrestnaMera / 100, n);

  	// pri izpisu lahko "sestevam" niz in stevilo
  	System.out.println("Glavnica: " + glavnica);
  	System.out.println("Število let: " + n);
  	System.out.println("Obrestna mera: " + obrestnaMera);
  	System.out.println("Končni znesek: " + gN);
  }	
  
}