public class Circle extends GeometricObject{
    private double radius;
    private double area;


    public Circle() {
    }

    public Circle(boolean isFilled, String color, double thickness, double radius) {
        super(isFilled, color, thickness);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        setArea(area);
        return area; 
    }

    

    @Override
    public String toString() {
        return "{" +
            " radius='" + getRadius() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

}
