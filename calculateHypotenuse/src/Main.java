import java.util.Scanner;

public class Main {

    //program that gets the lenght of the perpendicular sides from the user and calculate the hypotenuse
    // perpendicular sides are = a,b ; hypotenuse =c formula : a^2 + b^2 = c^2

    public static void main(String[] args) {
	  int a,b;
	  double c;

        Scanner sides = new Scanner(System.in);
        System.out.println("Please enter one of the sides :");
        a = sides.nextInt();

        System.out.println("Please enter the other side :");
        b = sides.nextInt();

        c= Math.sqrt((a*a)+ (b*b));
        System.out.println("Hypotenuse :" +c);


    }
}
