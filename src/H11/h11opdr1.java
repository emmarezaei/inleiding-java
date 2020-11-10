package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller = 0; teller <= 10; teller++) {
            x += 17;
            g.drawLine(x , 30, x, 230 );
            g.drawString("" + teller, x, 20);
        }
    }
}