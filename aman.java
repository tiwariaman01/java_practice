package basicofjava.loops;

import java.util.Scanner;

public class aman {

    public static int averageOfuser(int a, int b, int c) {
        int sum = (a + b + c) / 3;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = averageOfuser(a, b, c);

        System.out.println("the Average of user is :" + sum);
    }

}
