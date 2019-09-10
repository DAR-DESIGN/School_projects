package codes;
/*
author Dibyojyoti Bhattacharjee
Task 13 of school_projects ;
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import static java.lang.System.out;

public class palinString {
    public static void main(String[] args)throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        out.println("Enter a String");
        String str = bufferedReader.readLine();
        String check = str;
        int l = str.length();
        char ch ;
        String s = new String();
        for (int i = l-1 ;i>=0;i--)
        {
            ch = str.charAt(i);
            s = s + ch;


        }
        if(s.equals(check))
        {
            out.println("New String : "+check.toUpperCase());
        }
        else
        {
            out.println("New String : "+ check);
        }

    }
}
