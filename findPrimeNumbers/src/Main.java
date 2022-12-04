import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scan.nextInt();
        int counter=0;

        for(int i=2; i< n;i++){
            if(n % i ==0){
                counter++;
            }
        }
        if(counter==0){
            System.out.println(n+ " is a prime number");
        }else{
            System.out.println(n +" is not a prime number ");
        }

    }
}
