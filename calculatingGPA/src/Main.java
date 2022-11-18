import java.util.Scanner;

public class Main {

    //the basic program that takes the course score from the user and calculates the GPA(note: not using if-else)
    // Courses: Math,Physics,Chemical,Turkish,History,Music


    public static void main(String[] args) {

        int math,physics,chemical,turkish,history,music;
        Scanner score = new Scanner(System.in);

        System.out.print("Please enter your math score :" );
        math= score.nextInt();

        System.out.print("Please enter your physics score :" );
        physics= score.nextInt();

        System.out.print("Please enter your chemical score :" );
        chemical= score.nextInt();

        System.out.print("Please enter your turkish score :" );
        turkish= score.nextInt();

        System.out.print("Please enter your history score :" );
        history= score.nextInt();

        System.out.print("Please enter your music score :" );
        music= score.nextInt();

        int total = (math+physics+chemical+turkish+history+music);
        double result = (total/6.0);
        System.out.println("Your GPA is:" + result);




    }
}
