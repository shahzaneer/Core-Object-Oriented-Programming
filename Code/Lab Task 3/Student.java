public class Student {

    String name;
    double gpa;
    String [] subjects = new String [5];
    String email;

    Student(){

    }

    Student(String nam, double gp,String[] subj,String emil){
        name = nam;
        gpa = gp;

        for(int i=0;i<subjects.length;i++){
            subjects[i] = subj[i];
        }
        email = emil;

    }

    void setValues(String nam, double gp,String[] subj,String emil){
        name = nam;
        gpa = gp;

        for(int i=0;i<subjects.length;i++){
            subjects[i] = subj[i];
        }
        email = emil;

    }

    void display(){
        System.out.println("The name of Student is :"+name);
        System.out.println("The GPA of Student is :"+gpa);
        System.out.println("The Email Address is :"+email);
        System.out.println("The subjects are ");
        for(int i = 0 ;i<subjects.length;i++){
            System.out.println(subjects[i]);
        }

    }

    boolean searchSubjects(String subjectName){
        for(int i=0;i<5;i++){
            if(subjectName.equalsIgnoreCase(subjects[i])){
                return true;
            }
        }        
            return false;

    }

    boolean checkProbStatus(){
        if(gpa>=2.0){
            return false;
        }
        return true;
    }


    boolean validEmail(){
        if(email.contains("@")){
            if(email.contains("gmail") || email.contains("hotmail")){
                if(email.contains(".com") || email.contains(".org")){
                    return true;
                }
            }
        }

        return false;
    }
}
