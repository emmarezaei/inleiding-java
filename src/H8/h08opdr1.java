package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h08opdr1 extends Applet {
    TextField tekstvak, tekstvak2;
    Button knop, knop2;
    Label label;


    public void init() {
        tekstvak = new TextField("", 30);
        add(tekstvak);
        tekstvak2 = new TextField("", 30);
        add(tekstvak2);
        knop = new Button("Ok");
        add(knop);
        knop2 = new Button("Reset");
        add(knop2);
        label = new Label("");
        add(label);
        knop.addActionListener( new KnopListener() );
        knop2.addActionListener( new KnopListener2() );



    }

    public void paint(Graphics g) {
        tekstvak.setLocation(20, 40);
        tekstvak2.setLocation(20, 80);
        g.drawString("Type iets in het tekstvakje " +
                "en klik daarna op 'Ok'.", 20, 20 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed(ActionEvent e) {
            String message = tekstvak.getText();
            tekstvak2.setText(message);
            repaint();
        }
    }
    class KnopListener2 implements ActionListener   {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
}
