package H12;

import H8.h08opdr3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class h12opdr3 extends Applet {
    //TextField tekst1, tekst2, tekst3, tekst4, tekst5;
    TextField[] tekstvakken = new TextField[5];
    Button knop;


    public void init(){
        for (int indexNumber = 0; indexNumber < tekstvakken.length; indexNumber++){
            tekstvakken[indexNumber] = new TextField("", 20);
            add(tekstvakken[indexNumber]);
        }
        knop = new Button("Oke!");
        add(knop);
        knop.addActionListener(new KnopListener());

    }

    public class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double[] userInput = new double[5];
            for (int indexNumber = 0; indexNumber < tekstvakken.length; indexNumber++){
                userInput[indexNumber] = Double.parseDouble(tekstvakken[indexNumber].getText());
                System.out.println(userInput[indexNumber]);
            }
            Arrays.sort(userInput);
            for (int indexNumber = 0; indexNumber < tekstvakken.length; indexNumber++){
                tekstvakken[indexNumber].setText(userInput[indexNumber] + "");
            }
        }
    }
}
