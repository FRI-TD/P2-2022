import java.awt.*;

public class Risanje {

    static void r1() {
        StdDraw.setScale(0,100);
        StdDraw.clear(Color.black);

        StdDraw.setPenColor(Color.yellow);
        for (int i = 0; i < 50; i++) {
            StdDraw.circle(50,50, i);
        }
    }

    static void r2() {
        StdDraw.setScale(0,250);
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25 ; j++) {
                StdDraw.setPenColor(new Color(i*10, 10*j, 0));
                StdDraw.filledRectangle(i*10+5, j*10+5, 10,10);
            }
        }
    }

    static void r3() {
        StdDraw.setScale(0,100);

        int[][] smeri = {{1,0}, {0,-1},{-1, 0},{0,1}};
        int trSmer = 0;
        int d=1;

        int x = 50; int y = 50;
        for (int i = 0; i < 100; i++) {
            int nX = x + d * smeri[trSmer][0];
            int nY = y + d * smeri[trSmer][1];

            StdDraw.line(x,y, nX, nY);

            d = d+1;
            x = nX; y = nY;
            trSmer = (trSmer + 1) % 4;
        }
    }

    public static void main(String[] args) {
       r3();
    }
}
