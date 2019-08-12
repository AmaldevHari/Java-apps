package games_1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TicTacToe implements ImageObserver {
	static int turn=1;
	static 	String check="";
	private JFrame frame;
	static String status;
	static int o_win=0;
	static int x_win=0;
	//Graphics g;
	//static Image im=Toolkit.getDefaultToolkit().getImage("unnamed.png");
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel label_X;
	private JLabel label_O;
	private JLabel lblScore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 0, 408, 15);
		frame.getContentPane().add(separator);

		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
textField_1.setText("");
textField_2.setText("");
textField_3.setText("");
textField_4.setText("");textField_8.setText("");textField_9.setText("");
textField_5.setText("");textField_6.setText("");textField_7.setText("");
textField_1.setEditable(true);textField_2.setEditable(true);textField_3.setEditable(true);
textField_4.setEditable(true);textField_5.setEditable(true);textField_6.setEditable(true);
textField_7.setEditable(true);textField_8.setEditable(true);textField_9.setEditable(true);

turn=1;
			}
		});
		btnReset.setBounds(22, 215, 97, 25);
		frame.getContentPane().add(btnReset);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] status=new String[8];
				status[0]=textField_1.getText() +textField_2.getText()+textField_3.getText();
				status[1]=textField_4.getText() +textField_5.getText()+textField_6.getText();
				status[2]=textField_7.getText() +textField_8.getText()+textField_9.getText();
				status[3]=textField_1.getText() +textField_4.getText()+textField_7.getText();
				status[4]=textField_2.getText() +textField_5.getText()+textField_8.getText();
				status[5]=textField_3.getText() +textField_6.getText()+textField_9.getText();
				status[6]=textField_1.getText() +textField_5.getText()+textField_9.getText();
				status[7]=textField_3.getText() +textField_5.getText()+textField_7.getText();
				int start=0;
				String bpyx="";
				while(start<8) {
					bpyx+="|||"+status[start]+"|||";
					start++;
					
				}
				if(bpyx.contains("XXX")&&bpyx.contains("OOO")) {
					JOptionPane.showMessageDialog(null, "Impossible state");
				}
				else if(bpyx.contains("XXX")) {
					JOptionPane.showMessageDialog(null, "X wins!");
					x_win++;
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");textField_8.setText("");textField_9.setText("");
					textField_5.setText("");textField_6.setText("");textField_7.setText("");
					textField_1.setEditable(true);textField_2.setEditable(true);textField_3.setEditable(true);
					textField_4.setEditable(true);textField_5.setEditable(true);textField_6.setEditable(true);
					textField_7.setEditable(true);textField_8.setEditable(true);textField_9.setEditable(true);

					turn=1;
					label_X.setText(""+x_win);
				}
				else if(bpyx.contains("OOO")) {
					JOptionPane.showMessageDialog(null, "O wins!");
					o_win++;
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");textField_8.setText("");textField_9.setText("");
					textField_5.setText("");textField_6.setText("");textField_7.setText("");
					textField_1.setEditable(true);textField_2.setEditable(true);textField_3.setEditable(true);
					textField_4.setEditable(true);textField_5.setEditable(true);textField_6.setEditable(true);
					textField_7.setEditable(true);textField_8.setEditable(true);textField_9.setEditable(true);

					turn=1;
					label_O.setText(""+o_win);
				}
				else if(bpyx.length()!=72){
					JOptionPane.showMessageDialog(null, "Game not finished");
				}
				else {
					JOptionPane.showMessageDialog(null, "Draw");
				}


			}
		});
		btnNewButton.setBounds(159, 215, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instructions.main(null);
			}
		});
		btnInstructions.setBounds(286, 215, 121, 25);
		frame.getContentPane().add(btnInstructions);

		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
			if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_1.getText().equals("O")) {
					JOptionPane.showMessageDialog(null, "error its X's turn");
				}
				else if(turn%2==0&&textField_1.getText().equals("X")){
					JOptionPane.showMessageDialog(null, "error its O's turn");

				}
				else if((turn%2==1&&textField_1.getText().equals("X"))||(turn%2==0&&textField_1.getText().equals("O"))){
					turn++;
                    status+="||"+textField_1.getText()+"||";
                    textField_1.setEditable(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "INVALID INPUT");
				}
			}}
		});
		textField_1.setBounds(12, 13, 52, 40);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_2.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_2.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_2.getText().equals("X"))||(turn%2==0&&textField_2.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_2.getText()+"||";
	                    textField_2.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}});
		textField_2.setColumns(10);
		textField_2.setBounds(88, 13, 52, 40);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_3.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_3.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_3.getText().equals("X"))||(turn%2==0&&textField_3.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_3.getText()+"||";
	                    textField_3.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(166, 13, 52, 40);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_4.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_4.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_4.getText().equals("X"))||(turn%2==0&&textField_4.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_4.getText()+"||";
	                    textField_4.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(12, 73, 52, 40);
		frame.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_5.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_5.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_5.getText().equals("X"))||(turn%2==0&&textField_5.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_5.getText()+"||";
	                    textField_5.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(88, 73, 52, 40);
		frame.getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_6.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_6.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_6.getText().equals("X"))||(turn%2==0&&textField_6.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_6.getText()+"||";
	                    textField_6.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(166, 73, 52, 40);
		frame.getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_7.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_7.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_7.getText().equals("X"))||(turn%2==0&&textField_7.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_7.getText()+"||";
	                    textField_7.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(12, 139, 52, 40);
		frame.getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_8.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_8.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_8.getText().equals("X"))||(turn%2==0&&textField_8.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_8.getText()+"||";
	                    textField_8.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(88, 138, 52, 40);
		frame.getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int key=arg0.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {	if(turn%2==1&&textField_9.getText().equals("O")) {
						JOptionPane.showMessageDialog(null, "error its X's turn");
					}
					else if(turn%2==0&&textField_9.getText().equals("X")){
						JOptionPane.showMessageDialog(null, "error its O's turn");

					}
					else if((turn%2==1&&textField_9.getText().equals("X"))||(turn%2==0&&textField_9.getText().equals("O"))){
						turn++;
	                    status+="||"+textField_9.getText()+"||";
	                    textField_9.setEditable(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID INPUT");
					}
				}
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(166, 139, 52, 40);
		frame.getContentPane().add(textField_9);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(272, 28, 104, 16);
		frame.getContentPane().add(lblX);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(315, 31, 13, 64);
		frame.getContentPane().add(separator_1);
		
		JLabel lblO = new JLabel("O");
		lblO.setBounds(351, 28, 56, 16);
		frame.getContentPane().add(lblO);
		
		label_X = new JLabel("");
		label_X.setBounds(260, 57, 44, 25);
		frame.getContentPane().add(label_X);
		
		label_O = new JLabel("");
		label_O.setBounds(329, 57, 47, 25);
		frame.getContentPane().add(label_O);
		
		lblScore = new JLabel("Score");
		lblScore.setBounds(297, 13, 64, 15);
		frame.getContentPane().add(lblScore);
		
		JButton btnResetScore = new JButton("Reset Score");
		btnResetScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x_win=0;
				o_win=0;
				label_O.setText("");
				label_X.setText("");
			}
		});
		btnResetScore.setBounds(272, 108, 114, 25);
		frame.getContentPane().add(btnResetScore);
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}
}
