//Prime number

import java.util.*;

class prime
{
    prime(int a)
    {
        int count = 0;

        for(int i=1; i<=a; i++)
        {
            if(a % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println(a + " is Prime Number");
        }
        else
        {
            System.out.println(a + " is Not Prime Number");
        }
    }
}

public class prime_num
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Prime Number : ");
        int a = sc.nextInt();

        prime p = new prime(a);
    }
}
