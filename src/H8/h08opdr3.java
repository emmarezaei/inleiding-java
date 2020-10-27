package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08opdr3 extends Applet {
    TextField tekstvak;
    int getal;
    Button knop;
    Label label;
    int uitkomst;


    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        knop = new Button("Ok");
        add(knop);
        label = new Label("");
        add(label);
        knop.addActionListener(new h08opdr3.KnopListener());


    }

    public void paint(Graphics g) {
        setSize(700,600);
        g.drawString("Type een prijs in " +
                "en klik daarna op 'Ok', de prijs word laten zien inclusief BTW.", 20, 20 );
        g.drawString("Uitkomst: €" + uitkomst, 20, 100);
        tekstvak.setLocation(20, 40);
        knop.setLocation(195,39);

    }

    class KnopListener implements ActionListener	{
        public void actionPerformed(ActionEvent e) {
            int getalTekstvak1 = Integer.parseInt(tekstvak.getText());
            getal = getalTekstvak1 / 100 * 21 + getalTekstvak1;
            uitkomst = getal;
            repaint();
        }
    }
}