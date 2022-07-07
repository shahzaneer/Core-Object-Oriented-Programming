import java.util.ArrayList;

public class MyMathClass<T extends  Number>{
    // Now the Type Parameter for the class should be the descendents of Numbers class!
    private T number;

    public MyMathClass() {

    }
    
    public MyMathClass(T number) {
        this.number = number;
    }

    public double getStandardDeviation(ArrayList<T> values) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = values.size();

        for(T num : values) {
            sum += num.doubleValue();
        }

        double mean = sum/length;

        for(T num: values) {
            standardDeviation += Math.pow(num.doubleValue() - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);

    }


}