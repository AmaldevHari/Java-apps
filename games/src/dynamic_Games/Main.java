package dynamic_Games;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Main {
 static JFrame frame=new JFrame();

	public static void main(String[] args) {
GamePlay game=new GamePlay();	
frame.setBounds(0, 0, 850, 850);
frame.setVisible(true);
frame.add(game);
//game.setVisible(true);
frame.setBackground(Color.BLACK);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
