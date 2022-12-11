package Practice_YOT;

public class patterns {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        //outer loop
        for (i = 1; i <= n; i++) {
            //inner loop Star--->
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {//even
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }System.out.println();
        }

    }
}




