package Practice_YOT;
import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();

        boolean isPrime = true;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) ;
            {
                isPrime = false;
                break;
            }
        }
            if (isPrime) {
                if (n == 1) {
                    System.out.println("this is neither prime nor composite");
                } else {
                    System.out.println("this is prime");
                }
                    System.out.println("this is not prime");


                }
            }

        }

