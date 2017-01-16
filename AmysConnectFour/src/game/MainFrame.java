package game;

import javax.swing.JFrame;

public class MainFrame {

	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Connect4");
		f.setSize(430, 390);
		f.setResizable(false);
		
		temporary tempPanel = new temporary();
		

		
		f.add(tempPanel);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		tempPanel.setY(0);
		
		for (int i = 0; i < 315; i = i+5) {
			try {
				tempPanel.y = i;
				tempPanel.repaint();
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
