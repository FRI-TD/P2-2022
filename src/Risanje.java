import java.awt.*;
import java.util.Date;

// Opomba: razred Risanje se nahaja v privzetem paketu (torej NI v paketu, nahaja se kar v korenskem 
// direktoriju projekta), saj sicer knjižnica stdlib.jar ne dela. Če želite razred zapisati v kak drug 
// paket (recimo v predavanja06), morate namesto stdlib.jar uporabiti knjižnico algs4.jar 
// (obe knjižnici sta dostopni na eUčilnici). 

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

    static void nRoza(int n){
        StdDraw.setScale(-100,100);

        double kot = 2 * Math.PI  / n ;
        double trX = 0;
        double trY = 0;
        double trKot = 0;
        double d = 20;

        for(int j=0; j<n; j++) {
            for (int i = 0; i < n; i++) {
                double nX = trX + (i < n - 1 ? d : 3 * d) * Math.cos(trKot);
                double nY = trY + (i < n - 1 ? d : 3 * d) * Math.sin(trKot);

                StdDraw.line(trX, trY, nX, nY);
                StdDraw.pause(100);
                if (i < n-1)
                  trKot = trKot + kot;
                trX = nX;
                trY = nY;
            }
        }

    }

    static void spirala() {
        StdDraw.setScale(-100,100);

       double fi = 0;
       double r  = 1;

       double deltaFi = 5 * 2*Math.PI / 360;
       double deltaR = 1.01;

       double trX = 0;
       double trY = 0;

       for (int i=0; i<1000; i++) {
           double nX = Math.cos(fi)*r;
           double nY = Math.sin(fi)*r;
           StdDraw.line(trX, trY, nX, nY);

           fi = fi + deltaFi;
           r  = r  * deltaR;

           trX = nX; trY = nY;
       }
    }

    static void fri() {
        StdDraw.setScale(0,100);
        StdDraw.enableDoubleBuffering();

        for (int i = 0; i < 1000 ; i++) {
            StdDraw.clear();
            StdDraw.text(i/10.0, 50, "FRI");

            StdDraw.show();

        }
    }

    static void kazalec(double kot, double dolzina, double debelina) {
        StdDraw.setPenRadius(debelina);
        kot = 90 - kot;

        StdDraw.line(0,0, dolzina * Math.cos(2*Math.PI*kot/360), dolzina * Math.sin(2*Math.PI*kot/360));
    }

    static void radar() {
        StdDraw.setScale(-100,100);
        StdDraw.enableDoubleBuffering();
        double kot = 0;
        while (true) {
            StdDraw.clear(Color.black);

            StdDraw.setPenColor(Color.green);
            kazalec(kot, 80, 0.01);
            kot = kot + 1;

            StdDraw.show();
            StdDraw.pause(1000);
        }
    }

    static void ura() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("hh:mm:ss");

        StdDraw.setScale(-100,100);

        StdDraw.enableDoubleBuffering();
        while (true) {
            StdDraw.clear();
            String ura = sdf.format(new Date());

            String[] uraDeli = ura.split(":");
            int hh = Integer.parseInt(uraDeli[0]) % 12;  // 0, 1, 2, ... 11
            int mm = Integer.parseInt(uraDeli[1]);
            int ss = Integer.parseInt(uraDeli[2]);

            for (int i=0; i<12; i++) {
                double kot = (90 - i*30)*(2*Math.PI/360);
                double x = 93*Math.cos(kot);
                double y = 93*Math.sin(kot);
                StdDraw.text(x,y, Integer.toString(i == 0 ? 12 : i));

                StdDraw.setPenRadius(0.03);
                StdDraw.line(80*Math.cos(kot), 80*Math.sin(kot), 85*Math.cos(kot), 85*Math.sin(kot));

            }

            for (int i=0; i<60; i++) {
                double kot = (90 - i*6)*(2*Math.PI/360);
                StdDraw.setPenRadius(0.005);
                StdDraw.line(82*Math.cos(kot), 82*Math.sin(kot), 85*Math.cos(kot), 85*Math.sin(kot));
            }

            kazalec(hh * 30, 70, 0.03);
            kazalec(mm * 6, 80, 0.02);
            kazalec(ss * 6, 85, 0.01);


            StdDraw.text(-80, 90, ura);

            StdDraw.show();
            StdDraw.pause(1000);
        }
    }

    public static void main(String[] args) {
        ura();
    }
}
