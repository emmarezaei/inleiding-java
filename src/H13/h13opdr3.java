package H13;

import H12.h12opdr6;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h13opdr3 extends Applet {
    Button steen, beton;
    boolean drawBrickWall = false;
    boolean drawConcreteWall = false;
    Color color;
    public void init(){
        steen = new Button("Steen");
        add(steen);
        beton = new Button("Beton");
        add(beton);
        steen.addActionListener(new StenenMuur());
        beton.addActionListener(new BetonnenMuur());
    }

    public void paint(Graphics graph){
        setSize(700,800);
        steen.setLocation(20, 20);
        beton.setLocation(70, 20);
        if (drawBrickWall){
            drawWall(graph, 6, 8, true);
        }
        if (drawConcreteWall){
            drawWall(graph, 6, 8, false);
        }

    }

    public void drawBrick(Graphics g, int xCoord, int yCoord, int width, int height){
        g.setColor(color);
        g.fillRect(xCoord, yCoord, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(xCoord, yCoord, width, height);
    }

    public void drawWall(Graphics graph, int widthWall, int widthHeight, boolean isBrickWall){
        int width, height;
        if (isBrickWall){
            color = Color.red;
            width = 50;
            height = 20;
        } else {
            color = Color.GRAY;
            width = 70;
            height = 40;
        }

        int yCoord = 50;
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
                }
            }
            yCoord += height;
        }
    }

    class StenenMuur implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            drawBrickWall = true;
            drawConcreteWall = false;
            repaint();
        }
    }
    class BetonnenMuur implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            drawConcreteWall = true;
            drawBrickWall = false;
            repaint();
        }
    }
}