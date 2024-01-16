package Conditionals;
import java.util.Scanner;
public class youngestofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first age : ");
        int ram = scanner.nextInt();
         System.out.println("enter the second age : ");
        int shyam = scanner.nextInt();
          System.out.println("enter the third age : ");
        int ajay = scanner.nextInt();
        if (ram<shyam && ram<ajay){
            System.out.println(ram+"ram is youngest");

        }else if(shyam<ram && shyam<ajay){
            System.out.println(shyam+"shaym  is youngest");

        }else{
            System.out.println (ajay+" ajay is youngest");
        }
        

    }
    
}

    
