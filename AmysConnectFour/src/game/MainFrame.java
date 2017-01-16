package game;

import javax.swing.JFrame;

public class MainFrame {

	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Connect4");
		f.setSize(430, 390);
		f.setResizable(false);
		
		temporary tempPanel = new temporary();
		
		f.add(tempPanel);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
