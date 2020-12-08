package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h12opdr5 extends Applet {
    TextField tekstvak;
    Button knop;
    int[] numbers;
    String text = "";

    public void init(){
        tekstvak = new TextField("", 20);
        add (tekstvak);
        knop = new Button("OK!");
        add (knop);
        knop.addActionListener(new h12opdr5.KnopListener());
        numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 8;
        numbers[2] = 1;
        numbers[3] = 17;
        numbers[4] = 23;

    }

    public void paint (Graphics graph){
        graph.drawString(text, 50, 50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = tekstvak.getText();
            int inputAsInt = Integer.parseInt(input);
            text = "Het nummer is niet gevonden";
            for (int indexNumber = 0; indexNumber < numbers.length; indexNumber++){
                if (numbers[indexNumber] == inputAsInt){
                    text = "Het nummer is gevonden!!! " + indexNumber;
                    break;
                }
                repaint();
            }
        }
    }
}
