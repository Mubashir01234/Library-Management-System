package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - Code for Interview");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);



            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(265, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(185, 90, 405, 40);
            contentPane.add(l4);

            JLabel l6 = new JLabel("Developed By : GROUP-11");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(135, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : mubashir01234@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(135, 260, 600, 34);
            contentPane.add(l7);
             
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

