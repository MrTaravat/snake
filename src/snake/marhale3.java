/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.ImageIcon;

/**
 *
 * @author mamad
 */
public class marhale3 extends boardasli{
    File mane1fail = new File("mane1.txt");
     int [] xmane= new int[B_WIDTH];
     int [] ymane= new int[B_WIDTH];
     String stmane;
     String [] armane=new String[2];
      int d=0;
      Image imdivar;
    public marhale3(){
        mane();
              }

    @Override
    void loadImages() {
        super.loadImages(); //To change body of generated methods, choose Tools | Templates.
        ImageIcon idivar = new ImageIcon("src/resources/wall.jpg");
                imdivar=idivar.getImage();
    }

    @Override
    void doDrawing(Graphics g) {
        super.doDrawing(g); //To change body of generated methods, choose Tools | Templates.
         for(int i=0;i<d;i++){
                g.drawImage(imdivar,xmane[i] , ymane[i], this);
                 }
    }
     void checkmane() {
for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i] ){
            inGame=false;
            break;
        }
                 }
}

    @Override
    public void actionPerformed(ActionEvent e) {
     
      if (inGame) {
checkmane();
            checkApple();
            checkCollision();
            move();
        }

        repaint();
        
    }
     void mane(){
                try {
           BufferedReader   buffer = new BufferedReader(new FileReader(mane1fail));
              stmane=buffer.readLine();
             for(int i=0;stmane!="\n";i++){
                 armane=stmane.split("#");
                 xmane[i]=Integer.parseInt(armane[0]);
             ymane[i]=Integer.parseInt(armane[1]);
             d++;
                  stmane=buffer.readLine();
             }
         } catch (Exception ex) {
            
         }

     }

    @Override
    void locateApple() {
        super.locateApple(); //To change body of generated methods, choose Tools | Templates.
         for(int i=0;i<d;i++){
    if(apple_x==xmane[i] && apple_y==ymane[i]){
                locateApple();
                 }}
    }
     
    }

