package Practice_YOT;
import java.util.*;

public class greater {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Write a function which takes in 2 numbers and returns the greater of those two.

        System.out.println( " enter two numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("The greater no. is " + n1);
        }else {
            System.out.println("The Greater no is " + n2);
        }
    }
}
