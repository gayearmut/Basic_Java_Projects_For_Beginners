import java.util.Scanner;

public class Main {
    /* suggest activity based on temperature:
 * 5<t --->skiing
 * 5<t<15 --->cinema
 * 10<t<25 --->picnic
 * t>25 --->swimming */

    public static void main(String[] args) {

        int t;
        Scanner temp = new Scanner(System.in);

        System.out.println("Please enter the temperature...");
        t = temp.nextInt();

        if(t<=5){
            System.out.println("The temperature fit for 'skiing'");
        }

        else if (t<=25){

            if(t<=15){
                System.out.println("The temperature fit for 'cinema'");
            }

            if(t>=10){
                System.out.println("The temperature fit for 'picnic'");
            }
        }
        else {
                System.out.println("The temperature fit for 'swimming'");
        }
    }
}
