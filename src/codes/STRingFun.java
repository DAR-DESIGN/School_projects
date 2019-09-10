package codes;
/*
author Dibyojyoti Bhattacharjee
Task 20
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;


public class STRingFun {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        System.out.println("ENTER A SENTENCE");
        String str = bufferedReader.readLine();
        str = " " + str;
        int l = str.length();
        char ch;
        String s = "";

        for (int i = 0; i < l; ++i) {
            ch = str.charAt(i);
            if (ch == ' ') {
                s = s + str.charAt(i + 1);
            } else {
                continue;
            }
        }
        out.println("New String : " + s);

    }
}
