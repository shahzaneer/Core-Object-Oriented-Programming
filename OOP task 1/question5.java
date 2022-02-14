public class question5 {
    public static void main(String[]args){
    int [] arr = {1,2,3,4,5};
    sumAvg(arr);
    }
    static void sumAvg(int [] arr){
        int size = arr.length-1;
        int sum=0;
        for(int i=0; i<size+1;i++){
            sum+=arr[i];
        }
        double avg = sum/size;

        System.out.printf("The sum of elements is %d",sum);
        System.out.printf("The average of elements is %f",avg);

    }
}
