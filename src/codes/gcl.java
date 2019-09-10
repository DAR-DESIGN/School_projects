package codes;
//author Dibyojyoti Bhattacharjee
//Task 2

import java.util.Scanner;

public class gcl {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int a =sc.nextInt();
        System.out.println("Enter another no.");
        int b= sc.nextInt();
        found(a,b);
    }
    public static void found(int a, int b)
    {
        int a1 =a ;
        int b1 = b;
        int gcd = 0,gc1 = 0;

        int lcm=0,lcm1 =0;
        if (a1>=b1)
        {
            for (int i = 1;i<=b;i++)
            {
                if (a1%i==0 && b1%i==0)
                {
                    gcd = i ;
                }
            }
            lcm = a1*b1/gcd;
            System.out.println("THE HCF OF "+a1+" & "+b1+" is "+gcd);
            System.out.println("THE LCM OF "+a1+" & "+b1+" is "+lcm);
        }
        if (b>a)
        {
            for (int j = 1;j<=a1;j++)
            {
                if (a1%j==0 && b1%j==0) {

                    gc1 = j;
                }

            }
            lcm1 = a1*b1/gc1;
            System.out.println("THE HCF OF "+a1+" & "+b1+" is "+gc1);
            System.out.println("THE LCM OF "+a1+" & "+b1+" is "+lcm1);
        }
    }
}
