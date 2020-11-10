package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setSize(600,500);
        int teller = 10;
        int y = 0;

        while(teller <= 20) {
            y += 20;
            g.drawString("" + teller, 20, y );
            teller++;
        }
    }
}
