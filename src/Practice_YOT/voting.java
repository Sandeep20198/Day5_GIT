package Practice_YOT;
import java.util.*;

public class voting {
    public static void main(String[] args) {

        //Write a function that takes in age as input and returns if that person is eligible
        // to vote or not. A person of age > 18 is eligible to vote.

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age for voting");

        int age= sc.nextInt();

        if (age>=18){
            System.out.println("Eligible for voting");
        }else {
            System.out.println("Not eligible for voting ");
        }

    }
}
