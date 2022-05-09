import java.awt.Color;


abstract class Lik {
  double x, y;
  Color barva;

  public Lik(double x, double y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
  }
 
  abstract void narisi();
  
  void premakni(double delatX, double delatY) {
    x += delatX;
    y += delatY;
  }
}

class Krog extends Lik {
  double r; // polmer

  public Krog(double x, double y, double r, Color barva) {
    super(x, y, barva);
    this.r = r;
  }
  
  void narisi() {
    StdDraw.setPenColor(this.barva);
    StdDraw.filledCircle(x, y, r);
  }
}

class Pravokotnik extends Lik {
  double a, b;

  public Pravokotnik(double x, double y, double a, double b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(barva);
    StdDraw.filledRectangle(x, y, a, b);
  }
  
  
  
}

/**
 *
 * @author tomaz
 */
public class Liki {
  
  public static void main(String[] args) {
    int stLikov = 0;
    Lik[] liki = new Lik[10];
    
    StdDraw.setScale(-100,100);
    
    liki[stLikov++] = new Krog(0,0,30, Color.red);
    liki[stLikov++] = new Krog(30,30,20, Color.yellow);
    liki[stLikov++] = new Pravokotnik(-10,-50,30,40, Color.blue);
    
    for (int i = 0; i < stLikov; i++) {
      liki[i].narisi();
      
    }
    
  }

}
