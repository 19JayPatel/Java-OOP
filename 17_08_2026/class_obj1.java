
/*crate a java program which has concept ogf class and object.
class name is student which are having data mambers rollno. and name .consider by defult static value variable name as total . find out the % and display student roll no,student name and %.
*/
import java.util.Scanner;

class student {
	Scanner sc = new Scanner(System.in);
	int s_rollno;
	String s_name;
	float per;
	static int total = 400;

	void input() {
		System.out.print("Enter Student Name: ");
		s_name = sc.nextLine();

		System.out.print("Enter Roll No: ");
		s_rollno = sc.nextInt();

		per = total / 4.0f;
	}

	void display() {

		System.out.println("\n--- Student Details ---");
		System.out.println("Student Roll No: " + s_rollno);
		System.out.println("Student Name   : " + s_name);
		System.out.println("Percentage     : " + per + "%");

	}
}

public class class_obj1 {
	static {
		System.out.println("Rollno : 39");
		System.out.println("Name : Zalak");
		System.out.println("Branch : 1MCA");
	}

	public static void main(String t[]) {
		student s1 = new student();
		s1.input();
		s1.display();
	}
}
