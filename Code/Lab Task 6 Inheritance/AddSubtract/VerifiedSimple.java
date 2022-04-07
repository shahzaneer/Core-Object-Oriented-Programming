public class VerifiedSimple extends Simple {
    private int num1;
    private int num2;

    public VerifiedSimple(int num1 , int num2){
        super.setNum1(num1);
        super.setNum2(num2);
    }
    @Override
    public double sum(){
        if(super.getNum1()>0 && super.getNum2()>0){
            return super.sum();
        } 
        return -1;
    }

    @Override
    public double subtract(){
        if(super.getNum1()>0 && super.getNum2()>0){
            return super.subtract();
        } 
        return -1;
    }

    @Override
    public double mul(){
        if(super.getNum1()>0 && super.getNum2()>0){
            return super.mul();
        } 
        return -1;
    }

    @Override
    public double div(){
        if(super.getNum1()>0 && super.getNum2()>0){
            return super.div();
        } 
        return -1;
    }

    


    //! current class kay object ka reference --> this keyword
    //! inherited class kay object ka reference --> super keyword


}
