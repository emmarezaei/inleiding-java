package H12;

import java.applet.Applet;
import java.awt.*;

public class h12praktijk extends Applet {
    TextField tekstvak, tekstvak2;
    Button knop;


    public void init(){
       tekstvak = new TextField("", 20);
       add(tekstvak);
       tekstvak2 = new TextField("", 20);
       add(tekstvak2);
       knop = new Button("OK");
       add(knop);
    }

    public void paint(Graphics g){

    }
}
