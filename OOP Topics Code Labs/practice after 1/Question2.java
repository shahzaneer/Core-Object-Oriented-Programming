// 9.	Write a method that returns a new array by eliminating 
// the duplicate values in the array using the following method header:
// public static int[] eliminateDuplicates(int[] list)

import java.util.ArrayList;
import java.util.Arrays;
public class Question2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,1,2,5,4};
        int [] uniqueArray = eliminateDuplicates(arr);
        for(int i = 0; i<uniqueArray.length;i++){
            System.out.println(uniqueArray[i]);
        }
    }
    public static int [] eliminateDuplicates(int [] arr){
        Arrays.sort(arr);
        ArrayList unique = new ArrayList<>();

        for(int i= 0; i<arr.length;i++){
            for(int j = 1; j<arr.length;j++){
                if (arr[i]!=arr[j]){
                    unique.add(arr[i]);
                }
            }
        }

        int arrSize = unique.size();
        int [] newArr = new int [arrSize];
        for (int i = 0; i<newArr.length; i++){
            arr[i] = (int) unique.get(i);
        }

        return newArr;

        // for(int i=0; i<arr.length;i++){
        //     for(int j=1; j<arr.length;j++){
        //         if(arr[i]==arr[j]){


        //     }

        //     }
        // }
    }
    
}
