/*Write a program to check whether a number is even or odd. */

import java.util.Scanner;

public class even_odd {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		System.out.println("Number is :" + n);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();

		int rlno;
		System.out.println("Enter Roll Number : ");
		rlno = sc.nextInt();

		System.out.println("Enter Roll No: " + rlno);
		System.out.println("Enter Name : " + name);

		if (n % 2 == 0) {
			System.out.println("Answer is  : Even ");
		} else {
			System.out.println("Answer is  : Odd ");
		}
	}
}
