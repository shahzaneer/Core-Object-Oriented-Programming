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

    public Point(int x){
        this.x = x;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public boolean equalContents(Point p){
        if(this.x == p.x && this.y == p.y){
            return true;
        } 
        return false;
    }

    public Point addTwopoints(Point p ){
        Point p1 = new Point();
        p1.x = this.x + p.x;
        p1.y = this.y + p.y;

        return p1;
    }

    public Point addThreepoints(Point p , Point q ){
        Point p1 = new Point();
        p1.x = this.x + p.x + q.x;
        p1.y = this.y + p.y + q.y;

        return p1;
    }

    public void move(){
        System.out.println("The Point is Moving. . .");
    }

    
}
