public class question2 {
    public static void main(String [] args){
        int num=5;
        question2.pattern(num);

    }
    static void pattern(int num){
        int i,j;
        for( i=1; i<=num;i++){
            for(j=1; j<=i;j++){
                if(j==1){
                    System.out.print(i);
                }
                
                System.out.print("*");

            }
            System.out.print(--j);
            System.out.println();
        }
    }
}
