package Conditionals;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = Scanner.nextInt();
        if(n%2== 0){
            System.out.println("THIS NUMBER IS EVEN ");
        }
         else{
            System.out.println("THIS NUMBER IS ODD");

        }
    }
    
}
