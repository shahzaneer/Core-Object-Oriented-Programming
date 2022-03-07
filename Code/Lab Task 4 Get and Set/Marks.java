public class Marks {
    private int marks1,marks2,marks3;

    public Marks(){}

    public Marks(int m1,int m2, int m3){
        if(m1>0)
        marks1 = m1;
        if(m2>0)
        marks2 = m2;
        if(m3>0)
        marks3 = m3;



    }

    public void setMarks1(int m1){
        if(m1>=0){
            marks1 = m1;
        }
    }

    public void setMarks2(int m2){
        if(m2>=0){
            marks2 = m2;
        }
    }

    public void setMarks3(int m3){
        if(m3>=0){
            marks3 = m3;
        }
    }

    public int getMarks1(){
        return marks1;
    }
    public int getMarks2(){
        return marks2;
    }

    public int getMarks3(){
        return marks3;
    }

    public double procate(){
        double sum = 0;
        sum=marks1+marks2+marks3;
        return sum;
    }

    public double getPercentage(){
        double sum = procate();
        double percentage = (sum/300)*100;
        return percentage;
    }
    
}
