package predavanje08;

/**
 *
 * @author tomaz
 */
public class Studenti {

  static void s1() {
    String ime1, ime2, ime3;
    String id1, id2, id3;

    ime1 = "Lolek";
    id1 = "6300001";

    ime2 = "Bolek";
    id2 = "6300002";

    ime3 = "Plaček smuk";
    id3 = "6300003";
  }

  static void s2() {
    String[] imena = new String[3];
    String[] idji = new String[3];

    imena[0] = "Lolek";
    idji[0] = "6300001";

    imena[1] = "Bolek";
    idji[1] = "6300002";

    imena[2] = "Plaček smuk";
    idji[2] = "6300003";
  }
  
  static void s3() {
    Student s1 = new Student("Lolek", "6300001");
    s1.setIme("Lolek Plus");    
    s1.dodajOceno(10);
    s1.dodajOceno(9);
    
    
    Student s2 = new Student("Bolek", "6300002");
    s2.dodajOceno(8);
    s2.dodajOceno(7);

    Student s3 = new Student();
    s3.setIme("Palček Smuk");
    s3.setId("6300003");

    Student[] studenti = new Student[4];
    studenti[0] = s1;
    studenti[1] = s2;
    studenti[2] = s3;
    
    
    studenti[3] = new Student("Nodi","6300004");
    
    for (int i = 0; i < 4; i++) {
      System.out.printf(studenti[i].toString());
    }
    
  }

  public static void main(String[] args) {
    s3();
  }
}
