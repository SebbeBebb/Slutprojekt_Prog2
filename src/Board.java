import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener {
    protected JButton[] buttons = new JButton[9];
    protected JFrame frame;
    Winner check = new Winner();
    private JPanel panel;
    private boolean xTurn = true;

    public Board() {
        //Creates the gameboard
        frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changes the button to an X or an O depending on who's turn it is
        JButton button = (JButton) e.getSource();
        if (xTurn) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        button.setEnabled(false);
        xTurn = !xTurn;
        check.checker();
    }

    public void resetGame() {
        //Resets the gameboard when a player has won or if it ends in a draw
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
        xTurn = true;
    }
}