package h02;

import java.applet.Applet;
import java.awt.*;

public class NaamKleur extends Applet {

    public void init() {
        setSize(500, 500);
        setBackground(Color.BLUE);
    }

    public void paint(Graphics g) {
        getGraphics().setColor(Color.YELLOW);
        getGraphics().drawString("Emma",50, 50);
    }
}