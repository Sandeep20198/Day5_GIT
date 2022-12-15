package Practice_YOT;
import java.util.*;
public class power {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //Two numbers are entered by the user, x and n. Write a function to find
        //the value of one number raised to the power of another i.e. 𝑥 .

        System.out.println("enter the value of X");
        int x= sc.nextInt();

        System.out.println("enter the value of n");
        int n= sc.nextInt();

        int result = 1;

        for (int i=0; i<n; i++){

            result = result*x;

        System.out.println(result);
        }
        System.out.println("x to the power n is " + result);

    }
}
