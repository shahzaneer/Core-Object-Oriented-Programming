public class LitersTOGallons extends Convert {
    
    public LitersTOGallons(double value1) {
        this.setValue1(value1);
    }

    @Override
    public double compute() {
        double convertedValue = this.getValue1() * 0.264172;
        this.setValue2(convertedValue);

        return this.getValue2();
    }
    
    @Override
    public String toString() {
        return "The value is : " + super.getValue1() + 
                "The converted Value is " + super.getValue2();
    }
    
}
