/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class boardasli extends JPanel implements ActionListener {

     final int B_WIDTH = 1390;
     final int B_HEIGHT = 780;
     final int DOT_SIZE = 20;
     final int ALL_DOTS = 900;
     final int RAND_POSx = 56;
     final int RAND_POSy = 18;
     int DELAY = 140;
int point=0;
     final int x[] = new int[ALL_DOTS];
   final int y[] = new int[ALL_DOTS];

     int dots;
     int apple_x;
     int apple_y;

    boolean leftDirection = false;
    boolean rightDirection = true;
   boolean upDirection = false;
   boolean downDirection = false;
    boolean inGame = true;

    Timer timer;
    Image ball;
    Image apple;
    Image head;
  Image background;
    public boardasli() {
        
        initBoard();
          setPreferredSize(new Dimension(1360, 740));
    }
    
     void initBoard() {

        addKeyListener(new TAdapter());
        setFocusable(true);

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        loadImages();
        initGame();
    }

    void loadImages() {
 ImageIcon img = new ImageIcon("6.jpg");
        background = img.getImage();
        ImageIcon iid = new ImageIcon("src/resources/dot.jpg");
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon("src/resources/apple.jpg");
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon("src/resources/head.jpg");
        head = iih.getImage();
    }

     void initGame() {

        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 160 - z * 10;
            y[z] = 260;
        }
        
        locateApple();

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

            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this);
                } else {
                    g.drawImage(ball, x[z], y[z], this);
                }
            }
 Font font= new Font("tohama", Font.BOLD, 24);
            g.setFont(font);
            g.drawString("کاربر مهمان",1080,60);
            g.drawString(String.valueOf(point),720,70);
            Toolkit.getDefaultToolkit().sync();

        } else {

            gameOver();
        }        
    }

     void gameOver() {
        playb();
       board6 board6=new board6("کاربر مهمان",point);
        board6.setVisible(true);
    }

     void checkApple() {

        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            playapple();
 point+=10;
            dots++;
            locateApple();
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

     void checkCollision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

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
        }
    }

    void locateApple() {

        int r = (int) (Math.random() * RAND_POSx);
        apple_x = ((r * DOT_SIZE))+140;

        r = (int) (Math.random() * RAND_POSy);
        apple_y = ((r * DOT_SIZE))+260;
        
                 
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {

            checkApple();
            checkCollision();
            move();
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
        }
    }
      void playapple() { 
          
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
 void playb() {  
   
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
