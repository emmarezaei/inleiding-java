package H10;

    import java.awt.*;
    import java.applet.*;
    import java.awt.event.*;

    public class h10opdr5 extends Applet {
        TextField tekstvak;
        Label label;
        String s, tekst, tekst2;
        double cijfer, cijferuitkomst, voldoende, onvoldoende,  gemiddelde, som, totaalCijfers;


        public void init() {
            tekstvak = new TextField("", 10);
            add(tekstvak);
            tekstvak.addActionListener(new h10opdr5.TekstvakListener());
            label = new Label("Voer je cijfers een voor een in.");
            add(label);
            tekst = "";
            tekst2 = "";
            cijferuitkomst = 5.5;
            totaalCijfers = 0;
            gemiddelde = cijfer;
            }


        public void paint(Graphics g) {
            setSize(600,500);
            g.drawString(tekst,20, 100);
            g.drawString(tekst2, 20, 120);
            tekstvak.setLocation(20,50);
            label.setLocation(20,20);
            }


        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                cijfer = Double.parseDouble(s);
            if (cijfer < cijferuitkomst) {
                onvoldoende = cijfer;
                tekst = "Onvoldoende: " + onvoldoende;
            }

            else if (cijfer > cijferuitkomst) {
                voldoende = cijfer;
                tekst = "Voldoende: " + voldoende;
            }

            totaalCijfers = totaalCijfers + 1;
            som = som + cijfer;
            gemiddelde = som / totaalCijfers;
            int temp = (int) (gemiddelde * 10);
            gemiddelde = (double) temp / 10;
            tekst2 = "Gemiddelde: " + gemiddelde;
            tekstvak.setText("");
            repaint();
        }
    }
}
