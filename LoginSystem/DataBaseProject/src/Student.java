import java.util.ArrayList;
import java.util.Hashtable;

public class Student {
String firstName;
String address;
String university;
String yearLevel;
String lastName;
String password;
String username;
Hashtable<String,String> course_grades;
public Student() {}
void addCourse(String course) {
	this.course_grades.put(course, "n/a");
	
}
void addGrades(String course, String grade) {
	this.course_grades.replace(course, grade);
}
void addCourseAndGrades(String course, String grade) {
	this.course_grades.put(course, grade);
}
String getCourseGrade(String course) {
	return this.course_grades.get(course);
}
void setfirstName(String a) {
	this.firstName=a;
}
void setlastName(String a) {
	this.lastName=a;
}
void setaddress(String a) {
	this.address=a;
}
void setUniversity(String a) {
	this.university=a;
}
void setyearLevel(String a) {
	this.yearLevel=a;
}
void setUsername(String a) {
	this.username=a;
}
void setPassword(String a) {
	this.password=a;
}
String getfirstName(String a) {
	return this.firstName=a;
}
String getlastName(String a) {
	return this.lastName=a;
}
String getaddress(String a) {
	return this.address=a;
}
String getUniversity(String a) {
	return this.university=a;
}
String getyearLevel(String a) {
	return this.yearLevel=a;
}
String getUsername(String a) {
	return this.username=a;
}
String getPassword(String a) {
	return this.password=a;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
