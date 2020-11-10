package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setSize(600,500);
        int cijfer1;
        int cijfer2 = 1;
        int cijfer3;
        int x = 0;

        for (cijfer3 = 0; cijfer3 < 500; ){
            cijfer1 = cijfer2;
            cijfer2 = cijfer3;
            cijfer3 = cijfer1 + cijfer2;
            x += 20;

            g.drawString("" + cijfer3, 20, x);
        }
    }
}
