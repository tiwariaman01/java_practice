package Conditionals;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost price :");
        int cp = scanner.nextInt();
        System.out.println("Enter the selling price :");
        int sp = scanner.nextInt();
        if (sp>cp){
            System.out.println("your gained price is : ");
            System.out.println(sp - cp);
        }
        else{
            System.out.println( "your loss price is : ");
            System.out.println(cp-sp);
        }
    }
    
}
