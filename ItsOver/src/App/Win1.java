package App;

import java.awt.Color;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class Win1 {
	static JFrame Frame;
	static ImageIcon im1=new ImageIcon("1Untitled.png");
	static ImageIcon im2=new ImageIcon("2Untitled.png");
	static int turn=1;
	static int[] co_ords=new int[2];
	static boolean go=false;
	static Win2 panel;
	static JButton button;
	static JButton button_0;static JButton button_1;static JButton button_2;static JButton button_3;
	static JButton button_4;static JButton button_5;static JButton button_6;static JButton button_7;
	static int[][] status_r=new int[3][3];
	static int r_score;
	static int h_score;
	static int[][] status_h=new int[3][3];
	private static JButton btnNewButton;
	private static JButton btnResetScore;
	private static JButton btnNewButton_1;{
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				status_r[i][j]=0;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				status_h[i][j]=0;
			}
		}
	}

	public static void main(String[] args) {
		Frame=new JFrame();
		Frame.getContentPane().setLayout(null);
		Frame.setBackground(Color.BLACK);

		Frame.setVisible(true);
		Frame.setBounds(0,0, 679, 600);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new Win2();
		panel.setVisible(true);
		panel.setBounds(0, 0, 661, 553);
		panel.setBackground(Color.BLACK);
		Frame.getContentPane().add(panel);
		panel.setLayout(null);
		Frame.setTitle("Bruh it's over ");
		button = new JButton();
		button.setBounds(44, 72, 139, 118);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(turn%2==1) { button.setIcon(im1);
				status_r[0][0]=1;}
				else {button.setIcon(im2);
				status_h[0][0]=1;}
				turn++;
				button.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}
				if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
				
			}
		});
		button_0 = new JButton();
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_0.setIcon(im1);
				status_r[0][1]=1;}
				else {button_0.setIcon(im2);
				status_h[0][1]=1;}
				turn++;
			
				button_0.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}
				if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_0.setBounds(185, 72, 139, 118);
		panel.add(button_0);

		button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_1.setIcon(im1);
				status_r[0][2]=1;}
				else {button_1.setIcon(im2);
				status_h[0][2]=1;}
				turn++;
				button_1.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_1.setBounds(325, 72, 139, 118);
		panel.add(button_1);

		button_2 = new JButton();
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_2.setIcon(im1);
				status_r[1][0]=1;}
				else {button_2.setIcon(im2);
				status_h[1][0]=1;}
				turn++;
				button_2.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_2.setBounds(44, 192, 139, 118);
		panel.add(button_2);

		button_3 = new JButton();
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_3.setIcon(im1);
				status_r[2][0]=1;}
				else {button_3.setIcon(im2);
				status_h[2][0]=1;}
				turn++;
				button_3.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_3.setBounds(44, 313, 139, 118);
		panel.add(button_3);

		button_4 = new JButton();
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_4.setIcon(im1);
				status_r[1][1]=1;}
				else {button_4.setIcon(im2);
				status_h[1][1]=1;}
				turn++;
				button_4.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_4.setBounds(185, 192, 139, 118);
		panel.add(button_4);

		button_5 = new JButton();
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_5.setIcon(im1);
				status_r[2][1]=1;}
				else {button_5.setIcon(im2);
				status_h[2][1]=1;}
				turn++;
				button_5.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_5.setBounds(185, 313, 139, 118);
		panel.add(button_5);

		button_6 = new JButton();
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_6.setIcon(im1);
				status_r[1][2]=1;}
				else {button_6.setIcon(im2);
				status_h[1][2]=1;}
				turn++;
				button_6.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_6.setBounds(325, 192, 139, 118);
		panel.add(button_6);

		button_7 = new JButton();
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turn%2==1) { button_7.setIcon(im1);
				status_r[2][2]=1;}
				else {button_7.setIcon(im2);
				status_h[2][2]=1;}
				turn++;
				button_7.removeActionListener(this);
				int[] res_r=new int[8];int[] res_h=new int[8];
				for(int i=0;i<3;i++) {

					res_r[i]=status_r[i][0]+status_r[i][1]+status_r[i][2];
					res_h[i]=status_h[i][0]+status_h[i][1]+status_h[i][2];}
				for(int i=0;i<3;i++) {

					res_r[i+3]=status_r[0][i]+status_r[1][i]+status_r[2][i];
					res_h[i+3]=status_h[0][i]+status_h[1][i]+status_h[2][i];}

				res_r[6]=status_r[0][0]+status_r[1][1]+status_r[2][2];
				res_h[6]=status_h[0][0]+status_h[1][1]+status_h[2][2];

				res_r[7]=status_r[0][2]+status_r[1][1]+status_r[2][0];
				res_h[7]=status_h[0][2]+status_h[1][1]+status_h[2][0];
				int start=0;
				while(start<8) {
					if(res_r[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_rage kys");
						break;
					}
					if(res_h[start]==3) {
						JOptionPane.showMessageDialog(null, "It's over for incel_hollow kys");
						break;
					}
					start++;
				}if(turn==10) {
					JOptionPane.showMessageDialog(null, "Game Over fag kys");
				}
			}
		});
		button_7.setBounds(325, 313, 139, 118);
		panel.add(button_7);
		
		btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			turn=1;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					status_r[i][j]=0;
				}
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					status_h[i][j]=0;
				}
			}
		Frame.setVisible(false);

			Win1.main(null);
			}
		});
		btnNewButton.setBounds(525, 484, 121, 45);
		panel.add(btnNewButton);
		
		btnResetScore = new JButton("Reset Score");
		btnResetScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r_score=0;
				h_score=0;
			}
		});
		btnResetScore.setBounds(392, 484, 121, 45);
		panel.add(btnResetScore);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(507, 113, 139, 358);
		panel.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(575, 126, 15, 334);
		panel.add(separator);
	}
}
