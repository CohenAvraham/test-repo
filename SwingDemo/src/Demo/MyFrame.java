package Demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame(){
		ImageIcon image = new ImageIcon("logo.png");
		
		button = new JButton("Hello");
		button.setBounds(100, 100, 300, 100);
		button.addActionListener((e) -> {System.out.println("poo poo");});
		button.setText("I am a button");
		button.setFocusable(false);
		button.setIcon(image);
		button.setFont(new Font("Comic Sans", Font.BOLD, 20));
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setEnabled(true);
		
//		JFrame frame = new JFrame();
		this.setTitle("Avi Swing Test");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(120, 120, 120));
		
		this.add(button);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			System.out.println("Poo");
		}
	}

}
