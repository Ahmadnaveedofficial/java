
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {
    JButton[][] buttons = new JButton[3][3];
    JLabel statusLabel, scoreLabel;
    int xWins = 0, oWins = 0, draws = 0;
    boolean playerX = true;
    boolean gameOver = false;

    public TicTacToe() {
        setTitle("Tic Tac Toe - Beginner Version");
        setSize(400, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        JLabel title = new JLabel("TIC TAC TOE", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        
        scoreLabel = new JLabel("X: 0 | O: 0 | Draws: 0", JLabel.CENTER);
        topPanel.add(title);
        topPanel.add(scoreLabel);

        JPanel boardPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 50));
                buttons[i][j].setFocusable(false);
                buttons[i][j].addActionListener(this);
                boardPanel.add(buttons[i][j]);
            }
        }

        JPanel bottomPanel = new JPanel(new BorderLayout());
        statusLabel = new JLabel("Player X's Turn", JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel controlButtons = new JPanel();
        JButton resetBtn = new JButton("New Game");
        JButton exitBtn = new JButton("Exit");
        
        resetBtn.addActionListener(e -> resetBoard());
        exitBtn.addActionListener(e -> System.exit(0));
        
        controlButtons.add(resetBtn);
        controlButtons.add(exitBtn);
        
        bottomPanel.add(statusLabel, BorderLayout.NORTH);
        bottomPanel.add(controlButtons, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (!gameOver && clicked.getText().equals("")) {
            if (playerX) {
                clicked.setText("X");
                clicked.setForeground(Color.BLUE);
                statusLabel.setText("Player O's Turn");
            } else {
                clicked.setText("O");
                clicked.setForeground(Color.RED);
                statusLabel.setText("Player X's Turn");
            }
            playerX = !playerX;
            checkWinner();
        }
    }

    private void checkWinner() {
        String[][] b = new String[3][3];
        for (int i = 0; i < 3; i++){
             for (int j = 0; j < 3; j++)
               {
                 b[i][j] = buttons[i][j].getText();
               }
        }

        String win = "";
        for (int i = 0; i < 3; i++) {
            if (!b[i][0].isEmpty() && b[i][0].equals(b[i][1]) && b[i][1].equals(b[i][2])){
                 win = b[i][0];
            }
            if (!b[0][i].isEmpty() && b[0][i].equals(b[1][i]) && b[1][i].equals(b[2][i])) {
                win = b[0][i];
            }
        }
        if (!b[0][0].isEmpty() && b[0][0].equals(b[1][1]) && b[1][1].equals(b[2][2])) {
            win = b[0][0];
        };
        if (!b[0][2].isEmpty() && b[0][2].equals(b[1][1]) && b[1][1].equals(b[2][0])) {
            win = b[0][2];
        };

        if (!win.isEmpty()) {
            gameOver = true;
            statusLabel.setText("Player " + win + " Wins!");
            if (win.equals("X")){
                xWins++;
            } else {
                oWins++;
            }
            updateScore();
        } else if (isBoardFull()) {
            gameOver = true;
            statusLabel.setText("It's a Draw!");
            draws++;
            updateScore();
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
           {
             for (int j = 0; j < 3; j++)
               {
                 if (buttons[i][j].getText().isEmpty()){
                     return false;
                }
               }
              
           }
            return true;
    }

    private void updateScore() {
        scoreLabel.setText("X: " + xWins + " | O: " + oWins + " | Draws: " + draws);
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        playerX = true;
        gameOver = false;
        statusLabel.setText("Player X's Turn");
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}