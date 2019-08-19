package games_Hiroshima_Nagasaki_black_pill;

import javax.swing.JFrame;

import java.awt.*;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame=new JFrame();
Draw_Panel panel=new Draw_Panel();
frame.setVisible(true);
frame.add(panel);
frame.setBounds(10, 10, 1000, 1000);
frame.setBackground(Color.WHITE);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
