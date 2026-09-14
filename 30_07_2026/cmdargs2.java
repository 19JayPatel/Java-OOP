/*Write a program in the command argument line result . */

public class cmdargs2 {
	public static void main(String k[]) {
		int r = Integer.parseInt(k[0]);
		String nm = k[1];
		int mark1 = Integer.parseInt(k[2]);
		int mark2 = Integer.parseInt(k[3]);
		float total;
		total = mark1 + mark2;

		System.out.println("Rollno: " + r + "\n" + "Name: " + nm + "\n" + "Total:" + total);

	}
}
