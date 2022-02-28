public class ConstructorClass{
    int x;
    //* Constructors are only used for data initialization!

    ConstructorClass(){
        // this is default constructor.
    }
    ConstructorClass(int a){
        // overloaded Constructor
        x = a;

    }
    ConstructorClass(int b, int c){
        // overloaded Constructor.
        x = b+c;

    }

    void setState(int z){
        x = z;
    }

    void viewData(){
        System.out.println("The value of x is :"+x);
    }
}