public class Job {
    private String designation;
    private double salary;
    private int id;
    // Constructors
    public Job(){}
    public Job(String d, double s , int i){
        this.designation = d;
        this.salary = s;
        this.id = i;
    }
    // getters
    public String setDesignation(){
        return this.designation;
    }
    public double setSalary(){
        return this.salary;
    }
    public int setId(){
        return this.id;
    }

    // setters
    public void setDesignation(String d){
        this.designation = d;
    }
    public void setId(int i){
        this.id = i;
    }
    public void setSalary(double s){
        this.salary = s;
    }

    public void display(){
        System.out.println(this.id);
        System.out.println(this.salary);
        System.out.println(this.designation);
    }


}
