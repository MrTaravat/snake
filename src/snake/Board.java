package snake;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import static java.lang.Math.abs;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Board  extends JPanel  implements ActionListener  {
     int d=0;
     File accunt = new File("accunt.txt");
     final int B_WIDTH = 1390;
     final int B_HEIGHT = 780;
     final int DOT_SIZE = 20;
     final int ALL_DOTS = 900;
     final int RAND_POSx = 56;
     final int RAND_POSy = 18;
     int DELAY = 140;
     File selectfile = new File("select.txt");
     File mane1fail = new File("mane1.txt");
     File mane2fail = new File("mane2.txt");
     File mane3fail = new File("mane3.txt");
     String [] select=new String[22];
     String [] accunt_1=new String[3];
     int [] xmane= new int[B_WIDTH];
     int [] ymane= new int[B_WIDTH];
     String stmane;
     String [] armane=new String[2];
     int xmouse=260,ymouse=260;
     final int x[] = new int[ALL_DOTS];
     final int y[] = new int[ALL_DOTS];
     final int x2[] = new int[ALL_DOTS];
     final int y2[] = new int[ALL_DOTS];
     int dots,dots2;
     int apple_x, apple_y;
     int apple_xx, apple_yy;
     int apple_xxx, apple_yyy;
     int deletteleport=0,timerteleport=0,randomteleport,teleport_x,teleport_y,teleport_xx,teleport_yy;
     int deletheart=0,timerheart=0,randomheart,heart_x,heart_y,heartgame=0;
     int deletboomb=0,timerboomb=0,randomboomb,boomb_x,boomb_y;
     int deletcut=0,timercut=0,randomcut,cut_x,cut_y;
     int deletslow=0,timerslow=0,randomslow,slow_x,slow_y;
     int deletback=0,timerback=0,randomback,back_x,back_y;
     int deletfast=0,timerfast=0,randomfast,fast_x,fast_y;
     int delethummer=0,timerhummer=0,randomhummer,hummer_x,hummer_y,hummert=0;
     int point=0,point2=0;
     int deletsuperapple=0,timersuperapple=0,randomsuperapple,superapple_x,superapple_y;
     boolean leftDirection = false;
     boolean rightDirection = true;
     boolean upDirection = false;
     boolean downDirection = false;
      boolean leftDirection2 = false;
     boolean rightDirection2 = true;
     boolean upDirection2 = false;
     boolean downDirection2 = false;
     boolean inGame = true;
     boolean isonsound;
     boolean davaran;
     boolean mane1;
     boolean mane2;
     boolean mane3;
     boolean mane;
     boolean heart;
     boolean fast;
     boolean slow;
     boolean back;
     boolean backtrue;
     boolean superapple;
     boolean teleport;
     boolean hummer;
     boolean cut;
     boolean mouse;
     boolean dely;
     boolean boomb;
     boolean mousedavaran;
     boolean snake2;
     boolean snake;
     int intapple;
     int zarb=0,kk=1;
     Timer timer;
     Image ball;
     Image apple;
     Image head;
     Image imheart;
     Image imboomb;
     Image imback;
     Image imcut;
     Image imhummer;
     Image imfast;
     Image imslow;
     Image imteleport;
     Image imsuperapple;
     Image imdivar;
     Image dot2;
     Image head2;
     Image background;
     BufferedReader buffer;
     File accuntnow = new File("accuntnow.txt");
     BufferedReader bufferacc;
     String[][] accuntt =new String[100][3];
    public Board() {
       
          
        accuntnow.deleteOnExit();
         
         try {
             buffer = new BufferedReader(new FileReader(selectfile));
              bufferacc = new BufferedReader(new FileReader(accuntnow));
             for(int i=0;i<=21;i++){
             select[i]=buffer.readLine();
             }
             
              accunt_1 = bufferacc.readLine().split("#");
         } catch (Exception ex) {
             Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
         }
         
              if(select[0].equals("true")){
                  davaran=true;
              }
              if(select[1].equals("true")){
                  mane1=true;
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
              if(select[2].equals("true")){
                   mane2=true;
                  try {
          BufferedReader    buffer = new BufferedReader(new FileReader(mane2fail));
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
              if(select[3].equals("true")){
                 mane3=true;
                  try {
          BufferedReader    buffer = new BufferedReader(new FileReader(mane3fail));
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
              if(select[4].equals("true")){
                  mane=true;
                  manerandom();
                  System.out.println("1");
              }
              if(select[5].equals("true")){
                  heart=true;
              }
              if(select[6].equals("true")){
                  dely=true;
              }
              if(select[7].equals("true")){
                 hummer=true;
              }
              if(select[8].equals("true")){
                  boomb=true;
              }
              if(select[9].equals("true")){
                  slow=true;
              }
              if(select[10].equals("true")){
                  fast=true;
              }
              if(select[11].equals("true")){
                  back=true;
              }
              if(select[12].equals("true")){
                  teleport=true;
              }
              if(select[13].equals("true")){
                  superapple=true;
              }
              if(select[14].equals("true")){
                  cut=true; 
              }
               if(select[15].equals("true")){
                  mouse=true; 
              }if(select[16].equals("true")){
                  snake2=true; 
              }
              if(select[17].equals("true")){
                  mousedavaran=true; 
              }
              if(select[18].equals("true")){
                  isonsound=true; 
              }
              if(select[21].equals("true")){
                  snake=true; 
              }
           intapple=Integer.parseInt(select[20]);
           
                  
             
             initBoard();
        
         
    }
    
    
     void initBoard() {
if(mouse==false && mousedavaran==false){
        addKeyListener(new TAdapter());}
else{
    addMouseListener(new TAdapter2());
}
        setFocusable(true);

       setPreferredSize(new Dimension(1360, 740));
        loadImages();
        initGame();
    }

     void loadImages() {

        ImageIcon iid = new ImageIcon("src/resources/dot.jpg");
        ball = iid.getImage();
        ImageIcon idot = new ImageIcon("src/resources/dot2.jpg");
        dot2 = idot.getImage();
        ImageIcon ihead = new ImageIcon("src/resources/head2.jpg");
        head2 = ihead.getImage();
        ImageIcon img = new ImageIcon("6.jpg");
        background = img.getImage();
        ImageIcon iia = new ImageIcon("src/resources/apple.jpg");
        apple = iia.getImage();
        ImageIcon iih = new ImageIcon("src/resources/head.jpg");
        head = iih.getImage();
         ImageIcon iheart = new ImageIcon("src/resources/heart.jpg");
         imheart=iheart.getImage();
          ImageIcon iback = new ImageIcon("src/resources/change.jpg");
          imback=iback.getImage();
           ImageIcon islow = new ImageIcon("src/resources/slow.jpg");
           imslow=islow.getImage();
            ImageIcon ifast = new ImageIcon("src/resources/fast.jpg");
            imfast=ifast.getImage();
             ImageIcon icut = new ImageIcon("src/resources/cut.jpg");
             imcut=icut.getImage();
              ImageIcon isuperapple = new ImageIcon("src/resources/super apple.jpg");
              imsuperapple=isuperapple.getImage();
               ImageIcon iteleport = new ImageIcon("src/resources/teleport.jpg");
               imteleport=iteleport.getImage();
                ImageIcon idivar = new ImageIcon("src/resources/wall.jpg");
                imdivar=idivar.getImage();
                 ImageIcon ihummer = new ImageIcon("src/resources/hammer.jpg");
                 imhummer=ihummer.getImage();
                  ImageIcon iboomb = new ImageIcon("src/resources/boomb.jpg");
                  imboomb=iboomb.getImage();
                  
    }

     void initGame() {
         x2[0]=99999;
         y2[0]=99999;
if(snake2||snake){
     dots2 = 3;
        
        for (int z = 0; z < dots2; z++) {
            x2[z] = 160 - z * 10;
            y2[z] = 460;
        }
}
        dots = 3;
        
        for (int z = 0; z < dots; z++) {
            x[z] = 160 - z * 10;
            y[z] = 260;
        }
       
        locateApple();
       if(intapple==2){
                locateApple2();
            }
            if(intapple==3){
                locateApple2();
                locateApple3();
            }
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        doDrawing(g);
    }
    
     void doDrawing(Graphics g) {
        
        if (inGame) {
            g.drawImage(background, 0, 0, this);
            g.drawImage(apple, apple_x, apple_y, this);
            if(intapple==2){
               g.drawImage(apple, apple_xx, apple_yy, this); 
            }if(intapple==3){
               g.drawImage(apple, apple_xx, apple_yy, this); 
                g.drawImage(apple, apple_xxx, apple_yyy, this); 
            }
            
            if(boomb){
                g.drawImage(imboomb, boomb_x, boomb_y, this);
            }
            if(back){
                g.drawImage(imback, back_x, back_y, this);
                
            }
            if(heart){
                g.drawImage(imheart, heart_x, heart_y, this);
            }
             if(mane1 || mane2 || mane3 || mane){
                 for(int i=0;i<d;i++){
                g.drawImage(imdivar,xmane[i] , ymane[i], this);
                 }
            }
             if(cut){
                g.drawImage(imcut, cut_x, cut_y, this);
            }
             if(superapple){
                g.drawImage(imsuperapple, superapple_x, superapple_y, this);
            }
              if(fast){
                g.drawImage(imfast, fast_x, fast_y, this);
            }
               if(slow){
                g.drawImage(imslow, slow_x, slow_y, this);
            }
                if(teleport){
                g.drawImage(imteleport, teleport_x, teleport_y, this);
                g.drawImage(imteleport, teleport_xx, teleport_yy, this);
            }
                if(hummer){
                     g.drawImage(imhummer, hummer_x, hummer_y, this);
                }
                if(snake2||snake){
                    for (int z = 0; z < dots2; z++) {
                if (z == 0) {
                    g.drawImage(head2, x2[z], y2[z], this);
                } else {
                    g.drawImage(dot2, x2[z], y2[z], this);
                } }
                }
            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this);
                } else {
                    g.drawImage(ball, x[z], y[z], this);
                }
            }
            Font font= new Font("tohama", Font.BOLD, 24);
            g.setFont(font);
            g.drawString(accunt_1[1],1080,60);
            g.drawString(String.valueOf(point),720,70);
            g.drawString("امتیاز:",620,70);
            g.drawString(String.valueOf(point2),520,70);
            int level=point/100;
            g.drawString(String.valueOf(level),400,70);
             g.drawString(String.valueOf(heartgame),200,70);
             g.drawString(String.valueOf(hummert),50,70);
            Toolkit.getDefaultToolkit().sync();

        } else {

            gameOver();
        }        
    }
     
     void gameOver() {
         playb();
         int i=0,v=0;
         System.out.println(point+"                    "+Integer.parseInt(accunt_1[0]));
         if(point>Integer.parseInt(accunt_1[0])){
             
             try {
            buffer = new BufferedReader(new FileReader(accunt));
                 String line = buffer.readLine();
             for( i=0;line!=null;i++){
           v++;
                 accuntt[i]=line.split("#");
                  line=buffer.readLine();
             }
                 BufferedWriter bufferw = new BufferedWriter(new FileWriter("accunt.txt"));
                
                for( i=0;true;i++){
                    if(accuntt[i][1].equals(accunt_1[1])){
                        accuntt[i][0]=String.valueOf(point);
                        for(i=0;i<v;i++){
                            bufferw.write(accuntt[i][0]+"#"+accuntt[i][1]+"#"+accuntt[i][2]+"\n");
                        }
                        break;
                    }
                }
                
                   buffer.close();
              bufferw.close();
             } catch (IOException ex) {
             }
              
         }
         this.setVisible(false);
         if(snake||snake2){
              board8 board8=new board8(point,point2);
        board8.setVisible(true);
         }else{
        board6 board6=new board6(accunt_1[1],point);
        board6.setVisible(true);}
    
         
    }
 
  void checkmane() {
for(int i=0;i<d;i++){
    if(x[0]==xmane[i] && y[0]==ymane[i] || x2[0]==xmane[i] && y2[0]==ymane[i]){
        
        if(hummert>0){
                xmane[i]=99999;
        ymane[i]=99999;
        hummert--;}
        else{
            inGame=false;
        }
                 }
}
    }
     void checkApple() {

        if (((x[0] == apple_x) && (y[0] == apple_y))) {
            playapple();
            dots++;
            point+=10;
            locateApple();
            if(dely){
                DELAY=DELAY-2;
            timer.stop();
            timer = new Timer(DELAY, this);
            timer.start();
            }
        }
        if (((x2[0] == apple_x) && (y2[0] == apple_y))) {
            playapple();
            dots2++;
            point2+=10;
            locateApple();
        }
    }
     void checkApple2() {

        if ((x[0] == apple_xx) && (y[0] == apple_yy)) {
            playapple();
            dots++;
            point+=10;
            locateApple2();
            if(dely){
                DELAY=DELAY-2;
            timer.stop();
            timer = new Timer(DELAY, this);
            timer.start();
            }
        }
    }
     void checkApple3() {

        if ((x[0] == apple_xxx) && (y[0] == apple_yyy)) {
            playapple();
            dots++;
            point+=10;
            locateApple3();
            if(dely){
                DELAY=DELAY-2;
            timer.stop();
            timer = new Timer(DELAY, this);
            timer.start();
            }
        }
    }
     void checkhummer() {

        if ((x[0] == hummer_x) && (y[0] == hummer_y)) {
             
            delethummer=0;
            locatehummer();
           if(hummert<3){
               hummert++;
               System.out.println(hummert);
           } 
           
        }
    }
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
     void checksuperApple() {

        if ((x[0] == superapple_x) && (y[0] == superapple_y)) {
            playapple();
            point+=20;
            dots=dots+2;
            deletsuperapple=0;
            locatesuperapple();
        }
    }
     void checkboomb() {

        if ((x[0] == boomb_x) && (y[0] == boomb_y) || (x2[0] == boomb_x) && (y2[0] == boomb_y)) {
            playb();
            if(heartgame==0){
            inGame=false;}
            else{
            heartgame--;
                deletboomb=0;
                locateboomb();
            } 
        }
    }
     void checkback() {
  
        if ((x[0] == back_x) && (y[0] == back_y)) {
            playb();
           backtrue=true;
           timerback=0;
                deletback=0;
                locateback();
        }       
    }
      void checkfast() {

        if ((x[0] == fast_x) && (y[0] == fast_y)) {
            timer.stop();
            DELAY=DELAY-20;
           timer = new Timer(DELAY, this);
        timer.start();
                deletfast=0;
                locatefast();
             
        }   
    }
      void checkslow() {

        if ((x[0] == slow_x) && (y[0] == slow_y)) {
           
            DELAY=DELAY+20;
            timer.stop();
            timer = new Timer(DELAY, this);
        timer.start();
            System.out.println(DELAY);
                deletslow=0;
                locateslow();
             
        }   
    }
      void checkheart() {

        if ((x[0] == heart_x) && (y[0] == heart_y)) {
            if(heartgame<3){
            heartgame++;
            deletheart=0;
            locateheart();}
        }
            
        
    }
      void checkcut() {

        if ((x[0] == cut_x) && (y[0] == cut_y)) {
            if(dots>7){
            dots=dots-5;
            deletcut=0;
            locatecut();}
        }
            
        
    }

     void move() {

        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }
     void move2() {

        for (int z = dots2; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];
        }

        if (leftDirection2) {
            x2[0] -= DOT_SIZE;
        }

        if (rightDirection2) {
            x2[0] += DOT_SIZE;
        }

        if (upDirection2) {
            y2[0] -= DOT_SIZE;
        }

        if (downDirection2) {
            y2[0] += DOT_SIZE;
        }
    }
   
     void movemousex() {
              if(x[0]!=xmouse  && kk==1){
                 if((abs(xmouse-x[0])>560) && (davaran || mousedavaran)){
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

         if((abs(ymouse-y[0])>200) &&(davaran || mousedavaran)) {
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
         }
    }
        void movebot() {
              if(x2[0]!=apple_x && kk==1){
                 if((abs(apple_x-x2[0])>560&& (davaran || mousedavaran))){

             
     
             int x_x=abs(x2[0]-DOT_SIZE);
             int x_xx=abs(x2[0]+DOT_SIZE);
             if(abs((apple_x-x_xx))<abs((apple_x-x_x))){
                
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                    x2[0] -= DOT_SIZE; 
                    for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]-=DOT_SIZE;
        x2[0]+=DOT_SIZE;
        break;}}
    
             }
            else  if(abs((apple_x-x_xx))>abs((apple_x-x_x))) {
                 
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                   x2[0] += DOT_SIZE;
                        for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]+=DOT_SIZE;
        x2[0]-=DOT_SIZE;
        break;}}
      
             }
            
         }
         else{
  
            
             int x_x=abs(x2[0]-DOT_SIZE);
             int x_xx=abs(x2[0]+DOT_SIZE);
             if(abs((apple_x-x_xx))<abs((apple_x-x_x))){
                 
                  for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                  x2[0] += DOT_SIZE;
                       for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]-=DOT_SIZE;
        x2[0]-=DOT_SIZE;
        break;}}
  
             }
             else if(abs((apple_x-x_xx))>abs((apple_x-x_x))) {
                 
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                   x2[0] -= DOT_SIZE;
                        for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]+=DOT_SIZE;
        x2[0]+=DOT_SIZE;
        break;}}

             }
             
                 }}else{
            moveboty();
        }}

void moveboty() {
         
         if((abs(apple_y-y2[0])>200)&& (davaran || mousedavaran)){

             int y_y=abs(y2[0]-DOT_SIZE);
             int y_yy=abs(y2[0]+DOT_SIZE);
             if(abs((apple_y-y_yy))<abs((apple_y-y_y))){
                
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                    y2[0] -= DOT_SIZE;
                         for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]+=DOT_SIZE;
        x2[0]+=DOT_SIZE;
        kk=2;
        break;
    }}
         
             }
             else if(abs((apple_y-y_yy))>abs((apple_y-y_y))) {
                 
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                   y2[0] += DOT_SIZE;
                        for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]-=DOT_SIZE;
        x2[0]-=DOT_SIZE;
        kk=2;
        break;}}
        
            
         }
         }else{ 

             
     
             int y_y=abs(y2[0]-DOT_SIZE);
             int y_yy=abs(y2[0]+DOT_SIZE);
             if(abs((apple_y-y_yy))<abs((apple_y-y_y))){
                
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                    y2[0] += DOT_SIZE;
                         for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]-=DOT_SIZE;
        x2[0]+=DOT_SIZE;
        kk=2;
        break;}}

             }
             else if(abs((apple_y-y_yy))>abs((apple_y-y_y))) {
                 
                   for (int z = dots; z > 0; z--) {
            x2[z] = x2[(z - 1)];
            y2[z] = y2[(z - 1)];}
                   y2[0] -= DOT_SIZE;
                        for(int i=0;i<d;i++){
    if(x2[0]==xmane[i] && y2[0]==ymane[i]){
 y2[0]+=DOT_SIZE;
        x2[0]-=DOT_SIZE;
        kk=2;
        break;}}

            
         }
         }if(y2[0]==apple_y){
             kk=1;
         }}
     
void moveback() {
   if(select[0].equals("true")){
        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            y[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            y[0] += DOT_SIZE;
        }

        if (upDirection) {
            x[0] -= DOT_SIZE;
        }

        if (downDirection) {
            x[0] += DOT_SIZE;
        }}
    }
void checkCollisionbot() {
    for (int z = dots2; z > 0; z--) {

            if ((z > 4) && (x2[0] == x2[z]) && (y2[0] == y2[z])) {
                inGame = false;
            }}
    if(davaran!=false ){
            if (y2[0] >= 640) {
            y2[0]=260;
        }

        if (y2[0] < 260) {
            y2[0]=640;
        }

        if (x2[0] >= 1240) {
            x2[0]=140;
        }

        if (x2[0] < 140) {
            x2[0]=1240;
        }
         if (!inGame) {
            timer.stop();
        }}
         else {
        if (y2[0] >= 640) {
            inGame = false;
        }

        if (y2[0] < 260) {
            inGame = false;
        }

        if (x2[0] >= 1240) {
            inGame = false;
        }

        if (x2[0] < 140) {
            inGame = false;
        }
        
        if (!inGame) {
            timer.stop();
        }}
}
     void checkCollision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        } 
        
        if(davaran || mousedavaran){
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
           
        
        }
        else {
        if (y[0] >= 640) {
            inGame = false;
        }

        if (y[0] < 260) {
            inGame = false;
        }

        if (x[0] >= 1240) {
            inGame = false;
        }

        if (x[0] < 140) {
            inGame = false;
        }
        
        if (!inGame) {
            timer.stop();
        }}
   }

     void locateApple() {
                    
        int r = (int) (Math.random() * RAND_POSx);
        apple_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        apple_y = ((r * DOT_SIZE))+260;
        for(int i=0;i<d;i++){
    if(apple_x==xmane[i] && apple_y==ymane[i]){
                locateApple();
                 }}
    
        }
     
     void locateApple2() {
             int r = (int) (Math.random() * RAND_POSx);
        apple_xx = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        apple_yy = ((r * DOT_SIZE))+260;
        for(int i=0;i<d;i++){
    if(apple_xx==xmane[i] && apple_yy==ymane[i]){
                locateApple2();
                 }}
        }
         void locateApple3() {
              int  r = (int) (Math.random() * RAND_POSx);
        apple_xxx = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        apple_yyy = ((r * DOT_SIZE))+260;
        for(int i=0;i<d;i++){
    if(apple_xxx==xmane[i] && apple_yyy==ymane[i]){
                locateApple3();
                 }}
        }
       void manerandom() {
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
void locateboomb() {
                  if(timerboomb>50){ 
                      deletboomb=0;
                       randomboomb=(int) (Math.random()*30)+1;
                      
                    if(randomboomb==5){
        int r = (int) (Math.random() * RAND_POSx);
        boomb_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        boomb_y = ((r * DOT_SIZE))+260;
                    timerboomb=0;
                    deletboomb=1;}
                  }
                   if(deletboomb==0){
                      boomb_x=90000;
                      boomb_y=90000;
                  }

    }
void locatehummer() {
                  if(timerhummer>50){ 
                      delethummer=0;
                       randomhummer=(int) (Math.random()*30)+1;
                      
                    if(randomhummer==5){
        int r = (int) (Math.random() * RAND_POSx);
        hummer_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        hummer_y = ((r * DOT_SIZE))+260;
                    timerhummer=0;
                    delethummer=1;}
                  }
                   if(delethummer==0){
                      hummer_x=90000;
                      hummer_y=90000;
                  }

    }
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
void locateback() {
      
                  if(timerback>50){ 
                      deletback=0;
                      backtrue=false;
                       randomback=(int) (Math.random()*30)+1;
                      System.out.println(randomback);
                    if(randomback==5){
        int r = (int) (Math.random() * RAND_POSx);
        back_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        back_y = ((r * DOT_SIZE))+260;
                    timerback=0;
                    deletback=1;}
                  }
                   if(deletback==0){
                      back_x=90000;
                      back_y=90000;
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
void locatecut() {
                  if(timercut>50){ 
                      deletcut=0;
                       randomcut=(int) (Math.random()*100)+1;
                      
                    if(randomcut==5){
        int r = (int) (Math.random() * RAND_POSx);
        cut_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        cut_y = ((r * DOT_SIZE))+260;
                    timercut=0;
                    deletcut=1;}
                  }
                   if(deletcut==0){
                      cut_x=90000;
                      cut_y=90000;
                  }

    }
void locateslow() {
                  if(timerslow>50){ 
                      deletslow=0;
                       randomslow=(int) (Math.random()*100)+1;
                      
                    if(randomslow==5){
        int r = (int) (Math.random() * RAND_POSx);
        slow_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        slow_y = ((r * DOT_SIZE))+260;
                    timerslow=0;
                    deletslow=1;}
                  }
                   if(deletslow==0){
                      slow_x=90000;
                      slow_y=90000;
                  }

    }
void locatefast() {
                  if(timerfast>50){ 
                      deletfast=0;
                       randomfast=(int) (Math.random()*100)+1;
                      
                    if(randomfast==5){
        int r = (int) (Math.random() * RAND_POSx);
        fast_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        fast_y = ((r * DOT_SIZE))+260;
                    timerfast=0;
                    deletfast=1;}
                  }
                   if(deletfast==0){
                      fast_x=90000;
                      fast_y=90000;
                  }

    }
void locateheart() {
                  if(timerheart>50){ 
                      deletheart=0;
                       randomheart=(int) (Math.random()*100)+1;
                      
                    if(randomheart==5){
        int r = (int) (Math.random() * RAND_POSx);
        heart_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        heart_y = ((r * DOT_SIZE))+260;
                    timerheart=0;
                    deletheart=1;}
                  }
                   if(deletheart==0){
                      heart_x=90000;
                      heart_y=90000;
                  }

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {
            if(snake2){
                movebot();
                checkCollisionbot();
            }
            if(snake){
                move2();
                checkCollisionbot();
            }
            checkApple();
            checkApple2();
            checkApple3();
            if(boomb){
                timerboomb++;
                locateboomb();
            checkboomb();}
            if(hummer){
                timerhummer++;
                locatehummer();
            checkhummer();}
            if(teleport){
                timerteleport++;
                locateteleport();
            checkteleport();}
             if(superapple){
                timersuperapple++;
                locatesuperapple();
            checksuperApple();}
            if(heart){
                timerheart++;
                locateheart();
            checkheart();}
            if(slow){
                timerslow++;
                locateslow();
            checkslow();}
            if(fast){
                timerfast++;
                locatefast();
                checkfast();}
            if(cut){
                timercut++;
                locatecut();
            checkcut();}
             if(mane1 || mane2 ||mane3 || mane){
             checkmane();
             }
            checkCollision();
             if(back){
                timerback++;
                locateback();
            checkback();
              if(backtrue){
                moveback();
            }}
           
             if(backtrue==false && mouse==false && mousedavaran==false){
           move();
        }
             if(mouse||mousedavaran){
                 movemousex();
             }
           
        }
        repaint();
    }

   

     class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
             if ((e.getKeyChar()=='a')&&(e.getKeyChar()!='d') ) {
                leftDirection2 = true;
                upDirection2 = false;
                downDirection2 = false;
            }

            if ((e.getKeyChar()=='d')&&(e.getKeyChar()!='a')) {
                rightDirection2 = true;
                upDirection2 = false;
                downDirection2 = false;
            }

            if ((e.getKeyChar()=='w')&&(e.getKeyChar()!='s')) {
                upDirection2 = true;
                rightDirection2 = false;
                leftDirection2 = false;
            }

            if ((e.getKeyChar()=='s')&&(e.getKeyChar()!='w')) {
                downDirection2 = true;
                rightDirection2 = false;
                leftDirection2 = false;
            }
        }

       
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
      private void playapple() { 
          if(isonsound){
InputStream in;
try{
      in=new FileInputStream(new File("eat.wav"));
      AudioStream timeupsound=new AudioStream(in);
      AudioPlayer.player.start(timeupsound);

}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
          }
      }
private void playb() {  
    if(isonsound){
InputStream in;
try{
      in=new FileInputStream(new File("back&boomb.wav"));
      AudioStream b=new AudioStream(in);
      AudioPlayer.player.start(b);

}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}

      }
}
}

  