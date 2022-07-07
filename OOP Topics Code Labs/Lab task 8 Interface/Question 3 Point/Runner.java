public class Runner {
    public static void main(String[] args) {
        Point p = new Point(6, 7);
        System.out.println(p.toString());
        p.movePoint();
        Point newP = (Point) p.clone();
        // we typed cast it to the point class because the return type of .clone is Object (polymorphism | generic Coding)
        
        System.out.println(newP.toString());
    }
}
