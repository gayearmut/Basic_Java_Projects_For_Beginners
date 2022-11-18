import java.util.Scanner;

public class Main {

    //get height ang weight values from the user and calculate the BMI with the given formula
    //formula : weight(kg) / height (m) * height (m)
    public static void main(String[] args) {

        double kg,m,bmi;

        Scanner value = new Scanner(System.in);
        System.out.println("Please enter your height in meter:");
        m=value.nextDouble();
        System.out.println("Please enter your weight :");
        kg=value.nextDouble();

        bmi= kg/(m*m);

        System.out.println("Your height = "+m);
        System.out.println("Your weight = "+kg);
        System.out.println("Your BMI = "+bmi + "kg/m2");

    }
}
