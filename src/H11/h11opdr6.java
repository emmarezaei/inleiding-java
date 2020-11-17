package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int xAxis = 100, yAxis = 100, x2, y2;
        int width = 5, height = 5;
        for (teller = 0; teller < 5; teller++) {
            xAxis -= 5;
            yAxis -= 5;
            width += 10;
            height += 10;
            x2 = 100;
            y2 = 100;
            g.drawRoundRect(xAxis, yAxis, width, height, x2, y2);
        }
    }
}
