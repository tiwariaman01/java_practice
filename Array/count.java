package java_practice.Array;

import java.util.Scanner;

public class count {

    static int greaterValueX(int []arr,int x ){
        int greatervalue= 0;
        for(int i=0 ; i < arr.length; i++){
            if(arr[i] > x){
                greatervalue ++ ;

            }
        }
        return greatervalue;

    }



    static int lastCcurrences(int []arr,int x ){
        int lastindex = -1;
        for(int i=0 ; i < arr.length; i++){
            if(arr[i] == x){
                lastindex = i;

            }
        }
        return lastindex;

    }


    static int countOccurrences(int[]arr,int x){
        int count =0;
        for(int i=0 ; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( " enter the array ");
        int n = sc.nextInt();

        int [] arr = new int[n];

       System.out.println("enter" +" "+ n + "  " + "elements");

        for(int i= 0; i < arr.length;  i++){
           arr[i] = sc.nextInt();
        }

        System.out.println("Enter x ");
        int x = sc.nextInt();

        System.out.println("count of x"+countOccurrences(arr, x));

        System.out.println("last Index  is ;" + lastCcurrences(arr, x));

        System.out.println(" Greater Value is :"+greaterValueX(arr, x));

    }
    
}
