/*Write a Java program to accept a number n from the user and display 
the first n multiples of 10 in ascending order, 
followed by the same multiples in descending order. */


import java.util.Scanner;

class suplymentry
{
    int n;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();
    }

    void display()
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.print(i * 10 + "\t");
        }

        System.out.println();

        for(int i = n; i >= 1; i--)
        {
            System.out.print(i * 10 + "\t");
        }
    }
}

public class revers
{
    public static void main(String args[])
    {
        suplymentry s1 = new suplymentry();

        s1.input();
        s1.display();
    }
}
