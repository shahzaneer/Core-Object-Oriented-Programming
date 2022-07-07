public class PointRunner {
    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(3,7);
        Point p3 = new Point(2,2);

        // this is basically pointer for the object!
        Point a = p3.addThreepoints(p1, p2);

        System.out.println(a.getX());
        System.out.println(a.getY());

    }
    
}
