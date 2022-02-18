
public class question1{
    public static void main(String [] args){
    int a = 2; 
    int b = 5;
    int power = power(a,b);
    System.out.println(power);

    }
    static int power(int num1,int num2){
        int pow = 1;
        
        for(int i =1;i<=num2;i++){
        pow*=num1;
        }
    
        return pow;
        
    }
}