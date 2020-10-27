package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h08praktijk extends Applet {
    TextField tekstvak1, tekstvak2;
    Button knop, knop2, knop3, knop4;
    int uitkomst;

    int keer, gedeeltdoor, plus, min;

    public void init() {
        setSize(600, 500);
        tekstvak1 = new TextField("", 10);
        add(tekstvak1);
        tekstvak2 = new TextField("", 10);
        add(tekstvak2);
        knop = new Button();
        knop.setLabel("*");
        add(knop);
        knop2 = new Button();
        knop2.setLabel("/");
        add(knop2);
        knop3 = new Button();
        knop3.setLabel("+");
        add(knop3);
        knop4 = new Button();
        knop4.setLabel("-");
        add(knop4);
        knop.addActionListener(new KnopListener());
        knop2.addActionListener(new KnopListener2());
        knop3.addActionListener(new KnopListener3());
        knop4.addActionListener(new KnopListener4());
    }

    public void paint(Graphics g) {
        knop.setLocation(220, 20);
        knop2.setLocation(240, 20);
        knop3.setLocation(260, 20);
        knop4.setLocation(280, 20);
        tekstvak1.setLocation(20,20);
        tekstvak2.setLocation(120,20);
        g.drawString("Uitkomst: " + uitkomst, 20, 80);
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getalTekstvak1 = Integer.parseInt(tekstvak1.getText());
            int getalTekstvak2 = Integer.parseInt(tekstvak2.getText());
            keer = getalTekstvak1 * getalTekstvak2;
            uitkomst = keer;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          int getalTekstvak1 = Integer.parseInt(tekstvak1.getText());
            int getalTekstvak2 = Integer.parseInt(tekstvak2.getText());
            gedeeltdoor = getalTekstvak1 / getalTekstvak2;
            uitkomst = gedeeltdoor;
            repaint();
        }
    }
    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getalTekstvak1 = Integer.parseInt(tekstvak1.getText());
            int getalTekstvak2 = Integer.parseInt(tekstvak2.getText());
            plus = getalTekstvak1 + getalTekstvak2;
            uitkomst = plus;
            repaint();
        }
    }
    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getalTekstvak1 = Integer.parseInt(tekstvak1.getText());
            int getalTekstvak2 = Integer.parseInt(tekstvak2.getText());
            min = getalTekstvak1 - getalTekstvak2;
            uitkomst = min;
            repaint();
        }
    }

}
