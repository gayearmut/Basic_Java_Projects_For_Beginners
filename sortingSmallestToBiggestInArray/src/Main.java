import java.util.Arrays;
import java.util.Scanner;

public class Main {
//sorting array's members smallest to biggest, take the members from user
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the array's lenght:");
        int length = scan.nextInt();
        System.out.println("Array's length :"+length);

        int[] array = new int[length];
        for (int i =0 ; i< array.length;i++){
            System.out.println("Please enter "+ (i+1)+".array member:");
            array[i]= scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
