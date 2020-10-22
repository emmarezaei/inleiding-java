package h06;

import java.awt.*;
import java.applet.*;

public class h06praktijk extends Applet {
    double a, b, c, uitkomst;

    int tijdelijkeUitkomst;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        tijdelijkeUitkomst = (int) ((a + b + c) / 3 * 100);
        uitkomst = (double) tijdelijkeUitkomst / 100;
    }

    public void paint(Graphics g) {
        g.drawString("Uitkomst: " + uitkomst, 20, 20);
    }
}
