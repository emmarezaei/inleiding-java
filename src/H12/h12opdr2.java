package H12;

import java.applet.Applet;
import java.awt.*;

public class h12opdr2 extends Applet {
    Button[] knoppen = new Button[26];



    public void init() {
        for (int teller = 0; teller < 26; teller++) {
            knoppen[teller] = new Button("Knop" + teller);
            add(knoppen[teller]);
        }
    }


    public void paint(Graphics g) {

    }
}
