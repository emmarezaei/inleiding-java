package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h10opdr4 extends Applet {
    TextField tekstvak, tekstvak2;
    Label label, label2, label3;
    String tekst;
    int jaartal;


    public void init() {
        tekstvak = new TextField("",10);
        add(tekstvak);
        tekstvak2 = new TextField("",10);
        add(tekstvak2);
        label = new Label("Vul een maand (1 - 12) en een jaartal.");
        add(label);
        label2 = new Label("Maand: ");
        add(label2);
        label3 = new Label("Jaartal: ");
        add(label3);
        tekstvak.addActionListener( new h10opdr4.TekstvakListener() );
        tekst = "";
        tekstvak2.addActionListener( new h10opdr4.TekstvakListener() );
        tekst = "";
    }


    public void paint(Graphics g) {
        setSize(600,500);
        g.drawString(tekst, 20, 130);
        tekstvak.setLocation(20,80);
        tekstvak2.setLocation(150,80);
        label.setLocation(20,20);
        label2.setLocation(20,50);
        label3.setLocation(150,50);
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


            String userInput2 = tekstvak2.getText();
            jaartal = Integer.parseInt(userInput2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                int temp = Integer.parseInt(userInput);
                if(tekstvak.getText() == "2"){
                    tekst = "Februari: 29 dagen";
                } else if (temp == 2){
                    tekst = "Februari: 29 dagen";
                }
            }


            tekstvak.setText("");
            tekstvak2.setText("");
            repaint();

        }
    }
}