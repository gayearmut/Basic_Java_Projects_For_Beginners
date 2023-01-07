import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// guessing a random number from 0 - 100
    // you have 5 rigt     

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int right =0;
        int selected;

        int[] wrongGuess= new int[5];// we have 5 right
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right<5){

            System.out.println("please enter your guess :");
            selected = scanner.nextInt();

            if (selected<0 || selected>99){
                System.out.println("Please enter a number 0- 100");

                if (isWrong){
                    right++;
                    System.out.println("Too much guessing,remaining right:"+ (5-right));
                }else {
                    isWrong = true ;
                    System.out.println("If you enter wrong again, your right will be deducted!");
                }
                continue;
            }
           if (selected == number){
               System.out.println("Congratulatins! Right Guess: "+ number);
               isWin =true;
               break;
           }else{
               System.out.println("Wrong guess! ");
               if (selected > number){
                   System.out.println("Please enter smaller number! ");
               }else{
                   System.out.println("Please enter bigger number! ");
               }
               wrongGuess[right++] = selected;
               System.out.println("Remainder right: " + (5-right));
           }
        }

        if (!isWin){
            System.out.println("You lose! The random number is: "+number);
            if (!isWrong){
                System.out.println("Your guesses :"+ Arrays.toString(wrongGuess));
            }
        }

    }
}
