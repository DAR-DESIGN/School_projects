package codes;
/* author @Dibyojyoti Bhattacharjee(contact for problem:iamdibs23@gmail.com) */
//school projects task 1

import java.lang.*;

import java.util.*;

public class coinage {
    public static void main(String[] args){ //The main function
        int mon;
        Scanner scanner = new Scanner(System.in);


            System.out.println("ENTER THE AMOUNT TO BE FOUND FOR THE COINAGE");
            mon = scanner.nextInt();

        //amount of thousand rupee notes
            int amot = mon / 1000;
            System.out.println("No of Thousand Rupee Notes Are : " + amot);
            int resi = mon % 1000;
            //amount of five hundred rupee notes
            int amof = resi / 500;
            System.out.println("No. of the Five hundred rupee notes are : " + amof);
            int res = resi % 500;
            //amount of the hundred rupee notes
            int amoh = res / 100;
            System.out.println("No. of Hundred rupee notes are : " + amoh);
            int re = res % 100;
            //amount of the ten rupee notes
            int amott = re / 10;
            System.out.println("No. of Ten rupee notes are :" + amott);
            int rem = re % 10;
            //amount the 5 rupee notes
            int amofr = rem / 5;
            System.out.println("No. of the Five rupee notes are : " + amofr);
            int em = rem % 5;
            //amount of the five rupee notes
            int amoo = em / 1;
            System.out.println("No. of one rupee notes are : " + amoo);
            scanner.close();







    }
}
