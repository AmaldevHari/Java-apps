package games_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;

public class instructions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					instructions window = new instructions();
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
	public instructions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrEnterThePosition = new JTextArea();
		txtrEnterThePosition.setEditable(false);
		txtrEnterThePosition.setFont(new Font("Monospaced", Font.BOLD, 12));
		txtrEnterThePosition.setText("X starts the game, with alternating turns i.e X,O,X,O,..\r\nEnter X or O in desired column and press 'Enter' key , \r\nonce set the value cannot be changed unless otherwise by\r\n resetting the game.\r\nClick on submit to evaluate the current state of the \r\ngame.If anyone wins all boxes will be reset and score will \r\nbe updated.\r\n\r\n");
		txtrEnterThePosition.setBounds(0, 13, 420, 187);
		frame.getContentPane().add(txtrEnterThePosition);
	}
}
