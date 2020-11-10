package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10praktijk extends Applet {
    TextField tekstvak;
    Label label;
    String tekst;


    public void init() {
        tekstvak = new TextField("", 10);
        add(tekstvak);
        label = new Label("Voer je cijfer in om te weten of je een slecht , onvoldoende, matig voldoende of goed cijfer hebt.");
        add(label);
        tekstvak.addActionListener(new h10praktijk.TekstvakListener());
        tekst = "";
    }


    public void paint(Graphics g) {
        setSize(600, 500);
        g.drawString(tekst, 20, 120);
        tekstvak.setLocation(20, 60);
        label.setLocation(20, 20);
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();

            switch (userInput) {
                case "1": tekst = "Slecht";break;
                case "2": tekst = "Slecht";break;
                case "3": tekst = "Slecht";break;
                case "4": tekst = "Onvoldoende";break;
                case "5": tekst = "Matig";break;
                case "6": tekst = "Voldoende";break;
                case "7": tekst = "Voldoende";break;
                case "8": tekst = "Goed";break;
                case "9": tekst = "Goed";break;
                case "10": tekst = "Goed";break;
                default: tekst = "Kies een getal onder de 10.";
            }
            tekstvak.setText("");
            repaint();
        }
    }
}
