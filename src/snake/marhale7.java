/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Math.abs;

/**
 *
 * @author mamad
 */
public class marhale7 extends marhale3{
    int xmouse=260,ymouse=260;
    int kk=1;

    @Override
    void initBoard() {
         addMouseListener(new TAdapter2());
          setFocusable(true);

       setPreferredSize(new Dimension(1360, 740));
        loadImages();
        initGame();
    }
     void movemousex() {
              if(x[0]!=xmouse  && kk==1){
       
             int x_x=abs(x[0]-DOT_SIZE);
             int x_xx=abs(x[0]+DOT_SIZE);
             if(abs((xmouse-x_xx))<abs((xmouse-x_x))){     
                  for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];}
                  x[0] += DOT_SIZE;
                       for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i]){
 y[0]+=DOT_SIZE;
        x[0]-=DOT_SIZE;
              break;}}
             }
              if(abs((xmouse-x_xx))>abs((xmouse-x_x))) {
                   for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];}
                   x[0] -= DOT_SIZE;
                      for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i]){
 y[0]-=DOT_SIZE;
        x[0]+=DOT_SIZE;
        break;}
                      }}}else{
                 
            movemousey();
        }
     }
     void movemousey() {        
             int y_y=abs(y[0]-DOT_SIZE);
             int y_yy=abs(y[0]+DOT_SIZE);
             if(abs((ymouse-y_yy))<abs((ymouse-y_y))){       
                   for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];}
                    y[0] += DOT_SIZE;
             for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i]){
        y[0]-=DOT_SIZE;
 x[0]+=DOT_SIZE;
  kk=2;
        break;
    }else{
    }}
             }
             else if(abs((ymouse-y_yy))>abs((ymouse-y_y))) {
                 
                   for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];}
                   y[0] -= DOT_SIZE;
             for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i]){
        y[0]+=DOT_SIZE;
 x[0]-=DOT_SIZE;
   kk=2;

        break;
    }}    
         }
         
         if(ymouse==y[0]){
             kk=1;
         }
     }

    @Override
    public void actionPerformed(ActionEvent e) {
     
      if (inGame) {
checkmane();
            checkApple();
            checkCollision();
            movemousex();
        }

        repaint();
        
    }
     class TAdapter2 implements MouseListener{
            @Override
        public void mouseClicked(MouseEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            xmouse=(e.getX()/DOT_SIZE)*DOT_SIZE;
            ymouse=(e.getY()/DOT_SIZE)*DOT_SIZE;
             System.out.println(xmouse+"  szfz    "+ymouse);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
       }

}
