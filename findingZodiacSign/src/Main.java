import java.util.Scanner;

public class Main {
    /*Aries (March 21 – April 19)
Taurus (April 20 – May 20)
Gemini (May 21 – June 20)
Cancer (June 21 – July 22)
Leo (July 23 – August 22)
Virgo (August 23 – September 22)
Libra (September 23 – October 22)
Scorpio (October 23 – November 21)
Sagittarius (November 22 – December 21)
Capricorn (December 22 – January 19)
Aquarius (January 20 – February 18)
Pisces (February 19 – March 20)*/

    public static void main(String[] args) {

        int month, day;
        String sign = "";
        boolean isError = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth month with numbers :");
        month= scan.nextInt();

        System.out.println("Please enter your birth day with numbers :");
        day= scan.nextInt();

        switch(month){

            case 1:
                if(day >= 1 && day <= 31){
                    if(day >=20){
                        sign= "Aquarius";
                    }else{
                        sign= "Capricorn";
                    }
                }else{
                    isError = true;
                }
                break;

            case 2:
                if(day >= 1 && day <= 28){
                    if(day >=19){
                        sign= "Pishes";
                    }else{
                        sign= "Aquarius";
                    }
                }else{
                    isError = true;;
                }
                break;

            case 3:
                if(day >= 1 && day <= 31){
                    if(day >=21){
                        sign= "Aries";
                    }else{
                        sign= "Pishes";
                    }
                }else{
                    isError = true;
                }
                break;

            case 4:
                if(day >= 1 && day <= 30){
                    if(day >=20){
                        sign= "Taurus";
                    }else{
                        sign= "Aries";
                    }
                }else{
                    isError = true;
                }
                break;

            case 5:
                if(day >= 1 && day <= 31){
                    if(day >=21){
                        sign= "Gemini";
                    }else{
                        sign= "Taurus";
                    }
                }else{
                    isError = true;
                }
                break;

            case 6:
                if(day >= 1 && day <= 30){
                    if(day >=21){
                        sign= "Cancer";
                    }else{
                        sign= "Gemini";
                    }
                }else{
                    isError = true;
                }
                break;

            case 7:
                if(day >= 1 && day <= 31){
                    if(day >=23){
                        sign= "Leo";
                    }else{
                        sign= "Cancer";
                    }
                }else{
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31){
                    if(day >=23){
                        sign= "Virgo";
                    }else{
                        sign= "Leo";
                    }
                }else{
                    isError = true;
                }
                break;


            case 9:
                if(day >= 1 && day <= 30){
                    if(day >=22){
                        sign= "Libra";
                    }else{
                        sign= "Virgo";
                    }
                }else{
                    isError = true;
                }
                break;


            case 10:
                if(day >= 1 && day <= 31){
                    if(day >=24){
                        sign= "Scorpio";
                    }else{
                        sign= "Libra";
                    }
                }else{
                    isError = true;
                }
                break;



            case 11:
                if(day >= 1 && day <= 30){
                    if(day >=22){
                        sign= "Sagittarius ";
                    }else{
                        sign= "Scorpio";
                    }
                }else{
                    isError = true;
                }
                break;


            case 12:
                if(day >= 1 && day <= 31){
                    if(day >=22){
                        sign= "Capricorn";
                    }else{
                        sign= "Sagittarius";
                    }
                }else{
                    isError = true;
                }
                break;

            default:
                isError = true;

        }

        if(isError){
            System.out.println("You entered wrong information, please try again!");
        }else{
            System.out.println("Your sign is:"+ sign);
        }

    }
}
