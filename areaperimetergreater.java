package Conditionals;
import java.util.Scanner;
public class areaperimetergreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the lenght :");
        int lenght = scanner.nextInt();
        System.out.println("enter the  breadth :");
        int breadth = scanner.nextInt();
        int area = lenght*breadth;
        int perimeter = 2 * (lenght+breadth);
        if(area>perimeter){
            System.out.println( area+ perimeter + "area is greater than perimeter");

        }
        else if (area ==perimeter){
            System.out.println(area+perimeter+"area is equal  perimeter");   
        }
       else{
        System.out.println("perimeter is greater than area");
        }
    } 

}
    