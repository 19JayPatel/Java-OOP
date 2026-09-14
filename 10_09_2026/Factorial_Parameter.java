/* factorial use the concept of command line args this keyword default connector and parameter construction. */

class Factorial
{
	int n;
    	int fact;

    	// Default Constructor
    	Factorial()
    	{
        		this.n = 0;
        		this.fact = 1;
    	}

    	// Parameterized Constructor
    	Factorial(int n)
    	{
        		this.n = n;
        		this.fact = 1;
    	}

    	// Member Function
    	void display()
    	{
        		for(int i = 1; i <= n; i++)
        		{
            			fact = fact * i;
        		}

        		System.out.println("Number    : " + n);
        		System.out.println("Factorial : " + fact);
   	 }
}

public class Factorial_Parameter
{
    	public static void main(String a[])
    	{
        		int n = Integer.parseInt(a[0]);

       		 // Parameterized Constructor
       		 Factorial f1 = new Factorial(n);

        		f1.display();
    	}
}
