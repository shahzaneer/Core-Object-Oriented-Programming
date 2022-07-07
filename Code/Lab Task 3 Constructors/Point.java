public class Point {
    int x,y;
    Point(){

    }
    Point(int xVal, int yVal){
        x = xVal;
        y = yVal;
    }
    void display(){
        System.out.println("The x co-ordinate is "+x);
        System.out.println("The y co-ordinate is "+y);

    }

    void setValues(int xVal, int yVal){
        x = xVal;
        y = yVal;
        
    }
    void move(){
        System.out.println("The points are moving");

    }

    boolean checkOrigin(){
        if (x==0 && y==0){
            return true;
        }
        else return false;
    }
} 