package Practice_YOT;

import java.util.*;

public class oddsum {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number  ");

        int sum=0;
        int  n= sc.nextInt();
        System.out.println("The odd numbers are ---");

        for (int i=0; i<=n; i++){
            if (i%2!=0){
                System.out.println(i);
                sum = sum + i;}
        }
        System.out.println("the sum of odd numbers is " + sum);
    }
}
