package games;

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
		txtrEnterThePosition.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrEnterThePosition.setText("X starts the game, with alternating turns i.e X,O,X,O,..\r\nEnter the position co-ordinates coma seperated in \r\nthe text field provided and click OK on your turn.\r\nFor instance 1,A.\r\nClick on check to see the status of the game.\r\nClick on reset to reset all fields.");
		txtrEnterThePosition.setBounds(0, 13, 420, 187);
		frame.getContentPane().add(txtrEnterThePosition);
	}
}
