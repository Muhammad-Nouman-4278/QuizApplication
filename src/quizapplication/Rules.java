package quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton backbtn,startbtn;
    Rules(String name) {
        this.name = name;

        // Setting up the frame
        setTitle("ByteBoost Rules");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800); // Adjusted size
        setLocation(50, 0); // Adjusted location
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); // I will set Layouts By myself

        // Adding the heading label
        JLabel heading = new JLabel("Welcome " + name + " to ByteBoost");
        heading.setBounds(100, 20, 600, 50); // Adjusted bounds
        heading.setFont(new Font("Verdana", Font.BOLD, 30)); // Adjusted font size
        heading.setForeground(Color.BLACK);
        add(heading);

        // Adding the rules label
        JLabel rules = new JLabel();
        rules.setBounds(70, 80, 600, 500); // Adjusted bounds
        rules.setFont(new Font("Tahoma", Font.PLAIN, 20)); // Adjusted font size
        rules.setText(
                "<html>"+ 
                    "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                    "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                    "4. Crying is allowed but please do so quietly." + "<br><br>" +
                    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                    "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                    "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                    "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "</html>"
        );
        add(rules);
        
        // Adding the back button
        backbtn = new JButton("BACK");
        backbtn.setBounds(100, 570, 120, 30); 
        backbtn.setBackground(Color.BLACK);
        backbtn.setForeground(Color.WHITE);
        backbtn.addActionListener(this);
        add(backbtn);
        
        // Adding the start button
        startbtn = new JButton("START");
        startbtn.setBounds(500, 570, 120, 30); 
        startbtn.setBackground(Color.BLACK);
        startbtn.setForeground(Color.WHITE);
        startbtn.addActionListener(this);
        add(startbtn);
        

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
		if(e.getSource()==startbtn)
		{
			setVisible(false);
			new Quiz(name);
		}
		else if(e.getSource()==backbtn)
		{
			setVisible(false);
			 new Login();
			 	
		}
		
	}

    public static void main(String[] args) {
        new Rules("User");
    }
}
