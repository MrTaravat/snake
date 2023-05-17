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
public class marhale8 extends marhale7{

  
    void movemousex() {
                       if(x[0]!=xmouse  && kk==1){
                 if((abs(xmouse-x[0])>560)){
             int x_x=abs(x[0]-DOT_SIZE);
             int x_xx=abs(x[0]+DOT_SIZE);
             if(abs((xmouse-x_xx))<abs((xmouse-x_x))){     
                   for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];}
                    x[0] -= DOT_SIZE;
                  for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i]){
       y[0]-=DOT_SIZE;
        x[0]+=DOT_SIZE;
        break;
    }}     }
            else  if(abs((xmouse-x_xx))>abs((xmouse-x_x))) {      
                   for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];}
                   x[0] += DOT_SIZE;
                   for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i]){
 y[0]+=DOT_SIZE;
        x[0]-=DOT_SIZE;
        break;
    }}  
         }
         }else{  
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
                      }}}}else{
                 
            movemousey();
        }
    }
    
    void movemousey() {
         if((abs(ymouse-y[0])>200) ) {
             int y_y=abs(y[0]-DOT_SIZE);
             int y_yy=abs(y[0]+DOT_SIZE);
             if(abs((ymouse-y_yy))<abs((ymouse-y_y))){     
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
    }else{
        kk=1;
    }
             break;
             }
              if(abs((ymouse-y_yy))>abs((ymouse-y_y))) {
                 
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
        kk=1;
    }}
              } 
         }
         }else{         
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
         }
         if(ymouse==y[0]){
             kk=1;
         }}
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
