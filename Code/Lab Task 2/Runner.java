public class Runner {
    public static void main(String[] args) {
        // now we are creating three different instances for Circle Class
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadius(5);
        circle2.setRadius(10);
        circle3.setRadius(3);
        
        circle1.getData();
        circle2.getData();
        circle3.getData();
        
        // System.out.println(circle2.getCircumference());
        
        
        
    }
}
