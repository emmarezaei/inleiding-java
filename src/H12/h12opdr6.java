package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h12opdr6 extends Applet {
    TextField tekstvak;
    Button knop;
    int[] numbers;
    String text = "";
    int teller;

    public void init(){
        tekstvak = new TextField("", 20);
        add (tekstvak);
        knop = new Button("OK!");
        add (knop);
        knop.addActionListener(new h12opdr6.KnopListener());
        teller = 0;
        numbers = new int[15];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 7;
        numbers[3] = 4;
        numbers[4] = 7;
        numbers[5] = 8;
        numbers[6] = 1;
        numbers[7] = 9;
        numbers[8] = 5;
        numbers[9] = 4;
        numbers[10] = 7;
        numbers[11] = 1;
        numbers[12] = 2;
        numbers[13] = 2;
        numbers[14] = 4;
    }

    public void paint (Graphics graph){
        graph.drawString(text, 50, 50);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller = 0;
            String input = tekstvak.getText();
            int inputAsInt = Integer.parseInt(input);
            for (int indexNumber = 0; indexNumber < numbers.length; indexNumber++){
                if (numbers[indexNumber] == inputAsInt){
                    teller++;
                }
                text = "Het nummer is: " + input + " Het nummer is zo vaak gevonden: " + teller;
                repaint();
            }
        }
    }
}