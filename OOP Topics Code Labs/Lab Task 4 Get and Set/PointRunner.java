public class PointRunner {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(3);
        p1.setY(7);
        Point p2 = new Point(2,4);

        p2.setY(p1.getX());

        System.out.println("The point of p1 is "+p1.getX());
        System.out.println("The point of p2 is "+p2.getY());


    }
    
}
