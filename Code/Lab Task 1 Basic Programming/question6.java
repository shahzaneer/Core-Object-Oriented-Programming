import java.util.Scanner;
public class question6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of a array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements ");
        for(int i=0; i<size;i++){
            int num = sc.nextInt();
            arr[i]=num;
        }

        lowHigh(arr);

    }
    static void lowHigh(int arr []){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max) max = arr[i];
        if(arr[i]<min) min = arr[i];
    } 
    System.out.printf("The max value is %d and the min value is %d",max,min);

    }
    
}
