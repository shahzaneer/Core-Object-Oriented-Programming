public class RectangleRunner {
    public static void main(String[] args) {
        // object  1 
        Rectangle r1 = new Rectangle();
        r1.setLength(2);
        r1.setWidth(4);
        // object 2
        Rectangle r2 = new Rectangle(4,6);

        //Dono alag alag areas hain tou inka address bhi alag hi hoga 
        System.out.println(r1);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(r1.compareArea(r2));
        System.out.println("The area of rec 1 is "+r1.CalculateArea());
        System.out.println("The area of rec 2 is "+r2.CalculateArea());
        System.out.println("The area of rec 3 is "+r3.CalculateArea());

        // r3.CalculateArea();



        
    }
}
