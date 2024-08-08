package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField text;
    JButton next, back;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Load the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i = i1.getImage().getScaledInstance(500, 550, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450, 0, 550, 500);
        add(image);

        // Heading label
        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140, 60, 300, 45);
        heading.setFont(new Font("Arial Black", Font.BOLD, 40));
        heading.setForeground(new Color(0, 62, 82));
        add(heading);

        // Name label
        JLabel name = new JLabel("Enter Your Name ");
        name.setBounds(160, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(0, 62, 82));
        add(name);

        // Text field for name input
        text = new JTextField();
        text.setBounds(75, 195, 300, 30);
        text.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(text);

        // Next button
        next = new JButton("Next");
        next.setBounds(100, 270, 120, 25);
        next.setBackground(new Color(0, 62, 82));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        // Back button
        back = new JButton("Back");
        back.setBounds(250, 270, 120, 25);
        back.setBackground(new Color(0, 62, 82));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        // Frame settings
        setSize(1000, 500);
        setLocation(200, 150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String name = text.getText();
            setVisible(false);
            new Rules(name); // Ensure the Rules class exists and is correctly implemented
        } else if (e.getSource() == back) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
