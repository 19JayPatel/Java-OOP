/* Create a java program using the concept of class object and scanner. The data members are inside a class emp , employee is ,  name , salary , total no leaves. Calculate a gross salary 
The formula is s+hra+da-pf.  
HRA=20% of official salary
DA 10% of a salary
PA 200 rupees.
If leave is < 2 give the official salary . 
if leave is > 5 deduct 5% salary.
If leave is more than 8 deduct 30% from the salary   */

import java.util.Scanner;

class emp
{
    Scanner sc = new Scanner(System.in);

    String e_name;
    int e_id;
    int total_leave;

    float e_salary;
    float e_hra;
    float e_da;
    float e_pf = 200;
    float e_gross;

    void input()
    {
        System.out.println("Enter Employee Name : ");
        e_name = sc.nextLine();

        System.out.println("Enter Employee Id : ");
        e_id = sc.nextInt();

        System.out.println("Enter Employee Salary : ");
        e_salary = sc.nextFloat();

        System.out.print("Enter Total No. of Leaves : ");
        total_leave = sc.nextInt();
    }

    void display()
    {
        // HRA = 20% of official salary
        e_hra = e_salary * 0.20f;

        // DA = 10% of official salary
        e_da = e_salary * 0.10f;

        // Leave deduction
        if(total_leave < 2)
        {
            // No deduction
        }
        else if(total_leave > 8)
        {
            e_salary = e_salary - (e_salary * 0.30f);
        }
        else if(total_leave > 5)
        {
            e_salary = e_salary - (e_salary * 0.05f);
        }

        // Gross Salary = S + HRA + DA - PF
        e_gross = e_salary + e_hra + e_da - e_pf;

        System.out.println("\n---------- Employee Details ----------");

        System.out.println("Employee Name  : " + e_name);
        System.out.println("Employee Id  : " + e_id);
        System.out.println("Employee Salary  : " + e_salary);
        System.out.println("Employee HRA  : " + e_hra);
        System.out.println("Employee DA : " + e_da);
        System.out.println("Employee PF : " + e_pf);
        System.out.println("Total No. of Leaves : " + total_leave);
        System.out.println("Employee Gross Salary  : " + e_gross);
    }
}

public class employee
{
    public static void main(String args[])
    {
        emp e = new emp();

        e.input();
        e.display();
    }
}
