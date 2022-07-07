import java.util.*;
public class question3 {
    public static void main(String [] args){
    evenOdd(); 
    }
    static void evenOdd(){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int evenCount=0,oddCount=0;
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        for(int i = 0; i<5;i++){
            if(arr[i]==0){
            continue; 
            }
            else{
                if(arr[i]%2==0){
                    evenCount+=1;
                }
                else if(arr[i]%2==1){
                    oddCount+=1;
                }
            }
        }

    System.out.printf("The number of odd numbers are %d and even numbers are %d\n",oddCount,evenCount);

    }
    
}
