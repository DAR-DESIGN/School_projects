package codes;
/*Author@Dibyojyoti Bhattacharjee contact for support at iamdibs23@gamil.com
task 4 of the school projects



 */
import java.lang.*;
import java.util.*;
import java.io.*;

public class Employee {
    public int emp_code ;
    public String emp_name ;
    public int anngross;
    public double tax,nets ;
    Employee()
    {
        emp_code = anngross = 0 ; ;
        emp_name = null ;
        tax = nets = 0.0 ;

    }
    public void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee name ");
        emp_name = scanner.nextLine();
        System.out.println("Enter the employee code");
        emp_code = scanner.nextInt();
        System.out.println("Enter the annual gross income");
        anngross = scanner.nextInt();
        scanner.close();


    }
    public void calcTax()
    {
        if (anngross<=100000)
        {
            tax = 0.0 ;
        }
        else if (anngross>=100001 && anngross<=500000) {
            tax = 1000 + (10*(anngross-100000))/100.0 ;
        }
        else if (anngross>=500001 && anngross<=800000)
        {
            tax = 5000 + (20*(anngross-500000))/100.0;
        }
        else if (anngross>800000)
        {
            tax = 10000 + (30 * (anngross - 800000)) / 100.0;
        }
        nets = anngross - tax;


    }
    public void display()
    {
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee Code : "+emp_code);
        System.out.println("Annual Gross Income : "+anngross);
        System.out.println("The tax levied is : " +tax);
        System.out.println("The Net salary is : "+nets);
    }
    public static void main(String[] args)
    {
        Employee ob = new Employee();
        ob.getData();
        ob.calcTax();
        ob.display();
    }



}
