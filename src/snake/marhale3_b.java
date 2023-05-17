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
public class marhale3_b extends marhale3{

    @Override
    void mane() {
        d=40;
        for(int i=0;i<=40;i=i+5){  
        int r = (int) (Math.random() * RAND_POSx);
       xmane[i]  = ((r * DOT_SIZE))+140;
         r = (int) (Math.random() * RAND_POSy);
        ymane[i] = ((r * DOT_SIZE))+260;
        if(i<=20){
             int f=1;
       for(int d=20;d<=60;d=d+20){
           if(xmane[i]>=1200)
               break;
           xmane[i+f]=xmane[i]+d;
            ymane[i+f]=ymane[i];
            f++;
      }}
          if(i>20){
             int f=1;
       for(int d=20;d<=60;d=d+20){
          if(ymane[i]>=600)
              break;
           xmane[i+f]=xmane[i];
            ymane[i+f]=ymane[i]+d;
            f++;
      }}
        }

    }
    
    
}
