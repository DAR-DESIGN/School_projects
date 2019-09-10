package codes;
/* author @Dibyojyoti Bhattacharjee(contact for problem:iamdibs23@gmail.com) */
/* school projects task 11 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;


public class revString {
    private String s3;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        out.println("Enter a sentence");
        String str = bufferedReader.readLine();
        str = str + " ";

        int l = str.length();
        char ch;
        String s3 = "";
        String newr = "";
        for (int i = 0; i < l; ++i) {
            ch = str.charAt(i);
            if (ch == ' ') {
                String c = revString.newstr(s3);
                newr = newr + c + " ";
                s3 = "";

            } else {
                s3 = s3 + ch;
            }

        }
        out.println("New String : " + newr.trim());
    }

    public static String newstr(String s3) {
        String s4 = s3;
        int l1 = s4.length();
        String s5 = "";

        char ch1;
        for (int i = l1 - 1; i >= 0; --i) {
            ch1 = s4.charAt(i);
            s5 = s5 + ch1;

        }
        return s5;


    }

}
