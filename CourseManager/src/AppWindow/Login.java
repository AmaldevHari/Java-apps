package AppWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblLogin.setBounds(174, 13, 236, 107);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(72, 154, 168, 42);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(72, 236, 168, 42);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(220, 166, 242, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login="";
				try {
					FileReader f=new FileReader("Login/Login.txt");
					BufferedReader ff=new BufferedReader(f);
					
					while((login=ff.readLine())!=null) {
					
						if(login.equals(textField.getText()+"_"+textField_1.getText())) {
							
							Welcome.main(null);
							ff.close();
							break;
							
						}
						
					
					}
					
					
					
				}catch(Exception e) {
					System.out.println(e);
				}
				if((login==null)){
					JOptionPane.showMessageDialog(null, "Error, invalid login");
				}
				
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOk.setBounds(365, 366, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JLabel lblNotRegistered = new JLabel("Not registered?");
		lblNotRegistered.setBounds(38, 350, 123, 16);
		frame.getContentPane().add(lblNotRegistered);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Registration.main(null);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegister.setBounds(38, 368, 159, 25);
		frame.getContentPane().add(btnRegister);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(220, 248, 242, 22);
		frame.getContentPane().add(textField_1);
	}
}
