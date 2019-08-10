package games;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TicTacToe {
static int turn=1;
static 	String check="";
	private JFrame frame;
	private JTextField textField;

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
		
		JLabel lblNewLabel = new JLabel("A                  B                 C");
		lblNewLabel.setBounds(51, 13, 214, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setBounds(12, 49, 20, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("2");
		label.setBounds(12, 97, 20, 35);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("3");
		label_1.setBounds(12, 153, 20, 35);
		frame.getContentPane().add(label_1);
		
		JButton button_1A = new JButton("");
		button_1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1A.setBounds(37, 54, 53, 25);
		frame.getContentPane().add(button_1A);
		
		JButton button_1B = new JButton("");
		button_1B.setBounds(113, 54, 53, 25);
		frame.getContentPane().add(button_1B);
		
		JButton button_1C = new JButton("");
		button_1C.setBounds(188, 54, 53, 25);
		frame.getContentPane().add(button_1C);
		
		JButton button_2A = new JButton("");
		button_2A.setBounds(37, 102, 53, 25);
		frame.getContentPane().add(button_2A);
		
		JButton button_2B = new JButton("");
		button_2B.setBounds(113, 102, 53, 25);
		frame.getContentPane().add(button_2B);
		
		JButton button_2C = new JButton("");
		button_2C.setBounds(188, 102, 53, 25);
		frame.getContentPane().add(button_2C);
		
		JButton button_3C = new JButton("");
		button_3C.setBounds(188, 158, 53, 25);
		frame.getContentPane().add(button_3C);
		
		JButton button_3B = new JButton("");
		button_3B.setBounds(113, 158, 53, 25);
		frame.getContentPane().add(button_3B);
		
		JButton button_3A = new JButton("");
		button_3A.setBounds(37, 158, 53, 25);
		frame.getContentPane().add(button_3A);
		
		textField = new JTextField();
		textField.setBounds(280, 166, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pos=textField.getText();
				textField.setText("");
				String insert="";
				
				
				char var1=pos.charAt(0);
				char var2=pos.charAt(2);
			
				if(check.contains(pos)) {
					JOptionPane.showMessageDialog(null, "Error you cannot modify already set box");
				}
				while(!check.contains(pos)) {
					if(turn%2==0) {
						insert="O";
						turn++;
					}
					else {
						insert="X";
						turn++;
					}
					check+=pos;
				if(var1=='1') {
					if(var2=='A') {
						button_1A.setText(insert);
					
					}
					else if(var2=='B') {
						button_1B.setText(insert);
					}
					else if(var2=='C') {
						button_1C.setText(insert);
					}
				}
				else if(var1=='2') {
					if(var2=='A') {
						button_2A.setText(insert);
					}
					else if(var2=='B') {
						button_2B.setText(insert);
					}
					else if(var2=='C') {
						button_2C.setText(insert);
					}
				}
				else if(var1=='3') {
					if(var2=='A') {
						button_3A.setText(insert);
					}
					else if(var2=='B') {
						button_3B.setText(insert);
					}
					else if(var2=='C') {
						button_3C.setText(insert);
					}
				}
				
				}
				
			}
		});
		btnOk.setBounds(299, 215, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JLabel lblEnterrcComa = new JLabel("Enter Row,Column ");
		lblEnterrcComa.setBounds(280, 101, 133, 26);
		frame.getContentPane().add(lblEnterrcComa);
		
		JLabel lblSeperated = new JLabel("coma seperated ");
		lblSeperated.setBounds(280, 120, 133, 26);
		frame.getContentPane().add(lblSeperated);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turn=1;
				check="";
				button_1A.setText("");
				button_2A.setText("");
				button_3A.setText("");
				button_1B.setText("");
				button_1C.setText("");
				button_2B.setText("");
				button_2C.setText("");
				button_3B.setText("");
				button_3C.setText("");
			}
		});
		btnReset.setBounds(22, 215, 97, 25);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] status=new String[8];
				status[0]=button_1A.getText() +button_1B.getText()+button_1C.getText();
				status[1]=button_2A.getText() +button_2B.getText()+button_2C.getText();
				status[2]=button_3A.getText() +button_3B.getText()+button_3C.getText();
				status[3]=button_1A.getText() +button_2A.getText()+button_3A.getText();
				status[4]=button_1B.getText() +button_2B.getText()+button_2B.getText();
				status[5]=button_1C.getText() +button_2C.getText()+button_3C.getText();
				status[6]=button_1A.getText() +button_2B.getText()+button_3C.getText();
				status[7]=button_1C.getText() +button_2B.getText()+button_3A.getText();
				int start=0;
				String bpyx="";
				while(start<8) {
					bpyx+="|||"+status[start]+"|||";
					start++;
					
				}
				if(bpyx.contains("XXX")) {
					JOptionPane.showMessageDialog(null, "X wins!");
				}
				else if(bpyx.contains("OOO")) {
					JOptionPane.showMessageDialog(null, "O wins!");
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
		
		JLabel lblExa = new JLabel("ex: 1,A");
		lblExa.setBounds(280, 140, 133, 26);
		frame.getContentPane().add(lblExa);
		
		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instructions.main(null);
			}
		});
		btnInstructions.setBounds(299, 34, 121, 25);
		frame.getContentPane().add(btnInstructions);
	}
}
