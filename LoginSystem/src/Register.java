import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.ImageIcon;
public class Register  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	 Student s=new Student();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(224, 31, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setBounds(12, 31, 146, 22);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(12, 66, 146, 22);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblUniversity = new JLabel("University:");
		lblUniversity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUniversity.setBounds(12, 101, 146, 22);
		frame.getContentPane().add(lblUniversity);
		
		JLabel lblYearLevel = new JLabel("Year level:");
		lblYearLevel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYearLevel.setBounds(12, 131, 146, 22);
		frame.getContentPane().add(lblYearLevel);
		
		JLabel lblAddress = new JLabel("Address(optional):");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(12, 162, 146, 22);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblUsername = new JLabel("username:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(12, 197, 146, 22);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(12, 227, 146, 22);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 67, 116, 22);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(224, 102, 116, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(224, 132, 116, 22);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(224, 163, 116, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(224, 198, 116, 22);
		frame.getContentPane().add(textField_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 228, 116, 22);
		frame.getContentPane().add(passwordField);
	
		
		JButton btnRegister = new JButton("Register!");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data ","root","9895971173");
				PreparedStatement st=conn.prepareStatement("insert into login(firstName,lastName,university,yearLevel,username,password)values(?,?,?,?,?,?)");
				
				st.setString(1, textField.getText());
				st.setString(2, textField_1.getText());
				st.setString(3, textField_2.getText());
				st.setString(4, textField_3.getText());
				st.setString(5, textField_5.getText());
				st.setString(6, passwordField.getText());
				
				int a=st.executeUpdate();
				if(a>0) {
					JOptionPane.showMessageDialog(null, "Registration Complete");
					conn.close();
				 
					s.setfirstName(textField.getText());
					s.setlastName(textField_1.getText());
					s.setUniversity(textField_2.getText());
					s.setyearLevel(textField_3.getText());
					s.setUsername(textField_5.getText());
					s.setPassword(passwordField.getText());
					
				}
				else {
					JOptionPane.showMessageDialog(null, "ERROR occured try again");
				}
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
			
		});
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBounds(139, 286, 97, 25);
		frame.getContentPane().add(btnRegister);
	}
}
