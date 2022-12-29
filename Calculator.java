import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number, result =0, i=1;
        while (true){
            System.out.println(i++ + ".number :");
            number=scan.nextInt();
            if(number ==0){
                break;
            }
            result +=number;
        }
        System.out.println("result = "+ result);
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        int number, result=0, i=1;
        while (true){
            System.out.println(i++ + ".number :");
            number= scan.nextInt();
            if(number ==0){
                break;
            }
            result -= number;
        }
        System.out.println("result = "+ result);
    }

    static void product(){
        Scanner scan = new Scanner(System.in);
        int number, result=1, i=1;

        while (true){
            System.out.println(i++ + ".number :");
            number= scan.nextInt();

            if (number==1)
                break;
            if (number==0){
                result=0;
                break;
            }
            result *= number;
        }
        System.out.println("result = "+ result);
    }

    static void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n= scan.nextInt();
        double number,result=0.0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can not divide to 0!");
                break;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result : " + result);
    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the base value");
        int base = scan.nextInt();
        System.out.println("Please enter the exponent value");
        int exp = scan.nextInt();
        int result =1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Result ="+ result);
    }

    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scan.nextInt();
        int result =1;

        for(int i =1 ; i<= number ;i++ ){
            result *=i;
        }
        System.out.println("Result = "+result);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1-Plus\n"+
                "2-Minus\n"+
                "3-Product\n"+
                "4-Divide\n"+
                "5-Power\n"+
                "6-Factorial\n";

        System.out.println(menu);
          do{
              System.out.println("Please select operation: ");
              select= scan.nextInt();

              switch (select){
                  case 1:
                      plus();
                      break;
                  case 2 :
                      minus();
                      break;
                  case 3:
                      product();
                      break;
                  case 4 :
                      divide();
                      break;

                  case 5:
                      power();
                      break;
                  case 6 :
                      factorial();
                      break;

                  case 0 :
                      break;
                  default:
                      System.out.println("Wrong operation! please try again...");
              }
          }while(select!=0);
    }
}
