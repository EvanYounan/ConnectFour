package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class temporary extends JPanel{

	/**
	 * Default serialization ID
	 */
	private static final long serialVersionUID = 1L;
	public int x = 15;
	public int y;

	public void setY(int y) {
		this.y = y;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);

		g.setColor(Color.WHITE);
		
		for (int i = 60; i < 361; i = i + 60) {
			
			g.drawLine(i, 0, i, 430);
			g.drawLine(0, i, 430, i);
			
		}
		
		g.setColor(Color.RED);
		g.fillOval(15, y, 30, 30);
	
	}
}
