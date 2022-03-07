public class Runner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(2);
        r1.setWidth(4);
        System.out.println(r1.getLength());
        // double area = r1.CalculateArea();
        // System.out.println(area);
        Rectangle r2 = new Rectangle(-4, -6);
        System.out.println(r2.getLength()); 

        if(r1.getLength() > r2.getLength()) System.out.println("R1's length is greater");
        else if (r1.getLength() == r2.getLength()) System.out.println("Both are of same Length");
        else System.out.println("R2's length is greater");
    }
}
