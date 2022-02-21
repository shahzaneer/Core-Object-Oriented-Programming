public class Student {
    // properties
    String name;
    String reg_no;
    String [] courseRegistered = new String [5];

//  setters
    void setInfo(String nam,String regno,String [] courses){
        name = nam;
        reg_no = regno;
        for(int i = 0; i<courses.length;i++){
            courseRegistered[i]=courses[i];
        }

    }
    void setName(String nam){
        name = nam;
    }
    void setReg_no(String reg){
        reg_no = reg;

    }
    void setCourses(String [] courses){
        for(int i = 0; i<courses.length;i++){
            courseRegistered[i]=courses[i];
        }
    }

    // getters
    String geName(){
        return name;
    }
    String getReg_no(){
        return reg_no;
    }
    String [] getRegisteredCourses(){
        return courseRegistered;
    }

    // Displaying data 

    void displayInfo(){
        System.out.println("The Name of Student :"+geName());
        System.out.println("The Registration No of Student is "+getReg_no());
        System.out.println("The courses registered are :");
        for(int i=0; i<courseRegistered.length;i++){
            System.out.println(courseRegistered[i]);
        }
    }


        
    }

    
