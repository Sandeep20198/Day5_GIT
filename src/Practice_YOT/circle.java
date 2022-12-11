package Practice_YOT;
import java.util.*;

public class circle {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        //Write a function that takes in the radius as input and returns the circumference of a circle.
        // Circumfrence of circle is (2 pie r)/2*3.14*r;

        System.out.println( "Enter the Radius of Circle ");
        int r= sc.nextInt();
        float pie = 3.14F;
        double Circumference = (double)(2*pie*r);
        System.out.println("The Circumference of Circle is " + Circumference);

    }

}
