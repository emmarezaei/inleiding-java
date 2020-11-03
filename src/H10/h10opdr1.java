package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h10opdr1 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst, s;
    int getal, hoogsteGetal;

    public void init() {
        tekstvak = new TextField("", 20);
        add(tekstvak);
        label = new Label("Type een getal in en klik daarna op enter, hij laat steeds het hoogste getal zien.");
        add(label);
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        hoogsteGetal = 0;
    }
    public void paint(Graphics g) {
        setSize(600,500);
        g.drawString(tekst, 20, 100);
        tekstvak.setLocation(20,50);
        label.setLocation(20,20);

    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            if (getal>hoogsteGetal){
                hoogsteGetal = getal;
            }
            tekst = "Het hoogste getal is: " + hoogsteGetal;
            tekstvak.setText("");
            repaint();
        }
    }
}