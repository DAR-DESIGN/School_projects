package codes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;



public class menu3 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        out.println("1:DISPLAY THE NO. OF VOWELS,CONSONANTS,SPACES AND CHARACTERS IN A SENTENCE");
        out.println("2:PRINT A SENTENCE WITH UPPER AND LOWER CASES REVERSED");
        out.println("Enter your choice");
        int ch = Integer.parseInt(br.readLine());
        //out.println(ch);
        switch(ch) {
            case 1:
                System.out.println("Enter a sentence");
                String str = br.readLine();
                int l = str.length();
                char ch1;
                int c = 0, c1 = 0, c2 = 0, c3 = 0;
                for (int i = 0; i < l; i++) {
                    ch1 = str.charAt(i);
                    final boolean b = ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U';
                    if (b) {
                        c++;
                    }

                    if (Character.isWhitespace(ch1)) {
                        c2++;

                    }
                    if (Character.isLetter(ch1)) {
                        c3++;
                    }
                }

                out.println("NO. OF VOWELS ARE : " + c);
                out.println("NO. OF CONSONANTS ARE : " + (c3 - c));
                out.println("NO. OF SPACES ARE : " + c2);
                out.println("NO. OF CHARACTERS ARE : " + c3);
                break;

            case 2 :
                out.println("ENTER A SENTENCE");
                String s = br.readLine();
                int l1 = s.length();
                char ch2 ;
                String s3 = "";
                for (int i = 0 ; i < l1 ; ++i)
                {
                    ch2 = s.charAt(i);
                    if(Character.isLetter(ch2))
                    {
                        if (Character.isLowerCase(ch2))
                        {
                            s3 = s3 + Character.toUpperCase(ch2);
                        }
                        else if (Character.isUpperCase(ch2))
                        {
                            s3 = s3 + Character.toLowerCase(ch2);
                        }
                    }
                    else
                    {
                        s3 = s3 + ch ;
                    }


                }
                out.println("New String : "+s3);
                break;
            default:
                out.println("Invalid Choice");
        }





    }
}
