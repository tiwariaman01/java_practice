package Conditionals;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        if (n%5==0){
            System.out.println("this number is dividedby 5");
        } else {
            System.out.println("number is not divided by 5 ");
        }
    }
    
}
