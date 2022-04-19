public abstract class Convert{
    private double value1;
    private double value2;

    public Convert() {
    }

    public Convert(double value1) {
        this.value1 = value1;
    }

    public double getValue1() {
        return this.value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return this.value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }


    @Override
    public String toString() {
        return "{" +
            " value1='" + getValue1() + "'" +
            ", value2='" + getValue2() + "'" +
            "}";
    }

    public abstract double compute();
}