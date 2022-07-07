public class FeetsToMeters extends Convert {
    
    public FeetsToMeters(double value1) {
        this.setValue1(value1);
    }

    @Override
    public double compute() {
        double convertedValue = super.getValue1() * 0.3048;
        this.setValue2(convertedValue);

        return this.getValue2();
    }
    
    @Override
    public String toString() {
        return "The value is : " + super.getValue1() + 
                "The converted Value is " + super.getValue2();
    }
    
}
