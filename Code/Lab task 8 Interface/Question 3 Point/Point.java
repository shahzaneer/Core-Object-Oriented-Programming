public class Point implements Cloneable{
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //@override
    // hum isko banayen na banayen yeh chalega . Cloneable by default aik empty interface hai
    public Object clone() {
        return new Point(x, y);  
    }
        
    

    public void movePoint(){
        setX(++x);
        setY(++y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }


}