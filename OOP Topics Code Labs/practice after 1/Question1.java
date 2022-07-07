import java.util.*;
// 8.	Write the method that reverses 
// the array passed in the 
// argument and returns this array. 

public class Question1{
    public static void main(String[] args) {
        int [] arr  = new int [6];
        arrayInput(arr);
        reverseArray(arr);
        printArray(arr);
        
        
    }
    static void arrayInput(int [] arr){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Element at position "+i);
            arr[i] = sc.nextInt();
        }
    }

    static void reverseArray(int [] arr){
        // for (int i = 0,j=arr.length-1; i<arr.length;i++,--j){
        //     arr[i] = arr[j];
        // }

        int size = arr.length-1;
        for(int i =0 ; i<size;i++){
            // swapping technique
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;
            size--;
        }
    
    }

    static void printArray(int [] arr){
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}