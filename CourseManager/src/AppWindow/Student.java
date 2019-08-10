package AppWindow;
import java.util.ArrayList;
import java.util.Hashtable;

public class Student {
static String firstName=" ";
static String address=" ";
static String university=" ";
static String yearLevel=" ";
static String lastName=" ";
static String password=" ";
static String username=" ";
static int course=1;
static Hashtable<String,String> course_grades= new Hashtable<String,String>();
public Student() {}
void addCourse(String course) {
	Student.course_grades.put(course, "n/a");
	
}
void addGrades(String course, String grade) {
	Student.course_grades.replace(course, grade);
}
void addCourseAndGrades(String course, String grade) {
	Student.course_grades.put(course, grade);
}
String getCourseGrade(String course) {
	return Student.course_grades.get(course);
}
void setfirstName(String a) {
	Student.firstName=a;
}
void setlastName(String a) {
	Student.lastName=a;
}
void setaddress(String a) {
	Student.address=a;
}
void setUniversity(String a) {
	Student.university=a;
}
void setyearLevel(String a) {
	Student.yearLevel=a;
}
void setUsername(String a) {
	Student.username=a;
}
void setPassword(String a) {
	Student.password=a;
}
String getfirstName() {
	return Student.firstName;
}
String getlastName() {
	return Student.lastName;
}
String getaddress() {
	return Student.address;
}
String getUniversity() {
	return Student.university;
}
String getyearLevel() {
	return Student.yearLevel;
}
String getUsername() {
	return Student.username;
}
String getPassword() {
	return Student.password;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
