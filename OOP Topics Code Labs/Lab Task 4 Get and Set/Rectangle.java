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

    public Rectangle(){

    }

    public Rectangle(int l ,int w){
        if(l>0 && w>0){
            length = l;
            width= w;
        }
        else{
            // default state --> 
            
        }
        
    }

    public double CalculateArea(){
        double area = length*width;
        return area;
    }
}