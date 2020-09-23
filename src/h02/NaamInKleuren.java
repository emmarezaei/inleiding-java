package h02;

import java.applet.Applet;
import java.awt.*;

public class NaamInKleuren extends Applet {

    public void init() {
        setSize(500,500);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        getGraphics().setColor(Color.BLUE);
        getGraphics().drawString("Emma",50, 50);
        getGraphics().setColor(Color.RED);
        getGraphics().drawString("Rezaei",50, 70);
    }
}
