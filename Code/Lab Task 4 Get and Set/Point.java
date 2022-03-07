public class Point {
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public Point(){

    }
    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void move(){
        System.out.println("The Point is Moving. . .");
    }
    
}
