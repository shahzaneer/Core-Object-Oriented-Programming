public class Student {
    private String name;
    private int [] Result = new int [5];

    public void setName(String name){
        this.name = name;
    }
    public void setResult(int [] result){
        for(int i=0;i<5;i++){
            if(Result[i]>=0){
                this.Result[i] = result[i];
            }
        }
    }

    public String getName(){
        return name;
    }
    public int [] getResult(){
        return Result;
    }

    public Student(){

    }

    public Student(String name , int [] result){
        this.name = name;
        for(int i=0;i<5;i++){
            this.Result[i] = result[i];
        }

    }

    public double CalculateAverage(){
        double sum = 0;
        for(int i=0;i<5;i++){
            sum+=Result[i];
        }

        double average = sum/5;
        return average;
    }




    
}
