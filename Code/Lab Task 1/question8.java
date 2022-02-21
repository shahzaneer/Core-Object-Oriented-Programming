import java.util.*;
class question8{
    static Scanner input = new Scanner(System.in);
    static String[] issues = {"inheritance","divorce","child marriage","education right","polygamy"};
    public static void main(String[] args) {
        callPoll();

        
    }

    public static void callPoll(){
        int[][] responses = new int[5][10];

        
        for(int i=0;i<10;i++){
            System.out.print("================  User  "+(i+1)+"=======================\n");
            System.out.print("Rate the following issue (1-10) -- "+issues[0]+" : ");
            responses[0][i] = input.nextInt();

            System.out.print("Rate the following issue (1-10) -- "+issues[1]+" : ");
            responses[1][i] = input.nextInt();

            System.out.print("Rate the following issue (1-10) -- "+issues[2]+" : ");
            responses[2][i] = input.nextInt();

            System.out.print("Rate the following issue (1-10) -- "+issues[3]+" : ");
            responses[3][i] = input.nextInt();

            System.out.print("Rate the following issue (1-10) -- "+issues[4]+" : ");
            responses[4][i] = input.nextInt();
            System.out.print("=================End==============================\n\n");
        }

        int[] average = new int[5];
        int[] totalPoints = new int[5];
        int sum = 0;
        for(int j=0;j<5;j++){
            sum=0;
            for(int k=0;k<10;k++){
                sum+=responses[j][k];
            }
            average[j] = sum/10;
            totalPoints[j] = sum;
        }

        int max = totalPoints[0];
        int maxIndex = 0;
        for(int a=1;a<5;a++){
            if(totalPoints[a]>max){
                max = totalPoints[a];
                maxIndex = a;
            }
        }

        int min = totalPoints[0];
        int minIndex = 0;
        for(int a=1;a<5;a++){
            if(totalPoints[a]<min){
                min = totalPoints[a];
                minIndex = a;
            }
        }

        System.out.print("Average of each issue : \n");
        for(int c=0;c<issues.length;c++){
            System.out.print(issues[c] + " : "+average[c]+"\n");
        }
        System.out.println();
        System.out.print(issues[maxIndex] + " has highest points---- "+totalPoints[maxIndex]+" points.\n");
        System.out.print(issues[minIndex] + " has lowest points----"+totalPoints[minIndex]+" points.\n");
    }   
}
