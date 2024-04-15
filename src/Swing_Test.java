import java.awt.*;
import javax.swing.*;
public class Swing_Test extends JFrame{
    JFrame frame;
    Swing_Test(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("9");
        frame.setVisible(true);
        frame.add(b1); frame.add(b2); frame.add(b3);
        frame.add(b4); frame.add(b5); frame.add(b6);
        frame.add(b7); frame.add(b8); frame.add(b9);
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(3,3));
    }
}
