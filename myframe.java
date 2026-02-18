

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myframe extends JFrame {


    
    public void login() {
        setTitle("Login");
        setSize(400, 300);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 4, 4, 4));
        JLabel firstName = new JLabel("First Name");
        JLabel lastName = new JLabel("Last Name");
        
        JButton okButton = new JButton("Sign");

        JTextField firstNameField = new JTextField();
        JTextField lastNameField = new JTextField();


        firstName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lastName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        firstName.setPreferredSize(new Dimension(200,200));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname = firstNameField.getText();
                String lname = lastNameField.getText();
                JOptionPane.showMessageDialog(
                        null,
                        "Welcome " + fname + " " + lname
                );
            }
        });

        mainPanel.setBackground(Color.RED);

        mainPanel.add(firstName);
        mainPanel.add(firstNameField);
        mainPanel.add(lastName);
        mainPanel.add(lastNameField);
        // mainPanel.add(new JLabel()); // empty cell
        mainPanel.add(okButton);

        add(mainPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        myframe m = new myframe();
        m.login();
    }
}



// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class myframe extends JFrame {

//     public void login() {
//         setTitle("Login Page");
//         setSize(500, 350);
//         setLayout(new BorderLayout());

//         // Center panel
//         JPanel centerPanel = new JPanel(new GridBagLayout());
//         centerPanel.setBackground(Color.WHITE);

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.insets = new Insets(10, 10, 10, 10); // spacing
//         gbc.fill = GridBagConstraints.HORIZONTAL;

//         JLabel firstName = new JLabel("First Name:");
//         JLabel lastName = new JLabel("Last Name:");

//         JTextField firstNameField = new JTextField(15);
//         JTextField lastNameField = new JTextField(15);

//         JButton loginButton = new JButton("Sign In");

//         firstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
//         lastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));

//         // Row 1
//         gbc.gridx = 0; gbc.gridy = 0;
//         centerPanel.add(firstName, gbc);

//         gbc.gridx = 1;
//         centerPanel.add(firstNameField, gbc);

//         // Row 2
//         gbc.gridx = 0; gbc.gridy = 1;
//         centerPanel.add(lastName, gbc);

//         gbc.gridx = 1;
//         centerPanel.add(lastNameField, gbc);

//         // Row 3 - Button
//         gbc.gridx = 0; gbc.gridy = 2;
//         gbc.gridwidth = 2;
//         gbc.anchor = GridBagConstraints.CENTER;
//         centerPanel.add(loginButton, gbc);

//         loginButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 JOptionPane.showMessageDialog(
//                         null,
//                         "Welcome " + firstNameField.getText()
//                                 + " " + lastNameField.getText()
//                 );
//             }
//         });

//         add(centerPanel, BorderLayout.CENTER);

//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null); // 🔥 window center
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         myframe m = new myframe();
//         m.login();
//     }
// }






// import javax.swing.*;
// import javax.swing.border.EmptyBorder;
// import java.awt.*;
// import java.awt.event.*;
// import java.awt.geom.RoundRectangle2D;

// class TicTacToe extends JFrame {

//     private JButton[][] buttons = new JButton[3][3];
//     private JLabel statusLabel;
//     private JLabel scoreLabel;
//     private boolean playerX = true;
//     private int xWins = 0, oWins = 0, draws = 0;
//     private boolean gameOver = false;

//     private final Color PRIMARY_COLOR = new Color(99, 102, 241);
//     private final Color SECONDARY_COLOR = new Color(236, 72, 153);
//     private final Color BG_COLOR = new Color(17, 24, 39);
//     private final Color TEXT_COLOR = new Color(243, 244, 246);
//     private final Color BUTTON_BG = new Color(71, 85, 105);
//     private final Color BUTTON_HOVER = new Color(100, 116, 139);
//     private final Color BUTTON_BORDER = new Color(148, 163, 184);

//     public TicTacToe() {
//         setTitle("Tic Tac Toe");
//         setSize(500, 650);
//         setLayout(new BorderLayout(0, 0));
//         // setLocationRelativeTo(null);
//         // setResizable(false);
//         add(createHeaderPanel(), BorderLayout.NORTH);
//         add(createBoardPanel(), BorderLayout.CENTER);
//         add(createFooterPanel(), BorderLayout.SOUTH);

//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setVisible(true);
//     }

//     private JPanel createHeaderPanel() {
//         JPanel panel = new JPanel();
//         panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//         panel.setBackground(BG_COLOR);
//         panel.setBorder(new EmptyBorder(20, 20, 10, 20));

//         JLabel title = new JLabel("TIC TAC TOE");
//         title.setFont(new Font("Segoe UI", Font.BOLD, 32));
//         title.setForeground(TEXT_COLOR);
//         title.setAlignmentX(Component.CENTER_ALIGNMENT);

//         scoreLabel = new JLabel(getScoreText());
//         scoreLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//         scoreLabel.setForeground(new Color(156, 163, 175));
//         scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//         scoreLabel.setBorder(new EmptyBorder(5, 0, 0, 0));

//         panel.add(title);
//         panel.add(scoreLabel);

//         return panel;
//     }

//     private JPanel createBoardPanel() {
//         JPanel container = new JPanel(new GridBagLayout());
//         container.setBackground(BG_COLOR);

//         JPanel boardPanel = new JPanel(new GridLayout(3, 3, 15, 15));
//         boardPanel.setBackground(BG_COLOR);
//         boardPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
//         boardPanel.setPreferredSize(new Dimension(420, 420));

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 buttons[i][j] = createGameButton();
//                 final int row = i, col = j;
//                 buttons[i][j].addActionListener(e -> handleButtonClick(row, col));
//                 boardPanel.add(buttons[i][j]);
//             }
//         }

//         container.add(boardPanel);
//         return container;
//     }

//     private JButton createGameButton() {
//         JButton btn = new JButton("") {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2 = (Graphics2D) g.create();
//                 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

//                 // Button background with proper visibility
//                 Color bgColor;
//                 if (getModel().isPressed()) {
//                     bgColor = BUTTON_HOVER.darker();
//                 } else if (getModel().isRollover() && getText().equals("")) {
//                     bgColor = BUTTON_HOVER;
//                 } else {
//                     bgColor = BUTTON_BG;
//                 }

//                 g2.setColor(bgColor);
//                 g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 15, 15));

//                 // Border for better visibility
//                 g2.setColor(BUTTON_BORDER);
//                 g2.setStroke(new BasicStroke(2f));
//                 g2.draw(new RoundRectangle2D.Float(1, 1, getWidth() - 2, getHeight() - 2, 15, 15));

//                 // Hover glow effect
//                 if (getModel().isRollover() && getText().equals("") && !gameOver) {
//                     g2.setColor(new Color(99, 102, 241, 60));
//                     g2.setStroke(new BasicStroke(3f));
//                     g2.draw(new RoundRectangle2D.Float(2, 2, getWidth() - 4, getHeight() - 4, 15, 15));
//                 }

//                 g2.dispose();
//                 super.paintComponent(g);
//             }
//         };

//         btn.setFont(new Font("Segoe UI", Font.BOLD, 56));
//         btn.setFocusPainted(false);
//         btn.setBorderPainted(false);
//         btn.setContentAreaFilled(false);
//         btn.setOpaque(false);
//         btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
//         btn.setForeground(TEXT_COLOR);

//         btn.addMouseListener(new MouseAdapter() {
//             public void mouseEntered(MouseEvent e) {
//                 if (btn.getText().equals("") && !gameOver) {
//                     btn.repaint();
//                 }
//             }

//             public void mouseExited(MouseEvent e) {
//                 btn.repaint();
//             }
//         });

//         return btn;
//     }

//     private JPanel createFooterPanel() {
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBackground(BG_COLOR);
//         panel.setBorder(new EmptyBorder(10, 20, 20, 20));

//         statusLabel = new JLabel("Player X's Turn", JLabel.CENTER);
//         statusLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
//         statusLabel.setForeground(PRIMARY_COLOR);

//         JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//         buttonsPanel.setBackground(BG_COLOR);

//         JButton resetBtn = createActionButton("New Game", PRIMARY_COLOR);
//         resetBtn.addActionListener(e -> resetGame());

//         JButton exitBtn = createActionButton("Exit", new Color(239, 68, 68));
//         exitBtn.addActionListener(e -> System.exit(0));

//         buttonsPanel.add(resetBtn);
//         buttonsPanel.add(exitBtn);

//         panel.add(statusLabel, BorderLayout.NORTH);
//         panel.add(buttonsPanel, BorderLayout.CENTER);

//         return panel;
//     }

//     private JButton createActionButton(String text, Color color) {
//         JButton btn = new JButton(text) {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2 = (Graphics2D) g.create();
//                 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

//                 if (getModel().isPressed()) {
//                     g2.setColor(color.darker());
//                 } else if (getModel().isRollover()) {
//                     g2.setColor(color.brighter());
//                 } else {
//                     g2.setColor(color);
//                 }

//                 g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 10, 10));
//                 g2.dispose();

//                 super.paintComponent(g);
//             }
//         };

//         btn.setPreferredSize(new Dimension(120, 40));
//         btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
//         btn.setForeground(Color.WHITE);
//         btn.setFocusPainted(false);
//         btn.setBorderPainted(false);
//         btn.setContentAreaFilled(false);
//         btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

//         return btn;
//     }

//     private void handleButtonClick(int row, int col) {
//         if (gameOver || !buttons[row][col].getText().equals(""))
//             return;

//         JButton clicked = buttons[row][col];

//         if (playerX) {
//             clicked.setText("X");
//             clicked.setForeground(PRIMARY_COLOR);
//             statusLabel.setText("Player O's Turn");
//             statusLabel.setForeground(SECONDARY_COLOR);
//         } else {
//             clicked.setText("O");
//             clicked.setForeground(SECONDARY_COLOR);
//             statusLabel.setText("Player X's Turn");
//             statusLabel.setForeground(PRIMARY_COLOR);
//         }

//         animateButton(clicked);
//         playerX = !playerX;
//         checkWinner();
//     }

//     private void animateButton(JButton btn) {
//         Timer timer = new Timer(50, null);
//         final float[] scale = { 0.5f };

//         timer.addActionListener(e -> {
//             scale[0] += 0.1f;
//             if (scale[0] >= 1.0f) {
//                 scale[0] = 1.0f;
//                 ((Timer) e.getSource()).stop();
//             }
//             btn.setFont(btn.getFont().deriveFont(56f * scale[0]));
//         });
//         timer.start();
//     }

//     private void checkWinner() {
//         String[][] b = new String[3][3];
//         for (int i = 0; i < 3; i++)
//             for (int j = 0; j < 3; j++)
//                 b[i][j] = buttons[i][j].getText();

//         for (int i = 0; i < 3; i++) {
//             if (!b[i][0].equals("") && b[i][0].equals(b[i][1]) && b[i][1].equals(b[i][2])) {
//                 showWinner(b[i][0], new int[][] { { i, 0 }, { i, 1 }, { i, 2 } });
//                 return;
//             }
//             if (!b[0][i].equals("") && b[0][i].equals(b[1][i]) && b[1][i].equals(b[2][i])) {
//                 showWinner(b[0][i],
//                         new int[][] { { 0, i }, { 1, i }, { 2, i } });
//                 return;
//             }
//         }

//         if (!b[0][0].equals("") && b[0][0].equals(b[1][1]) && b[1][1].equals(b[2][2])) {
//             showWinner(b[0][0], new int[][] { { 0, 0 }, { 1, 1 }, { 2, 2 } });
//             return;
//         }

//         if (!b[0][2].equals("") && b[0][2].equals(b[1][1]) && b[1][1].equals(b[2][0])) {
//             showWinner(b[0][2], new int[][] { { 0, 2 }, { 1, 1 }, { 2, 0 } });
//             return;
//         }

//         boolean isFull = true;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (b[i][j].equals("")) {
//                     isFull = false;
//                     break;
//                 }
//             }
//         }

//         if (isFull) {
//             showDraw();
//         }
//     }

//     private void showWinner(String player, int[][] winningCells) {
//         gameOver = true;

//         for (int[] cell : winningCells) {
//             buttons[cell[0]][cell[1]]
//                     .setBackground(player.equals("X") ? new Color(99, 102, 241, 100) : new Color(236, 72, 153, 100));
//         }

//         statusLabel.setText("Player " + player + " Wins! 🎉");
//         statusLabel.setForeground(player.equals("X") ? PRIMARY_COLOR : SECONDARY_COLOR);

//         if (player.equals("X"))
//             xWins++;
//         else
//             oWins++;

//         updateScore();

//         Timer timer = new Timer(2000, e -> resetGame());
//         timer.setRepeats(false);
//         timer.start();
//     }

//     private void showDraw() {
//         gameOver = true;
//         draws++;
//         statusLabel.setText("It's a Draw!");
//         statusLabel.setForeground(new Color(234, 179, 8));
//         updateScore();

//         Timer timer = new Timer(2000, e -> resetGame());
//         timer.setRepeats(false);
//         timer.start();
//     }

//     private void updateScore() {
//         scoreLabel.setText(getScoreText());
//     }

//     private String getScoreText() {
//         return String.format("X: %d  |  O: %d  |  Draws: %d", xWins, oWins, draws);
//     }

//     private void resetGame() {
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 buttons[i][j].setText("");
//                 buttons[i][j].setBackground(null);
//             }
//         }

//         playerX = true;
//         gameOver = false;
//         statusLabel.setText("Player X's Turn");
//         statusLabel.setForeground(PRIMARY_COLOR);
//     }

//     public static void main(String[] args) {
//         try {
//             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         SwingUtilities.invokeLater(() -> new TicTacToe());
//     }
// }

