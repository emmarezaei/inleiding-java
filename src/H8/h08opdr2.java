package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08opdr2 extends Applet {
    Button knop, knop2, knop3, knop4;

    int vrouwelijkeOuders, mannelijkeOuders, vrouwelijkeLeerlingen, mannelijkeLeerlingen, totaal;


    public void init() {
        setSize(800, 800);
        knop = new Button();
        knop.setLabel("Vrouwelijke ouders");
        add(knop);
        knop2 = new Button();
        knop2.setLabel("Mannelijke ouders");
        add(knop2);
        knop3 = new Button();
        knop3.setLabel("Vrouwelijke leerlingen");
        add(knop3);
        knop4 = new Button();
        knop4.setLabel("Mannelijke leerlingen");
        add(knop4);
        knop.addActionListener(new h08opdr2.KnopListener());
        knop2.addActionListener(new h08opdr2.KnopListener2());
        knop3.addActionListener(new h08opdr2.KnopListener3());
        knop4.addActionListener(new h08opdr2.KnopListener4());
    }



    public void paint(Graphics g) {
        g.drawString("Klik op de knop waar jij bij hoort" +
                ", hij telt het totaal automatisch op.", 20, 20);
        g.drawString("Totaal: " + totaal, 20, 100);
        g.drawString("Vrouwelijke Ouders: " + vrouwelijkeOuders, 20, 120);
        g.drawString("Mannelijke ouders: " + mannelijkeOuders, 20, 140);
        g.drawString("Vrouwelijke leerlingen: " + vrouwelijkeLeerlingen, 20, 160);
        g.drawString("Mannelijke leerlingen: " + mannelijkeLeerlingen, 20, 180);
        knop.setLocation(20, 40);
        knop2.setLocation(160, 40);
        knop3.setLocation(300, 40);
        knop4.setLocation(460, 40);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwelijkeOuders = vrouwelijkeOuders + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannelijkeOuders = mannelijkeOuders + 1;
            totaal = totaal + 1;
            repaint();
        }
    }
    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwelijkeLeerlingen = vrouwelijkeLeerlingen + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannelijkeLeerlingen = mannelijkeLeerlingen + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

}