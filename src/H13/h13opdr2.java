package H13;

import java.applet.Applet;
import java.awt.*;

public class h13opdr2 extends Applet{


    public void init(){
    }

    public void paint(Graphics graph){
        drawWall(graph, 6, 8);

        //kunnen we 1 baksteen tekenen

        //kunnen we van die enkele bakstenen een muur maken
    }


    public void drawBrick(Graphics g, int xCoord, int yCoord, int width, int height){
        g.setColor(Color.red);
        g.fillRect(xCoord, yCoord, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(xCoord, yCoord, width, height);
    }


    public void drawWall(Graphics graph, int widthWall, int widthHeight){
        int width = 50;
        int height = 20;
        int yCoord = 10;
        for (int vertical = 0; vertical < widthHeight; vertical++){
            for (int horizontal = 0; horizontal < widthWall; horizontal++){
                if (vertical % 2 == 0) {
                    drawBrick(graph, 10 + width * horizontal, yCoord, width, height);
                } else {
                    if (horizontal == 0 || horizontal == (widthWall - 1)){
                        if (horizontal == 0) {
                            drawBrick(graph, 10, yCoord, width / 2, height);
                        } else {
                            drawBrick(graph, 10 + width * horizontal - width / 2, yCoord, width, height);
                            drawBrick(graph, 10 + width * (horizontal + 1 )   - width / 2, yCoord, width / 2, height);
                        }

                    } else {
                        drawBrick(graph, 10 + width * horizontal - width / 2, yCoord, width, height);
                    }
                    //eerste keer en laatste keer
                    //moeten we halve maken
                }

            }
            yCoord += height;
        }


    }

}
