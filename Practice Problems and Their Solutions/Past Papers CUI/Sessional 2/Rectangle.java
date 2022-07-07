public class Rectangle extends GeometricObject{
    private double length;
    private double width;
    private double area;


    public Rectangle() {
    }

    public Rectangle(boolean isFilled, String color, double thickness, double length, double width) {
        super(isFilled, color, thickness);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = this.length * this.width;
        setArea(area);
        return area;
    }
    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "{" +
            " length='" + getLength() + "'" +
            ", width='" + getWidth() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

}
