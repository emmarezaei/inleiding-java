package H11;

import java.applet.Applet;
import java.awt.*;

public class h11opdr4 extends Applet {


    public void init(){
    }


    public void paint(Graphics g){
        setSize(600, 500);
        int y = 20;
        int tafel = 3;
        for(int teller = 1; teller <= 12; teller++){
            int answer = tafel * teller;
            g.drawString("3x" + teller + " = " + answer, 20,y);
            y += 20;
        }
     }
}
