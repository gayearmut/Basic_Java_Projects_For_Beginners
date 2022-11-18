import java.util.Scanner;

public class Main {
    //program to find area and perimeter of a circle
    // radius :r = get the user
    // PI = 3.14
    // formula of perimeter = 2*PI*r
    // formula of area = r*r*PI
    public static void main(String[] args) {


        int r;
        double pi = 3.14;

        Scanner radius = new Scanner(System.in);
        System.out.println("Please enter the radius : ");
        r= radius.nextInt();


        double area = (r*r*pi);
        double perimeter = (2*pi*r);
        System.out.println("Area of the circle : "+area);
        System.out.println("Perimeter of the circle : "+perimeter);





    }
}
