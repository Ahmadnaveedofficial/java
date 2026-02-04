import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TicTacToe extends JFrame implements ActionListener {

    JButton[][] buttons = new JButton[3][3];
    JLabel statusLabel;
    boolean playerX = true;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(450, 500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JLabel title = new JLabel("TIC TAC TOE", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        statusLabel = new JLabel("Player X Turn", JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        JPanel boardPanel = new JPanel(new GridLayout(3, 3, 10, 10));
        boardPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        boardPanel.setBackground(Color.WHITE);

        Font btnFont = new Font("Arial", Font.BOLD, 42);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(btnFont);
                buttons[i][j].setFocusPainted(false);
                buttons[i][j].setBackground(new Color(240, 240, 240));
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }


        add(title, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        if (!clicked.getText().equals("")) return;

        if (playerX) {
            clicked.setText("X");
            clicked.setForeground(new Color(33, 150, 243));
            statusLabel.setText("Player O Turn");
        } else {
            clicked.setText("O");
            clicked.setForeground(new Color(244, 67, 54));
            statusLabel.setText("Player X Turn");
        }

        playerX = !playerX;
        checkWinner();
    }

    void checkWinner() {
        String[][] b = new String[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = buttons[i][j].getText();

        for (int i = 0; i < 3; i++) {
            if (!b[i][0].equals("") && b[i][0].equals(b[i][1]) && b[i][1].equals(b[i][2])) {
                showWinner(b[i][0]); return;
            }
            if (!b[0][i].equals("") && b[0][i].equals(b[1][i]) && b[1][i].equals(b[2][i])) {
                showWinner(b[0][i]); return;
            }
        }

        if (!b[0][0].equals("") && b[0][0].equals(b[1][1]) && b[1][1].equals(b[2][2])) {
            showWinner(b[0][0]); return;
        }

        if (!b[0][2].equals("") && b[0][2].equals(b[1][1]) && b[1][1].equals(b[2][0])) {
            showWinner(b[0][2]);
        }
    }

    void showWinner(String player) {
        JOptionPane.showMessageDialog(this, "Player " + player + " Wins!");
        resetGame();
    }

    void resetGame() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                buttons[i][j].setText("");

        playerX = true;
        statusLabel.setText("Player X Turn");
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}
