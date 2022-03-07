package predavanje04;

/**
 *
 * @author tomaz
 */
public class Biti {
  // poštejem število priganih bitov 
  // brez uporabe bitnih operatorjev
  static int steviloBitovM(int x) {
    int stB = 0;
    while (x > 0) {
      if (x % 2 == 1) {
        stB += 1;
      }
      x = x / 2;  
    }
    return stB;
  }
   // poštejem število priganih bitov 
  // z uporabo bitnih operatorjev
  static int steviloBitovB(int x) {
    int stB = 0;
    while (x > 0) {
      if ((x & 1) == 1) {
        stB += 1;
      }
      // lahko tudi takole: 
      // stB+=(x & 1);
      
      x = x >> 1;
    }
    return stB;
  }
  
  public static void main(String[] args) {
    int a = 11;
    System.out.printf("Stevilo bitov v steilu %d je %d\n",
            a, steviloBitovB(a)); 
  }

}
