import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Winner extends Board implements ActionListener {
    private boolean xTurn = true;

    public Winner() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Changes the button to an X or an O depending on who's turn it is as well as changes whose turn it is
        JButton button = (JButton) e.getSource();
        if (xTurn) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        button.setEnabled(false);
        xTurn = !xTurn;
        checker();
    }

    public void checker() {
        //Check Rows
        for (int i = 0; i < 9; i += 3) {
            if (buttons[i].getText().equals(buttons[i + 1].getText()) && buttons[i].getText().equals(buttons[i + 2].getText()) && !buttons[i].isEnabled()) {
                JOptionPane.showMessageDialog(frame, buttons[i].getText() + " Wins!");
                resetGame();
                return;
            }
        }
        //Check Columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i].getText().equals(buttons[i + 3].getText()) && buttons[i].getText().equals(buttons[i + 6].getText()) && !buttons[i].isEnabled()) {
                JOptionPane.showMessageDialog(frame, buttons[i].getText() + " Wins!");
                resetGame();
                return;
            }
        }
        //Check Diagonals
        if (buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText()) && !buttons[0].isEnabled()) {
            JOptionPane.showMessageDialog(frame, buttons[0].getText() + " Wins!");
            resetGame();
            return;
        }
        if (buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText()) && !buttons[2].isEnabled()) {
            JOptionPane.showMessageDialog(frame, buttons[2].getText() + " Wins!");
            resetGame();
            return;
        }
        //Check draw
        boolean draw = true;
        for (int i = 0; i < 9; i++) {
            if (buttons[i].isEnabled()) {
                draw = false;
                break;
            }
        }
        if (draw) {
            JOptionPane.showMessageDialog(frame, "It was a Draw");
            resetGame();
        }

    }

    public void resetGame() {
        //Resets the game board when a player has won or if it ends in a draw
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
        xTurn = true;
    }
}

