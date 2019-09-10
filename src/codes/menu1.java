package codes;
//author Dibyojyoti Bhattacherjee
//task 7
import java.util.*;
import java.io.*;
import java.lang.*;

public class menu1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:CHECK IF A NO. IS ARMSTRONG");
        System.out.println("2:CHECK IF A NO. IS PALINDROME");
        System.out.println("ENTER YOUR CHOICE");
        int ch =scanner.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter a no.");
                int n =scanner.nextInt();
                int x= n ;
                int s = 0 ;
                int dig = 0 ;
                while (n!=0)
                {
                    dig = n%10;
                    s = s + (dig*dig*dig);
                    n /= 10 ;
                }
                if (x==s)
                {
                    System.out.println(x+" is an Armstrong no.");
                }
                else
                {
                    System.out.println(x+" is not an Armstrong no.");
                }
                break;
            case 2:
                System.out.println("Enter a no . ");
                int n1 = scanner.nextInt();
                int z = n1;
                int rv,dig1 ;
                rv = dig1 = 0 ;
                while (n1!=0)
                {
                    dig1 = n1%10;
                    rv = 10*rv + dig1;
                    n1 /=10 ;
                }
                if(z==rv)
                {
                    System.out.println(z+" is a palindrome no.");

                }
                else
                {
                    System.out.println(rv+" is not a palindrome no.");
                }
                break;
            default:
                System.out.println("Invalid choice");



        }
    }
}
