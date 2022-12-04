import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // getting inout from user and calculate factorial
        // n!=1*2*3*4*5*6*...*n

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int num = scan.nextInt();
        int total=1;

        for(int i=1; i<=num;i++){
            total=total*i;
        }
        System.out.println(num + "!="+total);

    }
}
