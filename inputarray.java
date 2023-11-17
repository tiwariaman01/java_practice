package basicofjava.Array;

import java.util.*;

import basicofjava.function.solutions;

public class inputarray {

    static void printarray(int[]arr){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( " enter the array ");
         int n = sc.nextInt();

         int [] arr = new int[n];

        System.out.println("enter" + n + "  " + "elements");

         for(int i= 0; i < arr.length;  i++){
            arr[i] = sc.nextInt();
         }

        //  for ( int i =0 ; i < n; i++){

        //     System.out.print( arr[i]);
        //  }
        System.out.println(" Oringinal array");

         printarray(arr);


         int[] arr_2 = arr.clone();   // or we can use .copyof() // .copyofrange //copyoflength

         
         System.out.println(" Copied array");

         printarray(arr_2);



         System.out.println("enter the arr_2 changing value ");

         for(int i= 0; i < arr.length;  i++){
            arr_2[i] = sc.nextInt();
         }

        //   arr_2 [0]= 0;
        //  arr_2 [1] =0;

        
        



         System.out.println(" origenal arr after changing arr_2");

         printarray(arr);


         System.out.println(" copied arr_2 after changing arr_2");
         printarray(arr_2);


        
        
    }
    


}



// this one call shallow copy 


// after using .clone or copyof or copyofrange    it is called deep copy