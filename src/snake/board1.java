/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template select, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;
import java.lang.Cloneable;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author mamad
 */
public class board1 extends javax.swing.JFrame  {
    int who=1;
File select = new File("select.txt");
File accunt = new File("accunt.txt");
File accuntnow = new File("accuntnow.txt");
String [] accuntt=new String[3];
    board2 board2=new board2();
    board4 board4=new board4();
    public String [] listall={"false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","false","1","false"};
    public board1() {
       
                accuntnow.deleteOnExit();
    try {
     BufferedReader   bufferacc = new BufferedReader(new FileReader(accuntnow));
                 accuntt=bufferacc.readLine().split("#");
              bufferacc.close();
              
    } catch (Exception ex) {
   
    }
             
        accuntnow.deleteOnExit();
        setPreferredSize(new Dimension(1380, 810));
      
        initComponents();
         setLocationRelativeTo(null);
    }
    public void list(){
                 
try {
             File select = new File("select.txt");
              if (!select.exists()) {
                   select.createNewFile();
              }
             
              BufferedWriter buffer = new BufferedWriter(new FileWriter(select));
              for(int i=0;i<=21;i++){
              buffer.write(listall[i]+"\n");}
              buffer.close();
 
          } catch (IOException e) {
              e.printStackTrace();
          }
 
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(100, 70, 21, 21);

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(100, 110, 21, 21);

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(90, 150, 20, 21);

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(100, 190, 21, 30);

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(80, 240, 21, 21);

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(100, 330, 21, 21);

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(30, 370, 21, 21);

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(90, 420, 21, 21);

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox9);
        jCheckBox9.setBounds(100, 460, 21, 21);

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox10);
        jCheckBox10.setBounds(90, 500, 21, 21);

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox11);
        jCheckBox11.setBounds(90, 550, 21, 21);

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox12);
        jCheckBox12.setBounds(50, 590, 21, 21);

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox13);
        jCheckBox13.setBounds(70, 630, 21, 21);

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox14);
        jCheckBox14.setBounds(60, 680, 21, 21);

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox15);
        jCheckBox15.setBounds(50, 720, 21, 21);

        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox16);
        jCheckBox16.setBounds(430, 70, 21, 21);

        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox17);
        jCheckBox17.setBounds(430, 110, 21, 21);

        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox18);
        jCheckBox18.setBounds(380, 160, 21, 21);

        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox19);
        jCheckBox19.setBounds(780, 430, 21, 21);

        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox20);
        jCheckBox20.setBounds(780, 470, 21, 21);

        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox21);
        jCheckBox21.setBounds(780, 510, 21, 21);

        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox22);
        jCheckBox22.setBounds(780, 550, 21, 21);

        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox23);
        jCheckBox23.setBounds(780, 600, 21, 21);

        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox24);
        jCheckBox24.setBounds(780, 640, 21, 21);

        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox25);
        jCheckBox25.setBounds(780, 690, 21, 21);

        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox26);
        jCheckBox26.setBounds(780, 730, 21, 21);

        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox27);
        jCheckBox27.setBounds(1280, 440, 21, 21);

        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox28);
        jCheckBox28.setBounds(1280, 480, 21, 21);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mamad\\Desktop\\proje\\play.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(493, 693, 120, 40);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mamad\\Desktop\\proje\\accunt.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1160, 23, 150, 40);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mamad\\Desktop\\proje\\point.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1160, 60, 150, 40);

        jTextField1.setText("1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 320, 60, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("کاربر مهمان");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1160, 100, 150, 40);

        jCheckBox29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox29);
        jCheckBox29.setBounds(380, 200, 180, 21);

        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox30);
        jCheckBox30.setBounds(640, 430, 21, 21);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mamad\\Desktop\\snake\\snake\\1.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, -6, 1420, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        board2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        board4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              // TODO add your handling code here:
           
              list();
              Snake Snake=new Snake(who);
              Snake.setVisible(true);
              this.setVisible(false);
              System.out.println(accuntt[1]);
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if (jCheckBox1.isSelected()){
    listall[0]="true";
}
else{
   listall[0]="false";
}

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
 
        if (jCheckBox2.isSelected()){
            listall[1]="true";
        }
else{
   listall[1]="false";
}
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
if (jCheckBox3.isSelected()){
            listall[2]="true";
        }      
else{
   listall[2]="false";
}
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
if (jCheckBox4.isSelected()){
            listall[3]="true";
        } 
else{
   listall[3]="false";
}// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
if (jCheckBox5.isSelected()){
            listall[4]="true";
        }     
else{
   listall[4]="false";
}// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
if (jCheckBox6.isSelected()){
            listall[5]="true";
        } 
else{
   listall[5]="false";
}// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
if (jCheckBox7.isSelected()){
            listall[6]="true";
        } 
else{
   listall[6]="false";
}// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
if (jCheckBox8.isSelected()){
            listall[7]="true";
        }  
else{
   listall[7]="false";
}// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
       if (jCheckBox9.isSelected()){
            listall[8]="true";
        } 
       else{
   listall[8]="false";
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
if (jCheckBox10.isSelected()){
            listall[9]="true";
        } 
else{
   listall[9]="false";
}// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
if (jCheckBox11.isSelected()){
            listall[10]="true";
        }   else{
   listall[10]="false";
} 
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
if (jCheckBox12.isSelected()){
            listall[11]="true";
        }   else{
   listall[11]="false";
}         // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
if (jCheckBox13.isSelected()){
            listall[12]="true";
        }    else{
   listall[12]="false";
}        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
if (jCheckBox14.isSelected()){
            listall[13]="true";
        }    else{
   listall[13]="false";
}        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
if (jCheckBox15.isSelected()){
            listall[14]="true";
        }    else{
   listall[14]="false";
}        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox16.isSelected()){
            listall[15]="true";
        }    else{
   listall[15]="false";
}
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
if (jCheckBox17.isSelected()){
            listall[16]="true";
        }    else{
   listall[16]="false";
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
if (jCheckBox18.isSelected()){
            listall[17]="true";
        }    else{
   listall[17]="false";
}        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
if (jCheckBox27.isSelected()){
            listall[18]="true";
            listall[19]="false";
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
if (jCheckBox28.isSelected()){
            listall[19]="true";
            listall[18]="false";
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
         
        if(Integer.parseInt(jTextField1.getText())>3){
            jTextField1.setText("3");
        }
        
         listall[20]=jTextField1.getText();
         

  
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
  
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox21.isSelected())
            who=4;
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
 if(jCheckBox19.isSelected()){
     who=2;
 }

    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (accuntnow.exists()) {
                   jLabel1.setText(accuntt[1]);
              }
    }//GEN-LAST:event_formWindowActivated

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox29.isSelected()){
            listall[21]="true";
        }    else{
   listall[21]="false";
}
    }//GEN-LAST:event_jCheckBox29ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        // TODO add your handling code here:
       if(jCheckBox20.isSelected()) {
           who=3;
    }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox22.isSelected())
            who=5;
    
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox23.isSelected())
            who=6;
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox24.isSelected())
            who=7;
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox25.isSelected())
            who=8;
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
        // TODO add your handling code here:
          if(jCheckBox26.isSelected())
            who=9;
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
        // TODO add your handling code here:
         if(jCheckBox30.isSelected())
            who=10;
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(board1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
            
try {
             File select = new File("select.txt");
              if (!select.exists()) {
                   select.createNewFile();
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
 
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new board1().setVisible(true);
                
            }
        });
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
