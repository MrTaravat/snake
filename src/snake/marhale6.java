/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author mamad
 */
public class marhale6 extends marhale5{
    
      int deletsuperapple=0,timersuperapple=0,randomsuperapple,superapple_x,superapple_y;
Image imsuperapple;
    @Override
    void loadImages() {
        super.loadImages(); //To change body of generated methods, choose Tools | Templates.
        ImageIcon isuperapple = new ImageIcon("src/resources/super apple.jpg");
              imsuperapple=isuperapple.getImage();
    }

    @Override
    void doDrawing(Graphics g) {
        super.doDrawing(g); //To change body of generated methods, choose Tools | Templates.
         g.drawImage(imsuperapple, superapple_x, superapple_y, this);
    }
    void checksuperApple() {

        if ((x[0] == superapple_x) && (y[0] == superapple_y)) {
            playapple();
            point+=20;
            dots=dots+2;
            deletsuperapple=0;
            locatesuperapple();
        }
    }
    void locatesuperapple() {
                  if(timersuperapple>50){ 
                      deletsuperapple=0;
                       randomsuperapple=(int) (Math.random()*30)+1;
                      
                    if(randomsuperapple==5){
        int r = (int) (Math.random() * RAND_POSx);
        superapple_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        superapple_y = ((r * DOT_SIZE))+260;
                    timersuperapple=0;
                    deletsuperapple=1;}
                  }
                   if(deletsuperapple==0){
                      superapple_x=90000;
                      superapple_y=90000;
                  }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //super.actionPerformed(e); //To change body of generated methods, choose Tools | Templates.
         if (inGame) {
checkmane();
            checkApple();
            checkCollision();
            move();
             timersuperapple++;
                locatesuperapple();
            checksuperApple();
             timerteleport++;
                locateteleport();
            checkteleport();
        }

        repaint();
        
    }
}
