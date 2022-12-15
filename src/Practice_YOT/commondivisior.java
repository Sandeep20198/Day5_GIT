package Practice_YOT;
import java.util.*;
public class commondivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          //Write a function that calculates the Greatest Common Divisor of 2 numbers.

        System.out.println("enter two numbers--");
        int n1 = 12;     //we can take also user input by sc.nextInt
        int n2 = 16;    //we can take also user input by sc.nextInt

        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("The Greatest Common Divisor of 2 numbers is : "+ n2);
    }
}
