package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10opdr3 extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("",20);
        add(tekstvak);
        label = new Label("Kies een getal tussen 1 en 12.");
        add(label);
        tekstvak.addActionListener( new h10opdr3.TekstvakListener() );
        tekst = "";
    }


    public void paint(Graphics g) {
        setSize(600,500);
        g.drawString(tekst, 20, 100);
        tekstvak.setLocation(20,50);
        label.setLocation(20,20);
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();

            switch (userInput) {
                case "1": tekst = "Januari: 31 dagen"; break;
                case "2": tekst = "Februari: 28 dagen"; break;
                case "3": tekst = "Maart: 30 dagen"; break;
                case "4": tekst = "April: 31 dagen"; break;
                case "5": tekst = "Mei: 30 dagen"; break;
                case "6": tekst = "Juni: 31 dagen"; break;
                case "7": tekst = "Juli: 30 dagen"; break;
                case "8": tekst = "Augustus: 31 dagen"; break;
                case "9": tekst = "September: 30 dagen"; break;
                case "10": tekst = "Oktober: 31 dagen"; break;
                case "11": tekst = "November: 30 dagen"; break;
                case "12": tekst = "December: 31 dagen"; break;
                default: tekst = "...";
            }

            tekstvak.setText("");
            repaint();
        }
    }
}
