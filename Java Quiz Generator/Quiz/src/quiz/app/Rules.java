package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    // Constructor
    Rules(String name) {
        this.name = name; // Initialize the name variable

        // Setup the JFrame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Heading label
        JLabel heading = new JLabel("Welcome " + name + " to QUIZ");
        heading.setBounds(150, 100, 700, 30);
        heading.setFont(new Font("Arial Black", Font.BOLD, 28));
        heading.setForeground(new Color(0, 62, 82));
        add(heading);

        // Rules label
        JLabel rules = new JLabel();
        rules.setBounds(70, 150, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(new Color(0, 62, 82));
        rules.setText(
                "<html>" +
                        "1. Participants should have basic knowledge about the topic." + "<br><br>" +
                        "2. There are 10 questions." + "<br><br>" +
                        "3. Each right answer carries 10 point, no negative marks." + "<br><br>" +
                        "4. Each question has a time limit of 15 seconds." + "<br><br>" +
                        "5. Use of smartphones strictly prohibited." + "<br><br>" +
                        "6. Take the quiz in a quiet environment." + "<br><br>" +
                        "</html>"
        );
        add(rules);

        // Back button
        back = new JButton("Back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(new Color(0, 62, 82));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        // Start button
        start = new JButton("Start Quiz");
        start.setBounds(450, 500, 100, 30);
        start.setBackground(new Color(0, 62, 82));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        // Background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
        Image i = i1.getImage().getScaledInstance(800, 650, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 800, 650);
        add(image);

        // Frame settings
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            setVisible(false);
            new Quiz(name); // Assuming Quiz is another class handling the quiz
        } else if (e.getSource() == back) {
            setVisible(false);
            new Login(); // Assuming Login is the previous screen
        }
    }

    public static void main(String[] args) {
        new Rules("YourName"); // Pass the name to the Rules constructor
    }
}
