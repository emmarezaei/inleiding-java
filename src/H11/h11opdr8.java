package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr8 extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        setSize(1100, 950);
        int teller;
        int x = 0, y = 0, x2, y2;
        for (teller = 0; teller < 100; teller++) {
            y += 10;
            x += 10;
            y2 = 10;
            x2 = 10;
            g.drawRoundRect(x2, y2, x, y, x, y);
        }
    }
}
