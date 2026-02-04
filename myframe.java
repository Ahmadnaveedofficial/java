

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

