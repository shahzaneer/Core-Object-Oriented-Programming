public class Circle{
    int radius; //class level Variable

    // methods of Circles
    void setRadius(int r){
        radius = r;
    }
    int getRadius(){
        return radius;
    }
    double getCircumference(){
        double circumference = (2*Math.PI*radius);
        return circumference;
    }
    double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    int getDiameter(){
        int diameter = 2*radius;
        return diameter;
    }

    void getData(){
        System.out.printf("The radius is %d \n",radius);
        System.out.printf("The Circumference is %f \n",getCircumference());
        System.out.printf("The Diameter is %d \n",getDiameter());
        System.out.printf("The Area is %f \n",getArea());
        System.out.println("------------------------------");
        
    }


    //? Rules :
    // * No static Function in the Class
    // * No arguments in any Function except for set Values.


}