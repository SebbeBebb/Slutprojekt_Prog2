import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board {
    protected JButton[] buttons = new JButton[9];
    protected JFrame frame;
    private JPanel panel;


    public Board() {
        //Creates the gameboard
        frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener((ActionListener) this);
            panel.add(buttons[i]);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }


}