
public class Rectangle {
    // class level attributes/properties
    double length;
    double width;
    double height;

    // setting Length and width
    void setLengthWidthHeight(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }
    // showing the set properties
    void showLength(){
        System.out.println("The length of Rectange is "+length);
    }
    void showWidth(){
        System.out.println("The width of Rectange is "+width);
    }
    void showHeight(){
        System.out.println("The height of Rectange is "+height);
    }

    // calculation of Some properties of Rectangle (Behaviours/methods)

    double showArea(){
        return width*length;

    }
    double showPerimeter(){
        return 2*(length+width);
    }
    double showVolume(){
        return length*width*height;

    }

    // getting the whole data in a method(as a behaviour of class)

    void getData(){
        System.out.println("------------------------------------------");
        System.out.println("The length of Rectange is "+length);
        System.out.println("The width of Rectange is "+width);
        System.out.println("The height of Rectange is "+height);
        System.out.println("The area of rectangle is "+showArea());
        System.out.println("The permiter of the rectangle is "+showPerimeter());
        System.out.println("The Volume of Rectangle is "+showVolume());
        System.out.println("------------------------------------------");




    }
}
