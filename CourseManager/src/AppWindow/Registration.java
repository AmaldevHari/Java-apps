package AppWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Registration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(29, 48, 135, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(29, 108, 135, 31);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(29, 175, 135, 31);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(136, 54, 267, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 114, 267, 22);
		frame.getContentPane().add(textField_1);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedWriter bf_name=new BufferedWriter(new FileWriter("Login/Name.txt",true)) ;
					BufferedWriter bf_Login=new BufferedWriter(new FileWriter("Login/Login.txt",true)) ;
					bf_name.append('\n');
					bf_Login.append('\n');
					
					bf_name.append(textField.getText());
					bf_Login.append(textField_1.getText()+"_"+textField_2.getText());
					bf_name.close();
					bf_Login.close();
					JOptionPane.showMessageDialog(null, "success");
				}catch(Exception e1) {
					System.out.println(e);
				}
				
				
			}
		
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRegister.setBounds(195, 299, 150, 25);
		frame.getContentPane().add(btnRegister);
		
		textField_2 = new JPasswordField();
		textField_2.setBounds(136, 181, 267, 22);
		frame.getContentPane().add(textField_2);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
