import java.util.Scanner;

public class Main {
    /*   *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

       for (int i =0; i<n; i++) {//upper triangle

           for (int j = n; j > i; j--) {//for spaces
               System.out.print(" ");
           }
           for (int k = 0; k <= i; k++) {//for stars
               System.out.print("* ");
           }
           System.out.println();
       }
        for (int s=1;s<=n;s++)//lower triangle
        {
            for (int l =1 ; l <=s; l++)//for spaces
            {
                System.out.print(" ");
            }
            for (int m = n; m >s ; m--)//for stars
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }


}
