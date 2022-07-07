public abstract class GeometricObject implements Area {
    private boolean isFilled;
    private String color;
    private double thickness;


    public GeometricObject() {
    }

    public GeometricObject(boolean isFilled, String color, double thickness) {
        this.isFilled = isFilled;
        this.color = color;
        this.thickness = thickness;
    }

    public boolean isIsFilled() {
        return this.isFilled;
    }

    public boolean getIsFilled() {
        return this.isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getThickness() {
        return this.thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }



    @Override
    public String toString() {
        return "{" +
            " isFilled='" + isIsFilled() + "'" +
            ", color='" + getColor() + "'" +
            ", thickness='" + getThickness() + "'" +
            "}";
    }


}