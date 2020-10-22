package H5;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

        //lijn
        g.drawLine(100, 80,20+breedte,80);
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        //ovaal
        g.setColor(lijnkleur);
        g.drawOval(525, 100, breedte, hoogte);
        //cirkel
        g.setColor(lijnkleur);
        g.drawOval(575, 225, hoogte, hoogte);
    }

}
