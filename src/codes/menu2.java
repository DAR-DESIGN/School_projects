package codes;
//author Dibyojyoti Bhattacherjee
//task 8 of school_projects


import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
public class menu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("1:CHECK IF A NO. IS A SPECIAL NO.");
        out.println("2:CHECK IF A NO. IS An AUTOMORPHIC NO.");
        out.println("Enter your choice");
        int ch = sc.nextInt();
        int dig = 0;
        int x, s;
        s = 0;
        boolean c1 = false;


        switch (ch) {
            case 1:
                out.println("Enter a no.");
                int n = sc.nextInt();
                x = n;
                while (n != 0) {
                    dig = n % 10;
                    int c = fact(dig);
                    s = s + c;
                    n /= 10;


                }
                if (s == x) {
                    out.println(x + " is a Special No.");

                } else {
                    out.println(x + " is not a Special No.");
                }
                break;
            case 2:
                out.println("Enter A no.");
                int a = sc.nextInt();
                int sq = a * a;
                int y = sq;
                int c = 0;
                while (true) {

                    if (sq > 10) {
                        sq /= 10;
                        c++;
                    } else {
                        break;
                    }
                }
                int rse = (int) Math.pow(10, c);
                if (check(y, rse)) c1 = true;
                else c1 = false;
                if (c1 == false) {
                    out.println(a + " is not an Automorphic No.");
                } else {
                    out.println(a + " is an Automorphic No.");
                }
                break;


            default:
                out.println("Invalid Choice");
        }
    }


    public static int fact(int a) {
        int a1 = a;
        int f = 1;
        for (int i = 1; i <= a1; ++i) {
            f *= i;

        }
        return f;
    }

    public static boolean check(int a1, int b1) {
        int res = a1 % b1;
        return res == (int) Math.sqrt(a1);
    }
}



