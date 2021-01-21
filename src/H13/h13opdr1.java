package H13;

import java.applet.Applet;
import java.awt.*;

public class h13opdr1 extends Applet {

    
    public void init(){
        System.out.println(add(8, 12));
    }
    public void paint(Graphics graph){

    }
    //wie amg de methode gebruiken -- wat krijg je terug van de methode -- naam van de methode -- (parameters -- datatype naam van de variabele)
    public int add (int numberOne, int numberTwo){
        //BODY => code die elke keer uitgevoerd wordt als je de methode aanroept
        int answer = numberOne + numberTwo;
        return answer;
    }

}