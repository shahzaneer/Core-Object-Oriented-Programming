public class QuadraticEquation {
    double a,b,c;

    QuadraticEquation(){

    }
    QuadraticEquation(double alpha,double beta,double gamma){
        a = alpha;
        b = beta;
        c = gamma;
    }

    void display(){
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
        System.out.println("The value of c is :"+c);


    }
    void setValues(double alpha,double beta,double gamma){
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
