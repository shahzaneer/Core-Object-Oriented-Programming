public class Runner{
    public static void main(String[] args) {
        //* yahan hum kisi bhi constructor se class ka object return krwaskte hain.

        ConstructorClass c1 = new ConstructorClass();
        // c1.viewData(); //value by default hogi that is zero.

        ConstructorClass c2 = new ConstructorClass(10);
        // c2.viewData(); //ab set hogi x ki 10

        ConstructorClass c3 = new ConstructorClass(10, 20);
        c3.viewData(); //set of x is 10+20 according to the definition.
        c3.setState(99);
        //? setState function vs Constructor
        // * Constructor is used to initialized the state whereas 
        // *setState function is used to declare the function

        c3.viewData(); // ab state reset hokar 99 hogyi hai.
    }
}