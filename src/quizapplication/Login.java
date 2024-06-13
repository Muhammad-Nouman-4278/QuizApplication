	package quizapplication;
	import java.awt.*;
	import java.awt.event.*;
	
	import javax.swing.*;
	
	public class Login extends JFrame implements ActionListener
	{
		JButton rbtn,backbtn;//Globally declared 
		JTextField tf;
		Login()
		{
			getContentPane().setBackground(Color.WHITE);//Set Background of frame
			setLayout(null);//I will set Layouts By myself
			
			ImageIcon First= new ImageIcon(ClassLoader.getSystemResource("Images/login.jpeg"));
			JLabel image = new JLabel(First);
			image.setBounds(0,0,620,470);//Left and top Zero,Length,width
			add(image);
			
			
			JLabel heading= new JLabel("ByteBoost"); //Heading for the Label
			heading.setBounds(820,60,300,50); // Correcting bounds for the "ByteBoost" label
			heading.setFont(new Font("Viner Hand ITC",Font.BOLD,50));
			heading.setForeground(Color.BLUE);//Set Color of the Text
	
			add(heading); 	
			
			JLabel name= new JLabel("Enter Your Name"); //Label for Name
			name.setBounds(750,130,400,100); // Adjusting bounds for the "name" label

			name.setFont(new Font("Arial",Font.BOLD,20));
			name.setForeground(Color.BLACK);//Set Color of the Text
			add(name); 	
			
			tf= new JTextField();
			tf.setBounds(750,210,350,50);
			tf.setFont(new Font("Arial",Font.BOLD,20));
			add(tf);
			
			rbtn= new JButton("RULES");
			rbtn.setBounds(750, 270, 120, 25); // Adjusting bounds for the button
			rbtn.setBackground(Color.BLUE);
			rbtn.setForeground(Color.WHITE);
			rbtn.addActionListener(this);
			add(rbtn);
			
			backbtn= new JButton("BACK");
			backbtn.setBounds(980, 270, 120, 25); // Adjusting bounds for the button
			backbtn.setBackground(Color.BLUE);
			backbtn.setForeground(Color.WHITE);
			backbtn.addActionListener(this);
			add(backbtn);

			
			setLocation(60,100);//Set The Location of Frame
			setSize(1200,500);//Set Size of frame
			setVisible(true);
		}
		
		
		
		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==rbtn)
			{
				String name=tf.getText();
				new Rules(name);
				setVisible(false);
			}
			else if(e.getSource()==backbtn)
			{
				setVisible(false);
				
			}	
			
		}

		public static void main(String[] args) {
			
			new Login();
	
		}

			
	}
