package H12;

import java.applet.Applet;

public class h12opdr1 extends Applet {
int[] arrayOne;


    public void init(){
        arrayOne = new int[10];
        arrayOne[0] = 10;
        arrayOne[1] = 17;
        arrayOne[2] = 23;
        arrayOne[3] = 33;
        arrayOne[4] = 44;
        arrayOne[5] = 48;
        arrayOne[6] = 52;
        arrayOne[7] = 68;
        arrayOne[8] = 73;
        arrayOne[9] = 88;
        int sum = 0;
        for (int indexNumber = 0; indexNumber < arrayOne.length; indexNumber++){
            sum = sum + arrayOne[indexNumber];
        }
        System.out.println(sum / arrayOne.length);
    }

}
