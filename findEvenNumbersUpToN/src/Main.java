import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        System.out.println("Please enter the number...");
        Scanner number = new Scanner(System.in);
        n= number.nextInt();


        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }



    }
}
