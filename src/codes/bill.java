package codes;

//author Dibyojyoti Bhattacharjee
//Task 5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;


public class bill {

    private static String name;
    private static String month;
    private static int units;
    private static double ebill;
    private static double rebill;

    bill() {
        name = "";
        month = "";
        units = 0;
        ebill = rebill = 0.0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        Scanner scanner = new Scanner(in);
        int[] arr = new int[4];
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            out.println("Enter the name of the customer");
            name = bufferedReader.readLine();
            out.println("Enter The name of the month");
            month = bufferedReader.readLine();
            out.println("Enter the no. of units consumed");
            units = scanner.nextInt();
            bill.compute();
            bill.display();
        }


    }

    public static void compute() {
        if (units <= 100) {
            ebill = 0.50 * units;
        }
        if (units > 100 && units <= 250) {
            ebill = 0.50 * 100 + 0.75 * (units - 150);

        }
        if (units > 250 && units <= 400) {
            ebill = 0.50 * 100 + 0.75 * 150 + (units - 250);


        }
        if (units > 400) {
            ebill = (0.50 * 100) + (0.75 * 150) + 250 + 1.5 * (units - 400);
        }
        rebill = ebill + 250;
    }

    public static void display() {
        out.println("*************************ELECTRIC BILL*******************************************");
        out.println("Name : " + name);
        out.println("Month : " + month);
        out.println("Units Consumed : " + units);
        out.println("BILL IS : Rs" + rebill);
    }
}






