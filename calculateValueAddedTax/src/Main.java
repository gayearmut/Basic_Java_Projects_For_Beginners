import java.util.Scanner;

public class Main {

    // calculating value added tax program : you get from user the amount and calculate VAT.
    // (get %18 value added tax )

    public static void main(String[] args) {

        double amount;
        Scanner money = new Scanner(System.in);
        System.out.println("Please enter that you want calculate amount :");
        amount = money.nextDouble();

        double result = (amount +(amount * 0.18));
        System.out.println("Total :" +result);



    }
}
