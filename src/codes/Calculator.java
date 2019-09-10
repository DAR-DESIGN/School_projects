package codes;
//Author@Dibyojyoti Bhattacharjee contact for support at iamdibs23@gamil.com

//task 15 of the school projects

//

//

//

//

import java.util.*;
import java.lang.*;

public class Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am a virtual hand-held calculator");
        System.out.println("I have the following functions");
        System.out.println("1:ADDITION");
        System.out.println("2:SUBTRACTION");
        System.out.println("3:MULTIPLICATION");

        System.out.println("4:INTEGER DIVISION");
        System.out.println("5:REMAINDER");
        System.out.println("6:FIND THE SQUARE ROOT OF A NO.");
        System.out.println("7:FIND THE CUBE ROOT OF A NO.");
        System.out.println("ENTER YOUR CHOICE :");
        int ch;
        ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter a no.");
                int a = scanner.nextInt();
                System.out.println("Enter another no.");
                int b = scanner.nextInt();
                int res = a + b;
                System.out.println("The sum " + a + " and " + b + " is : " + res);
                break;
            case 2:
                System.out.println("Enter a No.");
                int c = scanner.nextInt();
                System.out.println("Enter another No.");
                int x = scanner.nextInt();
                int rse = c - x;
                System.out.println("The Difference " + c + " and " + x + " is : " + rse);
                break;
            case 3:
                System.out.println("Enter a no.");
                int a1 = scanner.nextInt();
                System.out.println("Enter The another no.");
                int b1 = scanner.nextInt();
                int sre = a1 * b1;
                System.out.println("The Product " + a1 + " and " + b1 + " is : " + sre);
                break;
            case 4:
                System.out.println("Enter the no. which is to be divided:");
                int num = scanner.nextInt();
                System.out.println("Enter the no. which will be the denominator");
                int den = scanner.nextInt();
                int ser = num / den;
                System.out.println("The Division " + num + " by " + den + " is : " + ser);


                break;
            case 5:
                System.out.println("Enter the no. at the numerator ");
                int nu = scanner.nextInt();
                System.out.println("Enter The no. at the denominator");
                int de = scanner.nextInt();
                int re = nu % de;
                System.out.println("The remainder when " + nu + " is divided by " + de + " is " + re);
                break;
            case 6:
                System.out.println("Enter the no. whose square root will have to be found out:");
                int x1 = scanner.nextInt();
                double result = Math.sqrt(x1);
                System.out.println("THE SQUARE ROOT OF " + x1 + " is : " + result);
                break;
            case 7:
                System.out.println("Enter the no. whose cube root will be found out:");
                int x2 = scanner.nextInt();
                double result1 = Math.cbrt(x2);
                System.out.println("The cube root of " + x2 + " is " + result1);
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
}

