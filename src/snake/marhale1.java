/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

/**
 *
 * @author mamad
 */
public class marhale1 extends boardasli{
     void checkCollision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }
    if (y[0] >= 640) {
            y[0]=260;
        }

        if (y[0] < 260) {
            y[0]=640;
        }

        if (x[0] >= 1240) {
            x[0]=140;
        }

        if (x[0] < 140) {
            x[0]=1240;
        }
        
        if (!inGame) {
            timer.stop();
        }
    
}
}
