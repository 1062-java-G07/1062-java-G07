package idgf;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Run extends JFrame{
	
	public Run(){
		
		JFrame f;
		f=new JFrame("START");
		JButton b = new JButton("start");
		f.getContentPane().add(b);
		b.addActionListener(new ActionListener(){	
		public void actionPerformed(ActionEvent e){
		f.setVisible(false);
		new RunTest();
		}
		});
		f.setSize(440,700);
		f.show();
		
      
	}
	public static void main(String[]args){
		new Run();
	}
}


	class RunTest{
		public RunTest(){
			MainFrame f = new MainFrame();
			//f.setSize(700,500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
	}
}