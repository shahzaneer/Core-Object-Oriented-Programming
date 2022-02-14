import java.util.Scanner;
public class question8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] causes = {"politics","pollution","Depression","Unemployment","Intolerance"};
        for (int i=0; i<causes.length;i++){
            System.out.println(causes[i]);
        }
        int [][] responses = new int[5][11];
        responses[0][0] = 1;
        responses[1][0] = 2;
        responses[2][0] = 3;
        responses[3][0] = 4;
        responses[4][0] = 5;
        for(int i = 0; i<responses.length;i++){
            for(int j = 1;j<responses[i].length;j++){
                    System.out.printf("Enter response for %d cause for %d person",i+1,j);
                    responses[i][j]= sc.nextInt();
            }
        }

        for(int i = 0; i<responses.length;i++){
            for(int j = 1;j<responses[i].length;j++){
                    System.out.print(responses[i][j]);
            }
            System.out.println();
        }

        

    }

}
