import java.util.Arrays;

public class University{

    private String uniName;
    private String location;
    private  String rectorName;
    private String departments [] = new  String [20];


    public University(){} //Default Constructor

    public University(String UniName, String RectorName){
        // constructor with two parameters
        uniName = UniName;
        rectorName = RectorName;
    }

    public University(String UniName, String RectorName,String Location,String [] depart){
        // constructor with all the parameters

        uniName = UniName;
        location = Location;
        rectorName = RectorName;

        if(depart.length<=departments.length){
            
            for(int i=0;i<depart.length;i++){
                departments[i] = depart[i];

            }
        }
        else{
            for(int i=0; i<departments.length;i++){
                departments[i] = depart[i];
            }
            
        }
        
    }

    public void setValues(String UniName, String RectorName,String Location,String [] depart){
        uniName = UniName;
        location = Location;
        rectorName = RectorName;

        if(depart.length<=departments.length){
            
            for(int i=0;i<depart.length;i++){
                departments[i] = depart[i];

            }
        }
        else{
            for(int i=0; i<departments.length;i++){
                departments[i] = depart[i];
            }
            
        }
        
    }

    // setters
    public void setUniName(String UniName){
        this.uniName = UniName;
    }

    public void setLocation(String Location){
        this.location = Location;
    }

    public void setRectorName(String RectorName){
        this.rectorName = RectorName;
    }

    public void setDepartment(String [] depart){
        if(depart.length<=departments.length){
            
            for(int i=0;i<depart.length;i++){
                departments[i] = depart[i];

            }
        }
        else{
            for(int i=0; i<departments.length;i++){
                departments[i] = depart[i];
            }
            
        }
    }

    public void addDepartment(String depName){

        if(departments[departments.length-1]!=null){
            System.out.println("The department list is already filled! we cannot add "+depName);
            System.out.println("It Includes the following departments");
            System.out.println(Arrays.toString(departments));
        }
        else{
        for(int i=0;i<departments.length;i++){
            if(departments[i]==null){
                departments[i] = depName;
                break;
            }        
        }
        
    }

    }

    // getters
    public String getUniversityName(){
        return uniName;
    }
    public String getLocation(){
        return location;
    }
    public String getRectorName(){
        return rectorName;
    }
    public String [] getDepartments(){
        return departments;
    }

    public void display(){
        System.out.println("The name is "+uniName);
        System.out.println("The location is "+location);
        System.out.println("The Rector Name is "+rectorName);

            for(int i=0;i<departments.length;i++){
                if(departments[i]!=null){
                    System.out.println(departments[i]);
                    }
                } 
                }



    public boolean capitalCheck(){
        if(location.equalsIgnoreCase("islamabad")){
            return true;
        }
        return false;
    } 

    public boolean locationCheck(String location){
        if(this.location.equalsIgnoreCase(location)){
            return true;
        }
        return false;
    }
    
    // Copy Constructor
    public University( University U){
        this.uniName = U.uniName;
        this.location = U.location;
        this.rectorName = U.rectorName;
        
        for(int i=0;i<departments.length;i++){
            this.departments[i] = U.departments[i];
        }
    }

    // Equal Contents
    public boolean equals(University U){

        boolean uni = false, loc= false , rector = false, depart = false;

        if(U.uniName == this.uniName){
            uni = true;
        }
        if(U.location == this.location){
            loc = true;
        }
        if(U.rectorName == this.rectorName){
            rector = true;
        }

        for(int i=0;i<departments.length;i++){
            if(departments[i]!=null){
                if(U.departments[i]!=this.departments[i]){
                    depart = false;
                    break;
                }
                depart = true;
            
            }
        }

        if(uni && depart && loc && rector) return true;
        return false;
    }
    
    public University compareDepartments(University U){
        int counterThis = 0;
        int counterArg = 0;
        for(int i=0;i<this.departments.length;i++){
            if(this.departments[i]!=null){
                counterThis++;
            }
            if(U.departments[i]!=null){
                counterArg++;
            }
        }

        if(counterArg>counterThis) return U;
        return this;
    }
}
