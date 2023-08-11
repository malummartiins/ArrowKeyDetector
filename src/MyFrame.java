import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("lancamento-do-foguete.png");
        /*java.net.URL imgUrl = getClass().getResource("lancamento-do-foguete(1).png");
        ImageIcon icon = new ImageIcon(imgUrl);*/

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);

        this.add(label);
        this.setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {          
        // keyTyped = invoked when a key is typed. Uses KeyChar, char output
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX() -10,label.getY());
            break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
            break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
            break;
            case 'd': label.setLocation(label.getX()+10,label.getY());
            break;

        }
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed =  invoked when a physical key ir pressed down. uses KeyCode, int output
       switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX() -10,label.getY());
            break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
            break;
            case 39: label.setLocation(label.getX()+10,label.getY());
            break;
            case 40: label.setLocation(label.getX(),label.getY()+10);
            break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyRealeased =  called whenever a button ir released
    }
}
