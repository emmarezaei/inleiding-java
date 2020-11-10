package H10;

    import java.awt.*;
    import java.applet.*;
    import java.awt.event.*;

    public class h10opdr2 extends Applet {
        TextField tekstvak;
        Label label;
        String tekst, tekst2, s;
        int getal, hoogsteGetal, laagsteGetal;

        public void init() {
            tekstvak = new TextField("", 20);
            add(tekstvak);
            label = new Label("Type een getal in en klik daarna op enter, hij laat steeds het hoogste getal zien.");
            add(label);
            tekstvak.addActionListener( new h10opdr2.TekstvakListener() );
            tekst = "";
            tekst2 = "";
            hoogsteGetal = 0;
            laagsteGetal = hoogsteGetal;
        }


        public void paint(Graphics g) {
            setSize(600,500);
            g.drawString(tekst, 20, 100);
            g.drawString(tekst2, 20, 120);
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
                else if (getal<hoogsteGetal){
                    laagsteGetal = getal;
                }
                tekst = "Het hoogste getal is: " + hoogsteGetal;
                tekst2 = "Het laagste getal is: " + laagsteGetal;
                tekstvak.setText("");
                repaint();
                }
            }
        }