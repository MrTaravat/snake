package snake;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame  {
int who=1;
    public Snake(int who) {
       this.who=who;
        initUI();
        
    }
    
    private void initUI() {
        if(who==1){
        add(new Board());
        }
            if(who==2){
        add(new marhale1());
        }    
            if(who==3){
        add(new marhale2());
        }    
            if(who==4){
        add(new marhale3());
        }    
            if(who==5){
        add(new marhale3_b());
        }    
            if(who==6){
        add(new marhale4());
        }    
             if(who==7){
        add(new marhale5());
        }    
             if(who==8){
        add(new marhale6());
        }    
             if(who==9){
        add(new marhale7());
        }    
             if(who==10){
        add(new marhale8());
        }    
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
       
    }
}