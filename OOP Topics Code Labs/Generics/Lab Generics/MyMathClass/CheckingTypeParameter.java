public class CheckingTypeParameter {
    public static void main(String[] args) {
        MyMathClass a = new MyMathClass<Number>(12); //int
        MyMathClass b = new MyMathClass<Number>(12.0); //double
        MyMathClass c = new MyMathClass<Number>(0234); //some other system
        MyMathClass d = new MyMathClass<Number>(0x3457); //octal

        // now declaring them to be their original descendent classes

        MyMathClass a1 = new MyMathClass<Integer>(12); //int
        MyMathClass b2 = new MyMathClass<Double>(12.0); //double
        MyMathClass c3 = new MyMathClass<Number>(0234); //some other system
        MyMathClass d4 = new MyMathClass<Number>(0x3457); //octal

        // As String and Character is not the descendent of the Wrapper class Number the compiler gonna complain!
        
        // MyMathClass str = new MyMathClass<String>("Pakistan Noor hai aur Noor ko zawal nhi!");
        // MyMathClass char = new MyMathClass<Number>('a');
    }
}
