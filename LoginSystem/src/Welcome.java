import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Welcome  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(6, 13, 56, 16);
		frame.getContentPane().add(lblName);

		JLabel lblUniversity = new JLabel("University:");
		lblUniversity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUniversity.setBounds(6, 43, 84, 16);
		frame.getContentPane().add(lblUniversity);

		JLabel lblCourses = new JLabel("Courses:");
		lblCourses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourses.setBounds(6, 69, 84, 16);
		frame.getContentPane().add(lblCourses);
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(60, 11, 190, 22);
		frame.getContentPane().add(textField_12);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(84, 41, 201, 22);
		frame.getContentPane().add(textField_13);
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(6, 90, 525, 87);
		frame.getContentPane().add(textField);
		Student s1=new Student();
		textField_12.setText(s1.getfirstName()+" "+s1.getlastName());
		textField_13.setText(s1.getUniversity());
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 14));

		/*		try {
			Student s=new Student();
			//Class.forName("com.sql.jdbc.Driver");
			Connection conne=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data","root","");
			String sql="select firstName,lastName,university from student_data where username='"+s.getUsername()+"'and password='"+s.getPassword()+"'" ;

			Statement pst=conne.createStatement();
			ResultSet rs=pst.executeQuery(sql);
			String a="";
			int b=1;

			while( rs.next()) {
						conne.close();}}
			catch (Exception e5) {
				System.out.println(e5);
			}
		 */

		JButton btnAddCourse = new JButton("Get Courses I am \r\nEnrolled in");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Student s=new Student();
					//Class.forName("com.sql.jdbc.Driver");
					Connection conne=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
					String sql="select* from student_data where username='"+s.getUsername()+"'and password='"+s.getPassword()+"'" ;

					Statement pst=conne.createStatement();
					ResultSet rs=pst.executeQuery(sql);
					String a="";
					int b=1;
					while( rs.next()) {

						int numOfCourses=rs.getInt(3);

						for(int c=7;c<=6+numOfCourses;c++) {
							if(c==7||c==6+numOfCourses) {a+=rs.getString(c);}
							else if(rs.getString(c)!=null &&(c!=7)) {
								a+=rs.getString(c)+",";}
						}
						//if(rs.getString(12)!=null) {	a+=rs.getString(12);}

					}
					if(!a.equals("")) {
						textField.setText(a);
						textField.setFont(new Font("Tahoma", Font.BOLD, 14));}
					else {
						textField.setText("ERROR you are not enrolled in courses!");
						textField.setFont(new Font("Tahoma", Font.BOLD, 14));}


					conne.close();}catch(Exception e2) {
						System.out.println(e2);
					}

			}
		});
		btnAddCourse.setBounds(6, 178, 279, 50);
		frame.getContentPane().add(btnAddCourse);

		JButton btnGetCgpa = new JButton("Get CGPA");
		btnGetCgpa.setBounds(12, 231, 97, 25);
		frame.getContentPane().add(btnGetCgpa);



		JButton btnAddCourse_1 = new JButton("Add Course");
		btnAddCourse_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Student s=new Student();
					Connection connect1=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data","root","9895971173");
					Statement state=connect1.createStatement();
					String act1="select course_count from login where username='"+s.getUsername()+"' and password='"+s.getPassword()+"'";
					ResultSet rs3=state.executeQuery(act1);
					int coursenum=0;
					if(rs3.next()) {
						coursenum=rs3.getInt(1)+1 ;}
					String course=""+coursenum;
					//	String act="update student_data set ?=?, numberOfCourses=? where username=? ";
					String act="UPDATE login SET 1=?, 2=?, 3=?, 4=?, 5=?, 6=?, 7=?, 8=?, 9=?, 10=?  WHERE username=?" ;

					PreparedStatement state1=connect1.prepareStatement(act);
					/*	state1.setString(1, course);
				state1.setString(2, textField_1.getText());
				state1.setInt(3, coursenum);
				state1.setString(4, s.getUsername());
				state1.executeUpdate();*/
					/*	state1.setString(1, textField_1.getText());
					state1.setInt(2, coursenum);
				    state1.setString(3, s.getUsername());
					  state1.executeUpdate();*/
					for(int g=1;g<=10;g++) {
						if(g==coursenum) {
							state1.setString(g, textField_1.getText());
						}
						else {
							state1.setString(g, null);
						}
					}
					state1.setString(11, s.getUsername());
			int a=	state1.executeUpdate();

					//int p=state1.executeUpdate(act);
					if(a>0) {
						JOptionPane.showMessageDialog(null, "Success you have added the course "+textField_1.getText());
					}
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		btnAddCourse_1.setBounds(392, 242, 129, 25);
		frame.getContentPane().add(btnAddCourse_1);

		textField_1 = new JTextField();
		textField_1.setBounds(171, 243, 190, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

	}
}
