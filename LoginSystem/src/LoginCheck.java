import java.io.BufferedReader;
import java.io.FileReader;

public class LoginCheck {
public static void main(String[] args) {
	try {
FileReader f=new FileReader("ok.txt");
BufferedReader bf=new BufferedReader(f);
Student s=new Student();
//System.out.println(s.getUsername()+" "+s.getPassword());
s.setUsername("lol");
s.setPassword("lol");
String loginData=s.getUsername()+"_"+s.getPassword();
while( bf.readLine()!=null) {
	if(( bf.readLine().equals(loginData) )) {
		Welcome.main(null);
	}
	break;
}
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
