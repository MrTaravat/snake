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
public class marhale5 extends marhale3{
    Image imteleport;
     int deletteleport=0,timerteleport=0,randomteleport,teleport_x,teleport_y,teleport_xx,teleport_yy;
    void locateteleport() {
                  if(timerteleport>50){ 
                      deletteleport=0;
                       randomteleport=(int) (Math.random()*30)+1;   
                    if(randomteleport==5){
        int r = (int) (Math.random() * RAND_POSx);
        teleport_x = ((r * DOT_SIZE))+140;
        r = (int) (Math.random() * RAND_POSy);
        teleport_y= ((r * DOT_SIZE))+260;
                    timerteleport=0;
                    deletteleport=1;
                     r = (int) (Math.random() * RAND_POSx);
        teleport_xx = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        teleport_yy= ((r * DOT_SIZE))+260;
                     for(int i=0;i<d;i++){
    if((teleport_x==xmane[i] && teleport_y==ymane[i])){
                locateteleport();
                 }
                  if((teleport_xx==xmane[i]&&teleport_yy==ymane[i]))   {
                    locateteleport();
                  }
                    }
                  }
                   if(deletteleport==0){
                      teleport_x=90000;
                      teleport_y=90000;
                       teleport_xx=90000;
                      teleport_yy=90000;
                  }
    
    }}
    void checkteleport() {

        if ((x[0] == teleport_x) && (y[0] == teleport_y)) {
            x[0] = teleport_xx;
            y[0] = teleport_yy;
            deletteleport=0;
            locateteleport();
        }
        else if ((x[0] == teleport_xx) && (y[0] == teleport_yy)) {
            x[0] = teleport_x;
            y[0] = teleport_y;
            deletteleport=0;
            locateteleport();
        }
    }

    @Override
    void doDrawing(Graphics g) {
        super.doDrawing(g); //To change body of generated methods, choose Tools | Templates.
    g.drawImage(imteleport, teleport_x, teleport_y, this);
                g.drawImage(imteleport, teleport_xx, teleport_yy, this);
    }

    @Override
    void loadImages() {
        super.loadImages(); //To change body of generated methods, choose Tools | Templates.
     ImageIcon iteleport = new ImageIcon("src/resources/teleport.jpg");
               imteleport=iteleport.getImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if (inGame) {
checkmane();
            checkApple();
            checkCollision();
            move();
             timerteleport++;
                locateteleport();
            checkteleport();
        }

        repaint();
        
    }
    
}
