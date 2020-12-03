package H11;

import H10.h10opdr3;

import java.applet.Applet;
import java.awt.*;

public class h11praktijk extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setSize(600,500);
        int y = 20;
        int tafel1 = 1;
        int tafel2 = 2;
        int tafel3 = 1;
        int tafel4 = 2;
        int tafel5 = 1;
        int tafel6 = 2;
        for(int teller = 1; teller <= 12; teller++){
            int answer = tafel1 * teller;
            g.drawString("1x" + teller + " = " + answer, 20,y);
            y += 20;
        }
        for(int teller = 1; teller <= 12; teller++){
            int answer = tafel2 * teller;
            g.drawString("2x" + teller + " = " + answer, 20,y);
            y += 20;
        }
    }
}
