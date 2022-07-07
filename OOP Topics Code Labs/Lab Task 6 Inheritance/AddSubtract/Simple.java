public class Simple {
    private int num1;
    private int num2;

    public Simple(){}

    public Simple(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }

    public double sum(){
        return num1+num2;
    }
    public double div(){
        return num1/num2;
    }
    public double mul(){
        return num1*num2;
    }
    public double subtract(){
        return num1-num2;
    }

    
}
