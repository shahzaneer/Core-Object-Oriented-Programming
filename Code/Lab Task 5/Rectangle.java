public class Rectangle{
    private int length;
    private int width;

    public void setLength(int l){
        if(l>0){
            length = l;
        }
    }

    public void setWidth(int w){
        if(w>0){
            width = w;
        }
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public Rectangle(){}

    // One argument Constructor aik hi bn skta hai.
    // ! multiple contructor method overloading k through hotay hain!!
    public Rectangle(int l){
        if(l>0){
            length = l;
    
        }
    }

    // yeh error isliay derha hai k yeh isse duplicate method smjh rha hai 
    // Recalling concept of method overloading.
    // public Rectangle(int w){
    //     if(w>0){
    //         width = w;
    
    //     }
    // }

    public Rectangle(int l ,int w){
        if(l>0 && w>0){
            length = l;
            width= w;
        }    
    }

    public double CalculateArea(){
        double area = length*width;
        return area;
    }

    // copy contructor for copying the content of a object in a new object
    public Rectangle(Rectangle obj){
        // copy constructor
        // jo object argument main dia jaye us k hisaab se new object banalia jaye.
        this.length = obj.length;
        this.width = obj.width;
    }

    public Rectangle compareArea(Rectangle a){
        if(a.CalculateArea()<this.CalculateArea()){
            // ager object a ka area kam ho crrentObject k area se tou 
            // return krdo bara area
            
            return this;
        }
        
        return a;
    }

    // Equals Function for checking if the content is equal or not.
    public boolean equals(Rectangle a){
        if(this.length == a.length && this.width == a.width){
            return true;
        }
        return false;
    }
}