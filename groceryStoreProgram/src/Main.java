import java.util.Scanner;

public class Main {

    //The program that prints the total amount of the products bought by the users
    // from the grocery store, according to the kilogram values.
    // apple =$3,65 ; peach=$2,00 ; tomato = $1,15 ; cucumber = $5,95;  banana =$4,00

    public static void main(String[] args) {

        int kg;
        double   apple =3.65 ,peach=2.00 , tomato = 1.15 , cucumber = 5.95,  banana =4.00;
        double total =0;

        Scanner kilogram = new Scanner(System.in);
        System.out.println("Please enter how many kilos of apples you buy :");
        kg=kilogram.nextInt();
        total = total + (kg*apple);

        System.out.println("Please enter how many kilos of peaches you buy :");
        kg=kilogram.nextInt();
        total = total + (kg*peach);

        System.out.println("Please enter how many kilos of tomatoes you buy :");
        kg=kilogram.nextInt();
        total = total + (kg*tomato);

        System.out.println("Please enter how many kilos of cucumbers you buy :");
        kg=kilogram.nextInt();
        total = total + (kg*cucumber);

        System.out.println("Please enter how many kilos of bananas you buy :");
        kg=kilogram.nextInt();
        total = total + (kg*banana);

        System.out.println("Total :" +total);


    }
}
