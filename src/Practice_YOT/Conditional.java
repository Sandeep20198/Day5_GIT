package Practice_YOT;

import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        if (number % 10 == 0) {
//            System.out.println("even");
//            } else{
//            System.out.println("odd");}


//        int a= sc.nextInt();
//        int b= sc.nextInt();
//
//        if (a==b){
//            System.out.println("equal");
//        }else{
//            if (a>b){
//                System.out.println("greater");
//            }else {
//                System.out.println("lesser");
//            }
//            int marks= sc.nextInt();
//
//            if (marks>=90){
//                System.out.println("Grade A");
//            }else{if (marks<90)
//            {if (marks>=75){
//                System.out.println("grade B");
//            }else {if (marks<75)
//            {if (marks>=65){
//                System.out.println("grade C");
//            }else{
//                System.out.println("Failed");
//            }
        System.out.print("1st num");
        int num1= in.nextInt();

        System.out.println("2nd num");
        int num2= in.nextInt();

        System.out.println("3rd num");
        int num3= in.nextInt();

        if (num1>num2)
            if (num1>num3){
                System.out.println("GREATER");

                if (num2>num1)
                    if (num3 < num2){
                        System.out.println("greater");

                        if (num3>num1)
                            if (num3>num2) {
                                System.out.println("greater");
                            }
                    }
            }
            }
        }





