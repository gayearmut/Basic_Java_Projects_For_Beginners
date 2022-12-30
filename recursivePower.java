import java.util.Scanner;

public class Main {


    static int recursivePower(int base,int exponent){
        if (exponent == 0) {
            return 1;
        }
        return base * recursivePower(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter base:");
        int base= scan.nextInt();
        System.out.println("Enter exponent:");
        int exponent = scan.nextInt();

        int result = recursivePower(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
