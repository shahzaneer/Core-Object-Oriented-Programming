import java.util.Scanner;
public class question7 {
    public static void main(String [] args){
        telephoneServiceReview();

    }
    static void telephoneServiceReview(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
        """
        Rate your telephone Service:
        1- Excellent
        2- Good
        3- Average
        4- Below Average
        5- Poor
        """);
        int cExcellent=0,cGood=0,cAvg=0,cBavg=0,cPoor=0;
        int [] arr = new int[10];
        System.out.println("Enter your assessment for telephone service");
        for(int i = 0; i<arr.length;i++){
            int choice = sc.nextInt();
            arr[i]= choice;
        }
        for (int i = 0; i<arr.length;i++){
            switch(arr[i]){
                case 1:
                cExcellent++;
                break;
                case 2:
                cGood++;
                break;
                case 3:
                cAvg++;
                break;
                case 4:
                cBavg++;
                break;
                case 5:
                cPoor++;
                break;


            }
        }

        System.out.printf("""
        Excellent : %d
        Good :      %d
        Average :   %d
        Below Average : %d
        Poor    :   %d
        """,cExcellent,cGood,cAvg,cBavg,cPoor);
    }
    
}
