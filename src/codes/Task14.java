package codes;
//author Dibyojyoti Bhattacherjee
//task 14 of school_projects
//show the program to amita ma'am

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task14 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        String str = br.readLine();
        int l = str.length();
        char ch ;
        String s ="";
        for (int i = 0 ; i<l;i++)
        {
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                ch =(char)((int)ch + 2) ;
                s = s + ch ;
            }
            else

                s = s + ++ch;

        }
        System.out.println("New String : " + s);

    }
}
