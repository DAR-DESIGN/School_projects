package codes;
/*
author@Dibyojyoti Bhattachacharjee
email me for any problem at iamdibs23@gmail.com
*/


public class pattern2 {
    public static void main(String[] args){
        int i,j,k  ;
        char ch ='A';
        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            for (k=5;k>=i;k--){
                System.out.print(ch+" ");
            }
            ++ch;
            System.out.println();


        }
    }

}
