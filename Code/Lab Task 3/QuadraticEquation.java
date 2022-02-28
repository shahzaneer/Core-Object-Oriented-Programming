public class QuadraticEquation {
    int a,b,c;

    QuadraticEquation(){

    }
    QuadraticEquation(int alpha,int beta,int gamma){
        a = alpha;
        b = beta;
        c = gamma;
    }

    void display(){
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
        System.out.println("The value of c is :"+c);


    }
    void setValues(int alpha,int beta,int gamma){
        a = alpha;
        b = beta;
        c = gamma;
    }

    double discriminant(){
        double disc = (b*b) - (4*a*c);
        return disc;

    }
    boolean discGreaterThan100(){
        double disc = discriminant();
        if(disc>100){
            return true;
        }
        else{
            return false;
        } 

    }
}
