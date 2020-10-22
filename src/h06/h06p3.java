package h06;

import java.awt.*;
import java.applet.*;

public class h06p3 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;

    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst: " + uitkomst, 20, 20);
    }
}
