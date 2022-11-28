import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("User name:");
        userName= inp.nextLine();

        System.out.println("Password:");
        password = inp.nextLine();


        if (userName.equals("Jane")&&password.equals("java123")){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Your information is wrong. Please try again!");
        }



    }

}
