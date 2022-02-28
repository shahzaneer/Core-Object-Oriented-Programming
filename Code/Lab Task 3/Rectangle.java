public class Rectangle {
    double length , width;

    Rectangle(){

    }
    Rectangle(double l, double w){
        length = l;
        width = w;

    }

    void display(){
        System.out.println("The value of length is"+length);
        System.out.println("The value of width is "+width);
    }

    void setValues(double l, double w){
        length = l;
        width = w;
    }

    double area(){
        double areaCal = 2*(length+width);
        return areaCal;
    }

    boolean checkSquare(){
        if (length== width){
            return true;
        }
        else return false;
    }

}
