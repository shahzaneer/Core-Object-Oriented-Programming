import java.util.Arrays;

public class University{

    String uniName;
    String location;
    String rectorName;
    String departments [] = new  String [5];


    University(){} //Default Constructor

    University(String UniName, String RectorName){
        // constructor with two parameters
        uniName = UniName;
        rectorName = RectorName;
    }

    University(String UniName, String RectorName,String Location,String [] depart){
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

    void setValues(String UniName, String RectorName,String Location,String [] depart){
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


    void addDepartment(String depName){

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


    void display(){
        System.out.println("The name is "+uniName);
        System.out.println("The location is "+location);
        System.out.println("The Rector Name is "+rectorName);

            for(int i=0;i<departments.length;i++){
                if(departments[i]!=null){
                    System.out.println(departments[i]);
                    }
                } 
                }



    boolean capitalCheck(){
        if(location.equalsIgnoreCase("islamabad")){
            return true;
        }
        return false;
    }            
    
}
