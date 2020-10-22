package h06;

import java.awt.*;
import java.applet.*;

public class h06p2 extends Applet {
    double a, b, c, uitkomst;
    int secondenInUur, secondenInDag, secondenInJaar;

    //a = 60 sec

    public void init() {
       int secondenInMinuut = 60; //1 minuut
        secondenInUur = 60 * secondenInMinuut; //60 * 60 = 3600
        System.out.println(secondenInUur);
        secondenInDag = 24 * secondenInUur;
        System.out.println(secondenInDag);
        secondenInJaar = 365 * secondenInDag;
        System.out.println(secondenInJaar);


    }


    public void paint(Graphics g) {
        g.drawString("Uitkomst seconden in een uur: " + secondenInUur, 20, 20);
        g.drawString("Uitkomst seconden in een dag: " + secondenInDag, 20, 40);
        g.drawString("Uitkomst seconden in een jaar: " + secondenInJaar, 20, 60);
    }
}
