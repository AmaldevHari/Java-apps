
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
public class LoginWindow {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
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
	public LoginWindow() {
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

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(48, 105, 105, 27);
		frame.getContentPane().add(panel);

		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblUsername);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(48, 167, 105, 27);
		frame.getContentPane().add(panel_1);

		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(lblPassword);

		textField = new JTextField();
		textField.setBounds(184, 110, 192, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(184, 172, 192, 22);
		frame.getContentPane().add(passwordField);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(139, 13, 192, 79);
		frame.getContentPane().add(panel_2);

		JLabel lblLogin = new JLabel("STUDENT LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblLogin);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					//Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data ","root","");
					Statement stat=con.createStatement();
				//	String sql="Select * from login where username='"+textField.getText()+"'and password='"+passwordField.getText()+"'";
					String sql="SELECT username,university,firstName,lastName from login where password='"+passwordField.getText()+"'";
					Student s=new Student();
					s.setUsername(textField.getText());
					s.setPassword(passwordField.getText());
					ResultSet rs=stat.executeQuery(sql);
					
					if(rs.next()) {
						//JOptionPane.showMessageDialog(null, "Login succesful!");
						s.setUniversity(rs.getString(2));
						s.setfirstName(rs.getString(3));
						s.setlastName(rs.getString(4));
						Welcome.main(null);
					}
					else {
						JOptionPane.showMessageDialog(null, "Login unsuccesful!");
						con.close();

					}
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOk.setBounds(259, 215, 117, 25);
		frame.getContentPane().add(btnOk);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register.main(null);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setBounds(12, 217, 97, 25);
		frame.getContentPane().add(btnRegister);
	}
}
