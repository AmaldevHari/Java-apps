package App;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Starup  {
	static ImageIcon img;
	static PanelGraph panel;
	static JFrame frame;
	static JButton but;
	public static void main(String[] args) {
		frame=new JFrame();//creates a Jframe
		frame.getContentPane().setLayout(null);//makes layout absolute 
		panel=new PanelGraph();//object that is extended from Jpanel with custom paint() method
		frame.add(panel);
		frame.setBackground(Color.BLACK);
		frame.setVisible(true);
		panel.setVisible(true);
		frame.setBounds(0,0,900,900);
		frame.setTitle("It's Over lol kys");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		but=new JButton();
		/*	but.setBounds(280, 500, 20, 20);
		 */
		but.setSize(75, 25);
		but.setBounds(380, 600, 120, 30);
		frame.getContentPane().add(but);
		but.setText("Start");
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				PanelGraph.log=0;
				Win1.main(null);
			     frame.setVisible(false);
			}
		});
		
		/*but.setVisible(true);*/

	}

}
