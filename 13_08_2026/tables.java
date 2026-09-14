// create a program in java using the concept of scanner , 
// class and object . class name is table take the value from the user and implement 
// the concept of parametrize concept of and display table.

import java.util.*;
class table
{
	table(int a)
	{
		for(int i=1; i<=10;i++)
		{
			int ans =a*i;
			System.out.println(a+"*"+i+"="+ans);
		}
	}
	
}
public class tables
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a=sc.nextInt();
		table t =new table(a);
	}
}
