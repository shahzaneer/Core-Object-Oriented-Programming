
public class question1{
    public static void main(String [] args){
    int a = 2; 
    int b = 2;
    int power = power(a,b);
    System.out.println(power);

    }
    static int power(int num1,int num2){
        int div = num1*num2;
        
        for(int i =1;i<=num2;i++){
        num1*=num1;
        }
    
        return num1;
        
    }
}