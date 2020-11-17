package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr7 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setSize(800,800);
        int teller;
        int xAxis = 350, yAxis = 350, x2, y2;
        int width = 5, height = 5;
        for (teller = 0; teller < 50; teller++) {
            xAxis -= 5;
            yAxis -= 5;
            width += 10;
            height += 10;
            x2 = 1000;
            y2 = 1000;
            g.drawRoundRect(xAxis, yAxis, width, height, x2, y2);
        }
    }
}
