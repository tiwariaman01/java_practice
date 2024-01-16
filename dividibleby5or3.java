package Conditionals;
import java.util.Scanner;
public class dividibleby5or3 {
    public static void main(String[] args) {
        Object system;
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
        if(n%5==0  || n%3==0){
            System.out.println("the numberis divisible by either3 or 5");
        } else{
            System.out.println("not divisible by either 3 or 5");

        }
    }
}
