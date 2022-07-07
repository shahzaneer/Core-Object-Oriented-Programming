public class Circle{
    static int numOfCircle;
    private int radius;

    public Circle(){
        // default constructor
        // jitni baar bhi call hoga hum static var ko increase karengay
        // it will show that static var has a single copy for all instances
        numOfCircle++;
    }

    public Circle(int radius){
        if(radius>0){
            this.radius = radius;
        }
        numOfCircle++;
    }
    public void nonStaticFunction(){
        System.out.println("I'm not a static function at all!");
    }

    public static int adding1ToANumber(int number){
        // static method mehiz static data ko hi access kr skta hai.
        // nonStaticFunction();
        // Error: Cannot make a static reference to the non-static method nonStaticFunction()
        return 1+number;
        // this ka use bhi nhi hoskta as this refers to the object jbke yahan object wala koi scene hai hi nhi!
    }

}