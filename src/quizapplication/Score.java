package quizapplication;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int Score) {
        getContentPane().setBackground(Color.WHITE);
        setBounds(300, 0, 700, 700);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Images/score.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);
        JLabel imageLabel = new JLabel(i3);
        imageLabel.setBounds(40, 0, 300, 250);
        add(imageLabel);

        JLabel heading = new JLabel("ThankYou " + name + " For Playing ByteBoost");
        heading.setBounds(60, 260, 700, 80);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        JLabel lblscore = new JLabel("Your Score is " + Score);
        lblscore.setBounds(60, 290, 700, 80);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(lblscore);

        JButton playagain = new JButton("PLAY AGAIN");
        playagain.setBounds(60, 380, 120, 30);
        playagain.setBackground(Color.BLACK); // Set a different background color, e.g., blue
        playagain.setForeground(Color.WHITE);
        add(playagain);
        playagain.addActionListener(this);
       
        
        
        
        setLayout(null);
        setVisible(true);
       
      
    }

    
    public static void main(String[] args) {
        new Score("User", 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    	setVisible(false);
    	new Login();
    }
}