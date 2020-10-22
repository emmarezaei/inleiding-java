package h06;

import java.awt.*;
import java.applet.*;

public class h06p1 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 40);
        g.drawString("Jeannette: " + uitkomst, 20, 60);
        g.drawString("Ik: " + uitkomst, 20, 80);
    }
}

